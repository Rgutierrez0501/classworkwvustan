const express = require('express');// including express module in our js file
const bodyParser = require('body-parser');// including body-parser module in our js file
const app = express();//instance of an express
const port = 3001;// 
const poolconn = require('./databaseconn');
const path = require('path');

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));

app.get('/users',(req,res)=>{
    poolconn.query('SELECT * FROM users ORDER BY id ASC',(error,results)=>{
        if(error){
            throw error;
        }
        //res.status(200).json(results.rows);
        res.render('users',{userlist:results.rows});
    })
});

app.get('/home',(req,res)=>{
    res.render('home',{title: 'Home Page'});
  });

 app.get('/',function(req,res) {
    res.sendFile(path.join(__dirname+'/views/index.html')); // From express js we are sending index.html file to the browser
  });


  app.get('/login',(req,res)=>{
    res.render('login',{title: 'Login Page'});
  });
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })


