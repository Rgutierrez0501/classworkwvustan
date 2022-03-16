var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

router.post('/addUser', function(req, res, next) {
  //You can play with the data which will be sent part of request
  res.send('respond with a resource');
});

module.exports = router;
