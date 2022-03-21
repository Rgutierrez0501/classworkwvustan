//Explicitly use the Product type as the return type of the getProd() function
function getProd(id) {
    return {
        id: id,
        name: "Awesome Gadget ".concat(id),
        price: 99.5
    };
}
var prod = getProd(1);
console.log("The product ".concat(prod.name, " costs $").concat(prod.price));
