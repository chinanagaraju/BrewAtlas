import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Registration() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPass] = useState("");
const navigate=useNavigate();

  async function save(event) {
    event.preventDefault();
    try {
      const response = await axios.post("http://localhost:8080/brewery/save", {
        name: name,
        email: email,
        password: password,
      });
      alert("Registration Successfully, try to login");
      console.log("Server Response:", response.data);
      // window.location.href = '/Login'; // Use window.location.href to navigate to the desired route
    } catch (error) {
      console.error("Error:", error);
      alert("Request failed. Check console for details.");
    }
  }
  
  return (
    <div className="regi">
      <div className="Registraion">
        <div className="card">
          <h1>Registartion Page</h1>
        </div>
        <form className="Form-id">
          <div className="Form-Registraton">
            <label> name</label>
            <input
              type="text"
              className="form-control"
              id="username"
              placeholder="name"
              value={name}
              onChange={(event) => setName(event.target.value)}
            />
          </div>
          <div className="Form-Registraton">
            <label>Email</label>
            <input
              type="text"
              className="form-control"
              id="useremail"
              placeholder="Enter email"
              value={email}
              onChange={(event) => setEmail(event.target.value)}
            />
          </div>
          <div className="Form-Registraton">
            <label>Password</label>
            <input
              type="password"
              className="form-control"
              id="userpassword"
              placeholder="Enter password"
              value={password}
              onChange={(event) => setPass(event.target.value)}
            />
          </div>

          <button type="submit" className="btn-control" onClick={save}>
            Register
          </button>
          <button type="submit" className="btn-control" onClick={()=>navigate("/")}>
       Login
          </button>
         
        </form>
      </div>
    </div>
  );
}

export default Registration;
