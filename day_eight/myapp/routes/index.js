var express = require('express');
var router = express.Router();
const path = require('path');

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
router.get('/', function(req, res, next) {
  console.log("The response will be send by the next function...")
  next()
},
  (req,res)=>{
    res.render('index', { title: 'Express' }); // render a view template
});

//http://localhost:3000/usingHtml
router.get('/usingHtml',function(req,res) {
  res.sendFile(path.join(__dirname+'/index.html')); // From express js we are sending index.html file to the browser
});
//http://localhost:3000/home
router.get('/home',(req,res)=>{
  res.render('home',{title: 'Home Page'});
});
module.exports = router;
