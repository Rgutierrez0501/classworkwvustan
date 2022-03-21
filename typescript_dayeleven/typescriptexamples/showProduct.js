function getProduct(id){

    return {
        id : id,
        name : `Awesome Gadget ${id}`,
        price: 99.5
    }
}

const showProduct =(name,price) => {
    console.log(`The product ${name} costs $${price}`);
}


const product = getProduct(1);
 // Here we are passing the arguments in the wrong order. 
 //this is another common probliem that you often have when working with JS
 //Output :-- The product 99.5 costs $Awesome Gadget 1`
showProduct(product.price,product.name);