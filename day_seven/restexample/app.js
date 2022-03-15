/**
 * 1. create folder or directory with proper name 
 * 2. npm init -y
 * 3. npm install express
 * 4. npm install body-parser
 * 5. Run the js file using "node app.js"
 */
const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));  

//http://localhost:3000
app.get('/', (req, res) => {
  res.send('Hello World!')
})

//http://localhost:3000/greet
app.get('/greet', (req, res) => {
    res.send('Hello World!')
  })

//http://localhost:3000/greet/George
app.get('/greet/:name', (req, res) => {
    console.log("Name:--",req.params['name']);
    res.send('Hello '+req.params['name']+' !');
  })


//http://localhost:3000/info
app.get('/info', (req, res) => {
    console.log(req.params);
    //Before sending the response you can data or model from DB or another layer in your app
    res.send('I am handling http request get method with url /info')
  })
//http://localhost:3000/postInfo
app.post("/postInfo",(req,res) =>{
    console.log("---"+req);
    console.log(req.body);
    res.send("Post request---"+req.body.greetings);
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})