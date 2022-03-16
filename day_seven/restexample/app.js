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
const port = 3001;

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));  

/**
 * Basic routing in express js---
 * Routing referes to determining how an application responds to a client request to a
 * particular endpoint,which is a URI (or Path) and a specific HTTP request method(GET,POST and so on).
 * Each route can have one or more handler functions, which are executed when the 
 * route is matched 
 * 
 * Route definition :
 *  app.Method(Path,Handler) ---  
 *  app is an instance of express 
 *    const express = require('express');
 *    const app = express();
 *  Method is an HTTP request method in lowercase.
 *  PATH is a path on the server ( or URI- uniform resource identfier)
 *  Handler is the function executed when the route is matched
 * 
 * */
//http://localhost:3000
// A single callback function can handle a route
app.get('/', (req, res) => {
  res.send('Hello World!') // sending a repsonse of various types
})
/**
app.get('/', function(req, res) {
  res.send('Hello World!');
})
 */

//http://localhost:3000/greet
app.get('/greet', (req, res) => {
    res.send('Hello World!')
  })

//http://localhost:3000/greet/George
app.get('/greet/:name', (req, res) => {
    console.log("Name:--",req.params['name']);
    console.log("Request Header--",req.headers);
    console.log("Hostname--",req.hostname);
    console.log("Http Version--",req.httpVersion);
    res.header('Age',24);
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
//http://localhost:3000/book
app.route('/book')
    .get((req,res)=>{
      //write the logic to retireve data from req and prepare res data
      // You can connect with database
      res.send('Get a random book on JS');
    })
    .post((req,res)=>{
      res.send('Add a book')
    })
    .put((req,res)=>{
      res.send('Update a book')
    })
    .delete((req,res)=>{
      res.send('Removed a book')
    })



app.use((req, res, next) => {
  console.log('Time:', Date.now())
  next()
})
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})