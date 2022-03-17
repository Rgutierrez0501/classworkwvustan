const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3001;

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({
    extended:true
}));

// http://localhost:3001
app.get('/',(req,res)=>{
    res.json({info: 'Example of Node.js Express and PostGres API'});
});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })