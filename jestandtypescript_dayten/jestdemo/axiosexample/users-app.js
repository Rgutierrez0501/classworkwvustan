/**
 * users-app.js is the application that uses users.js module to get and output
 * data
 */

 const Users = require('./users');

 async function showData() {
     let res = await Users.all();
     console.log(res.data);
 }
 
 showData();
 console.log('finished')