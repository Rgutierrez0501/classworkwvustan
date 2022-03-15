const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000
// create application/json parser
var jsonParser = bodyParser.json()

// create application/x-www-form-urlencoded parser
var urlencodedParser = bodyParser.urlencoded({ extended: false })

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
app.post("/postInfo",urlencodedParser,(req,res) =>{
    console.log(req.body.greetings);
    res.send("Post request")
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})