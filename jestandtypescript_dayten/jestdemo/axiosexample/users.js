/**
 * This module retrieves data with axios from a json server in this example. 
 * We will test this module
 */
const axios = require('axios');

class Users {

     static async all() {
       // making an call to an api 
        let res = await axios.get('http://localhost:3001/users');
        return res;
      }
}

module.exports = Users;