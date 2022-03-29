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

    var { firstname, lastname,email,mobile,address } = document.forms[0];
    // axios.post(url).then((response)=>{}


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