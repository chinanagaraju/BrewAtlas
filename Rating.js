import axios, { Axios } from "axios";
import { useEffect, useState } from "react";

function Rating() {
    const [feedback, setFeedback]=useState("");
    const [rating, setRating]=useState("");
    const [message, setMessage]=useState("");
    const [data,setData] =useState([]);
   function save(){

        axios.post("http://localhost:8080/userfeedback/feedback",
            {
                feedback: feedback,
                rating: rating

            })
            .then(res=>{
                setMessage(res.data.rating)
             
            })
            .catch(error=>{
                console.log(error)
            })
    }
    console.log(message)
    useEffect(()=>{
        axios.get("http://localhost:8080/userfeedback/feedback")
        .then(response=>{
            console.log(response.data)
            setData(response.data)
        })
        .catch(error=>{
            console.log(error)
        })

    },[])
       
console.log(data)
    return (
        <div>
            <div className="res">   
            <form>         
             <div className="Form-next">
                
                <textarea
                    type="text"
                    className="rating-control"
                    id="rating-id"
                    placeholder="feedback"
                    value={feedback}
                    onChange={(event) => setFeedback(event.target.value)}
                />

            </div>   
            <div className="Form-next">
                <select  placeholder="rating"
                    value={rating}
                    onChange={(event) => setRating(event.target.value)}>
                          <option>select rating</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                   
                </select>
            </div>
          
            <button type="submit" className="btn" id="btn" onClick={save}>submit</button>
            </form>
            </div>
            <div>
    
                {/* {Array.isArray(data)&&data.map((data,index)=>(
                    <li key={index}>{data.feedback} {data.rating}</li>
                ))} */}

            </div>


        </div>
                

)
}
export default Rating;