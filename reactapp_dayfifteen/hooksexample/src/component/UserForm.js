import React , { useState } from "react";
function UserForm(){

    const [allValues, setAllValues] = useState(
        {
        mobile: '',
        username: '',
        email: '',
        password: '',
        confirmPassword: ''
     }
     );

     const changeHandler = e => {
        console.log(e.target.name);
        console.log(e.target.value);
        setAllValues({...allValues, [e.target.name]: e.target.value})
     }

     return (
         <>
        <input type="text"
            className="form-control"
            id="mobile"
            name="mobile"
            placeholder="Enter a valid mobile number"
            onChange={changeHandler}
        />
     
      <input type="text"
            className="form-control"
            id="username"
            name="username"
            placeholder="Enter a user name"
            onChange={changeHandler}
        />
        </>
     );
}

export default UserForm;