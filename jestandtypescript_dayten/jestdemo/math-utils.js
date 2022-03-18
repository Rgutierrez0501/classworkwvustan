/**
 * beforeAll function is part of a test setup.
 * It runs a function before any of the tests in this file run.
 * If the function returns a promise or is a generator, Jest waits for that promise to 
 * resolve befor running tests.
 */

const sum =(vals)=>{
    let sum =0;
    vals.forEach((val)=>{
        sum+=val;
    });
    return sum;
}

const positive =(vals)=>{
    return vals.filter((x) => {
        return x>0;
    });
}

const negative =(vals)=>{
    return vals.filter((x) => {
        return x<0;
    });
}


module.exports={sum,positive,negative};