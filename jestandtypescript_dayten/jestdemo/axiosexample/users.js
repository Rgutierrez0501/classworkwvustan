/**
 * This module retrieves data with axios from a json server in this example. 
 * We will test this module
 */
const axios = require('axios');

class Users {

     static async all() {
        let res = await axios.get('http://localhost:3000/users');
        return res;
      }
}

module.exports = Users;