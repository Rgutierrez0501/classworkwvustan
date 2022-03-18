import type { User } from "./user";
import {UserAccount} from "./UserAccount";


const users:User ={
    name:"George",
    id:1,

};

console.log(users.name);
console.log(users.id);

const user:User = new UserAccount("Modi",2);
console.log(user.id);
console.log(user.name);