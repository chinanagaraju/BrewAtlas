import axios from "axios";
import { useEffect, useState } from "react";
import Rating from "./Rating";


function Next() {
    const [param, setParam]=useState("");
 
  
    const [record, setRecord] =useState([]);

    const [ideal,setIdeal]=useState([]);
    useEffect( ()=>{
    axios.get("https://api.openbrewerydb.org/v1/breweries")
        .then((res)=>{
            setIdeal(res.data)
           })
         
        .catch(error=>{
            console.log(error);
        });

    },[]);

     
       
   
    useEffect(()=>{
        if(param==""){
          setRecord(ideal)

        }
        else{
            const temp=[];
            
       ideal.map((value,index)=>{
            if(value.city.toLowerCase().includes(param.toLowerCase())|| value.name.toLowerCase().includes(param.toLowerCase())||
            value.brewery_type.toLowerCase().includes(param.toLowerCase()||value.id.toLowerCase().includes(param.toLowerCase()))){
              temp.push(value);
              console.log(value.city,value.name);
            }
            
        })

        setRecord(temp)
    }
    },[param])
 
   

    return (
        <div className="next">
            <div className="Next">
                <form className="Next-id">
                    <div className="Form-next">

                        <input
                            type="text"
                            className="next-control"
                            id="next-id"
                            placeholder="Search"
                            value={param}
                            onChange={(event) => setParam(event.target.value)}
                        />
                        
                    </div>               
                  
                </form>
            </div>
            <div className=" next-table">
               <table className="table">
                <thead className="head">
                {(Array.isArray(record) &&param)&&(
                    <tr>
                
                    <th className="box">brewery_name</th>
                    <th className="box">brewery_address</th>
                    <th className="box">phone</th>
                    <th className="box">website_url</th>
                    <th className="box">current rating</th>
                    <th className="box">state,city</th>
                    </tr>
                )}
                </thead>
                <tbody className=" header">
                    {(Array.isArray(record) &&param)&&
        record.map((item, index) => (
          <tr key={index}>                   
                       
                        <td>{item.name}</td>
                        <td>{item.address_1}</td>
                        <td>{item.phone}</td>
                        <td>{item.website_url}</td>
                        <td>{item.current}</td>
                        <td>{item.state},{item.city}</td>
                    </tr>
                    ))}
                </tbody>
               </table>                     
             </div>
             <div className=" footer">
                <Rating/>
             </div>
          
                        </div> );
  }
  

export default Next;
