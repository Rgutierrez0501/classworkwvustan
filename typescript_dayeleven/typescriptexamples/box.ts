// You don't need to explicitly tell JS the type. It will automatically infer the type from the value at run time
//Dynamic types offer flexibility.
let box;
console.log(typeof(box)); //undefined
box = "hello";
console.log(typeof(box)); //string
box=100;
console.log(typeof(box));  //number
