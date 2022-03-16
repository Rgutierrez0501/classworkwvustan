const express = require('express')
const app = express()
const port = 3002;
//Application level middleware 
app.use((req, res, next) => {
    console.log('Time:', Date.now())
    next()
  })
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
}) 


