//static :- a static property is shared among all instances of a class.
class EmployeeOne{
    private static headCount : number=0; // PI = 22/7=3.14
    constructor(
        private firstName :string,
        private lastName :string,
        private jobTitle :string){
            EmployeeOne.headCount++;
        }

        public static getHeadCount(){
            return EmployeeOne.headCount;
        }
}

let stefan = new EmployeeOne('Stefan','Riley','Front-end developer');
let shabana = new EmployeeOne('Shabana','mehr','Back-end developer');

console.log(EmployeeOne.getHeadCount());
console.log(Math.PI); // static properties
console.log(Math.abs(15.4));//static methods