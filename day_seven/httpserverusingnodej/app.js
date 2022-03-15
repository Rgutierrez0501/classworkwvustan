//http module of node js is required here
const http = require('http');
//Hostname - localhost ip address is given
const hostname ='127.0.0.1';
//server will run on port 3000
const port = 3000;

//CreateServer using http modules createServer method
const server=http.createServer((req,res) => {
    res.statusCode=200;
    res.setHeader('Content-type','text/plain');
    res.end('Hello World');
});

//Server will listen http request 
server.listen(port,hostname,()=>{
    console.log(`Server running at http://${hostname}:${port}/`);
});