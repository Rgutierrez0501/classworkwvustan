const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3001;
const poolconn = require('./dbconnection');

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));

//verfiy Login Details
//http://localhost:3001/login
app.get('/login/:uName/:passcode',(req,res)=>{
    
    //converting string type id to integer or number type
    //Front end you have given uName and passcode
    console.log(req.params);
    console.log('Type of  uName----'+typeof(req.params.uName)+'----'+req.params.uName);

    const user_name =req.params.uName;
    const pass_word =req.params.passcode;

    //Below  query is to retrieve all columns from DB for usesr_name and result will be in resutls.rows
    poolconn.query('SELECT * FROM users WHERE username=$1',[user_name],(error,results)=>{
        if(error){
            throw error;
        }
        //logic to validate data from request param with data from DB
        console.log(results.rows[0].password)
        if((results.rows[0].password == pass_word ) ){
            res.status(200).json("Login Successful");
        }else{
            res.status(401).json("Username or Password doesn't match");
        }
        
       // res.status(200).json(results.rows);
    })
});


app.get('/userByName/:uName',(req,res)=>{

    const user_name =req.params.uName;
    poolconn.query('SELECT * FROM users WHERE username=$1',[user_name],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).json(results.rows);
    })
});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})
