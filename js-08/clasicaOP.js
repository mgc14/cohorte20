/* class OperacionesAritmeticas {
     numero0 = 0;
     numero1 = 0;
        sumar (a, b){
            return a + b;
        }
}

let obj1;
obj1 = new OperacionesAritmeticas(6,4);
console.log(obj1.sumar(2,6) );

let obj2 = new OperacionesAritmeticas(8,5);

console.log(obj2.sumar(5,6));
*/
 
class OperacionesAritmeticas {
    numero0 = 0;
    numero1 = 0;

    constructor (valor0, valor1){
    this.numero0 = valor0;
    this.numero1 = valor1;

    }
        sumar(a, b) {
            return a + b;
        }
}

let obj1 = new OperacionesAritmeticas();
console.log(obj1.sumar(2,6) );

let obj2 = new OperacionesAritmeticas();

console.log(obj2.sumar(5,6));
