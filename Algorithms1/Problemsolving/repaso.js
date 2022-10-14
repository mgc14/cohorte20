//Adicion

function suma(){
let num1 = 1;
let num2 = 2;
let resultado = (num1 + num2);
return (resultado);
}
console.log("La suma de 1 + 2 =" + suma());



let x = 200 + 50;
console.log("La suma de 200 + 50 es:" + x);

let z = 500 - 45;
console.log("La resta de 500-45 es:" + z);

let i = 200 / 5;
console.log("La divison entre 200 y 5 es:" + i)

let e = 5 % 2;
console.log("El residuo entre 5 y 2 es:" + e)

function edad () {
    let miEdad = 18;
    if (miEdad >= 18){
        console.log ("Eres mayor de edad");
    } else {console.log ("No eres mayor de edad");}


}
edad()

function conjunciones() {
    let valor1 = false;
    let valor2 = true;
    if (valor1 && valor2) {
        console.log("El valor 1 y el valor 2 son verdaderos");

    } else {
        console.log("Un valor es falso");

    }
}
conjunciones();

function disfunction(){
    let valor1 = false;
    let valor2 = true;
    if (valor1 || valor2 ){
        console.log ("El operador or es verdadero");
    } else {
        console.log("El operador or es falso");
    }
}
disfunction();

function negacion(){
    let valor1 = true;
    if(!valor1){
        console.log("El valor es " + valor1);

    }else{
        console.log("El valor es " + valor1);

    }
}
negacion();
/*El ! es para que se vuelva falso*/

