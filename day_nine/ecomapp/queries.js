//Here we are setting up the configuration of your PostgreSQL connection
const Pool = require('pg').Pool;
const pool = new Pool({
    user:'postgres',
    host:'localhost',
    database:'ecomdb',
    password:'password',
    port:5432
});


//Get all users
const getUsers =(req,res)=>{
    pool.query('SELECT * FROM users ORDER BY id ASC',(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).json(results.rows);
    })
}

//Get single user by ID
const getUserById = (req,res)=>{
    console.log('type of req.params.id before parseInt is called ---',typeof(req.params.id));
    //converting string type id to integer or number type
    const id =parseInt(req.params.id);
    pool.query('SELECT * FROM users WHERE id=$1',[id],(error,results)=>{
        if(error){
            throw error;
        }
        res.status(200).json(results.rows);
    })
}

module.exports={
    getUsers,
    getUserById
}