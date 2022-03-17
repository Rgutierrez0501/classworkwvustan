const Pool = require('pg').Pool;
const pool = new Pool({
    user:'postgres',
    host:'localhost',
    database:'ecomdb',
    password:'password',
    port:5432
});