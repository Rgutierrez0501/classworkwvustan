//Define the shape of the product objext using an interface
interface Product{
    id: number;
    name: string,
    price: number
}
//Explicitly use the Product type as the return type of the getProd() function
function getProd(id):Product{
    return {
        id : id,
        name : `Awesome Gadget ${id}`,
        price: 99.5
    }
}

const prod = getProd(1);
console.log(`The product ${prod.name} costs $${prod.price}`);