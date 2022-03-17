const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3001;
const queries = require('./queries');

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));

// http://localhost:3001
app.get('/',(req,res)=>{
    res.json({info: 'Example of Node.js Express and PostGres API'});
});

//http://localhost:3001/users
app.get('/users',queries.getUsers);
//http://localhost:3001/users/2
app.get('/users/:id',queries.getUserById);

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })

