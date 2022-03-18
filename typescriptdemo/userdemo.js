"use strict";
exports.__esModule = true;
var UserAccount_1 = require("./UserAccount");
var users = {
    name: "George",
    id: 1
};
console.log(users.name);
console.log(users.id);
var user = new UserAccount_1.UserAccount("Modi", 2);
console.log(user.id);
console.log(user.name);
