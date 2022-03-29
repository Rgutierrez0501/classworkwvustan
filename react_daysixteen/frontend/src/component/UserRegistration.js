import React, { useState} from "react";
import { Link,Outlet } from "react-router-dom";
import "../../src/styles.css";
import axios from 'axios';

function UserRegistration() {

    // React States
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState();
  

  const errors = {
    uname: "invalid username",
    pass: "invalid password"
  };

  const handleSubmit = (event) => {
    
    //Prevent page reload
    event.preventDefault();

    var { username, password,firstname, lastname,email,mobile,address } = document.forms[0];

    let userDetails ={
        username: username.value,
        password: password.value,
        firstname: firstname.value,
        lastname : lastname.value,
        email : email.value,
        mobile : mobile.value,
        address : address.value

    };
    //TODO -- URL -- http://localhost:3001/registeruser and pass data in request body
    axios.get(`http://localhost:3001/userByName/${username.value}`).then((response) => {
       let  userData=response.data;
       if(userData){
           setErrorMessages({ name :"username", message: errors.username});
       }else{
        axios.post(`http://localhost:3001/registeruser`,userDetails).then((response)=>{
            setIsSubmitted(true);
        })
       }
    });
    
  };

  const renderErrorMessage = (name) =>
  name === errorMessages.name && (
    <div className="error">{errorMessages.message}</div>
  );

    /***/

    const renderForm = (
        <div className="form">
          <form onSubmit={handleSubmit}>
             <div className="input-container">
              <label>User Name </label>
              <input type="text" name="username" required />
              {renderErrorMessage("uname")}
            </div>
            <div className="input-container">
              <label>Password </label>
              <input type="pass" name="password" required />
              {renderErrorMessage("pass")}
            </div>
            <div className="input-container">
              <label>First Name </label>
              <input type="text" name="firstname" required />
              {renderErrorMessage("uname")}
            </div>
            <div className="input-container">
              <label>Last Name </label>
              <input type="text" name="lastname" required />
              {renderErrorMessage("pass")}
            </div>
            <div className="input-container">
              <label>Email  </label>
              <input type="text" name="email" required />
          
            </div>
            <div className="input-container">
              <label>Mobile  </label>
              <input type="text" name="mobile" required />
          
            </div>

            <div className="input-container">
              <label>Address  </label>
              <input type="text" name="address" required />
          
            </div>
            <div className="button-container">
              <input type="submit" />
            </div>
            <div>
                <nav>
               
                        <Link to="/home"> Home</Link>
               
                </nav>
                <Outlet />
            </div>
          </form>
        </div>
      );
    return(

    <div className="app">
      <div className="login-form">
        <div className="title">User Registration</div>
        {isSubmitted ? 
                     <div>User Registered successfully </div>   
        : renderForm}
      </div>
    </div>
    );

}



export default UserRegistration;