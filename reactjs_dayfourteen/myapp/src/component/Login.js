import {useState} from 'react';
//<button onClick={((x)=> setUserName(x.target.value))}> Submit</button> <button> Reset</button>
function Login(){
    //const {userName, setUserName, password, setPassword} = useState("");
    const {userName,password}= "";
     const  handleSubmit = ()=>{

        alert('userName',this.userName);
    }
    /**
    function resetForm(){
        alert('cleared the form');
    } */
    return (
        <form onSubmit={handleSubmit()}>
                <label>UserName:</label> <input type="text"  name ="userName" value={this.userName}/>
                <label>Password:</label> <input type="text" name="password"/>
                <button type="submit">Submit</button><button type="submit">Reset</button>
        </form>
    );
}

export default Login;