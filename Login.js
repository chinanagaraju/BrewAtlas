import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import Next from "./Next";




function Login() {
  const [email, setEmail] = useState("");
  const [password, setPass] = useState("");
  const navigate=useNavigate();

  async function handleResponse(response) {
    if(response.data.message==="succesfully login"){
        alert("succesfully login");
        navigate("/home");
    }
    else if(response.data.message==="login failed"){
        alert("login failed");
    }
    else if(response.data.message==="Password Doesn't match"){
        alert("Password Doesn't match");
    }
    else if(response.data.message==="Email doesn't  matched"){
        alert("Email doesn't  matched");
    }else{
        alert("check credentials");
    }
  
  }

  async function handleLogin(event) {
    event.preventDefault();
    try {
      const response = await axios.post("http://localhost:8080/brewery/login", {
        email: email,
        password: password,
      });
      handleResponse(response);
      console.log(response.data);
    
    
    } catch (error) {
      alert("Request failed. Check console for details.");
    }
  }

  return (
    <div>
      <div className="Login">
        <div className="log-card">
          <h1>Login Page</h1>
        </div>
        <form className="Form-id">
          <div className="Form-Login">
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
          <div className="Form-Login">
            <label>Password</label>
            <input
              type="password" // Change the input type to "password"
              className="form-control"
              id="userpassword"
              placeholder="Enter password"
              value={password}
              onChange={(event) => setPass(event.target.value)}
            />
          </div>
          <button type="submit" className="btn-control" onClick={handleLogin}>
            Log in
          </button>
          <button type="submit" className="btn-control" onClick={()=>navigate("/Registration")}>
          Registration
          </button>
        </form>
      </div>
    </div>
  );
}

export default Login;
