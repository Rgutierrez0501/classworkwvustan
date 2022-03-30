const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3001;
const poolconn = require('./dbconnection');
const cors = require('cors');

app.use(cors());
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
        /**
        console.log(results.rows[0].password)
        if((results.rows[0].password == pass_word ) ){
            res.status(200).json("Login Successful");
        }else{
            res.status(401).json("Username or Password doesn't match");
        }*/

        
       // res.status(200).json(results.rows);
       if(results.rowCount>0){
           //username found
        res.status(200).json(results.rows);
       }else{
        res.status(200).json(null);
       }


    })
});

//http://localhost:3001/userByName/user1
app.get('/userByName/:uName',(req,res)=>{

    const user_name =req.params.uName;
    poolconn.query('SELECT * FROM users WHERE username=$1',[user_name],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).json(results.rows);
    })
});
//http://localhost:3001/roleById/1
app.get('/roleById/:roleid',(req,res)=>{
    const role_id = req.params.roleid;
    poolconn.query('SELECT * FROM role WHERE roleid=$1',[role_id],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).json(results.rows);
    })
});

//http://localhost:3001/registeruser
app.post('/registeruser',(req,res)=>{
    let {username,password,firstname,lastname,email,mobile,address} = req.body;
    poolconn.query('INSERT INTO user_details (firstname,lastname,email,mobile,address) VALUES ($1, $2,$3,$4,$5,$6) RETURNING uniqueid', 
    [firstname,lastname,email,mobile,address], (error, results) => {
        if(error){
            throw error;
        }
        let id = results.rows[0].uniqueid;
        poolconn.query('INSERT INTO users (userid,username,password,roleid) VALUES ($1, $2,$3,$4)', 
        [id,username,password,2], (error, results) => {
            if(error){
                throw error;
            }
        res.status(201).send(`User added with ID: ${id}`);
    });
    });   
})

//http://localhost:3001/deleteuser/3
app.delete('/deleteuser/:userid',(req,res)=>{
    console.log(req.params.userid)
    let userid = req.params.userid;
    //delete from users where userid=$1
    poolconn.query('DELETE FROM users WHERE userid=$1',[userid],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).send(`User id: ${userid} deleted`);
    });
});

/**
 * POST is used to send data to a server to create / update a resource
 * PUT is used to send data to a server to create / update a resource
 * PUT requests are idempotent, means calling the same PUT request multiple times will
 * always produce the same result.
 * 
 * In constrast,calling the POST request repeatedly have side effects of creating the resource
 * multiple times 
 */
//http://localhost:3001/updateuserdetails
app.put('/updateuserdetails',(req,res)=>{
    let {userid,mobile,address} = req.body;
   //INSERT or UPDATE SQL statements we can use to create or update record in table respectively
    poolconn.query('UPDATE user_details SET mobile=$1,address=$2 WHERE id=$3',[mobile,address,userid],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).send(`User id: ${userid} details are updated`);
    });
});
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})
