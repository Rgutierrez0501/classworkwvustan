//Problem with dynamic types
function getProduct(id){

    return {
        id : id,
        name : `Awesome Gadget ${id}`,
        price: 99.5
    }
}

const product = getProduct(1);// making a call to function
/**
 * Referencing a property that doesn't exist on the object is a common issue when working in JS.
 */
//Error property Name is undefined 
console.log(`The product ${product.Name} costs $${product.price}`);
//console.log(`The product ${product.name} costs $${product.price}`);
