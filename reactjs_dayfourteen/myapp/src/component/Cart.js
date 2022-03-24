import Product from "./Product";
function Cart(){
    //Hard Coded value
    const products = [
            {sku:1,description:'iPhone 13 Pro Max',quantity:2},
            {sku:2,description:'iPhone 13 Pro Max charger ',quantity:1},
            {sku:3,description:'iPhone 13 Pro Max charger USB cable',quantity:2}
    ];

    return (
        <>
        <h2>Below items added in your cart :</h2>
        <ul>
                    {
                        products.map(
                                (product) => <Product key={product.sku} description={product.description} quantity={product.quantity}/>
                            )
                    }
                </ul>
        </>
    );
}

export default Cart;