const express= require('express');
const cookieParser = require('cookie-parser');
const session =require('express-session');

const app = express();

app.use(cookieParser());
app.use(session({secret: 'Shh, its a secret!'}));

app.get('/',(req,res)=>{
    if(req.session.page_views){
        req.session.page_views++;
        res.send("You visited this page for the first time");
    }
});