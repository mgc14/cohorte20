//PRopiedades de arreglos
//LENGTH

const frutas = ["fresa","Pera", "guayaba" ];
console.log(frutas);

console.log(frutas.length);

//Metodos-acciones
//Push()

frutas.push("Sandia");
console.log (frutas);

let num = frutas.push("SAndia","limonn");
console.log(frutas);


//Push (agrega al final)
 //unshift( - agrega al inicio
 frutas.unshift("guanabana");
 console.log(frutas);

 //Metodos para quitar pop()   --- quita un elemnto del final

let elemento = frutas.pop();
console.log(frutas);
console.log(elemento);
 

//shift() elimina uno al principio

frutas.shift();
console.log(frutas);
console.log("SAndia");


//indexOf() buscar algun elemento como si fuera base de datos
//ES con Mayuscula la O.
//escribe -1 si no existe.


console.log(frutas.indexOf("Manzana"));
console.log( )

 //reverse()   invierte el orden de los elementos.
frutas.reverse();
 console.log(frutas);

 frutas.reverse();
 console.log(frutas);


 /* const arreglo

 console.log(arreglo);
 arreglo[4].reverse( );
 console.log (arreglo); */

 //sort() por orden alfabetico
 frutas.sort();
 console.log(frutas);


 const numeros = [4, 567, 2, 4566, 45, 78, 1];
 numeros.sort();
 console.log(numeros);
 

 //numeros.sort((a,b) => a -b);
//funcion callback



const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//Escribe un comando para remover a "Dani" del arreglo

personas.splice(1, 1);
console.log(personas);

//Escribe un comando para remover a "Juan del arreglo"
//splice, anadir, borrar elementos, la sintaxis es (en donde se encuentra el dato, cuantos datos vas a borrar (o en su defecto, si vas a agregar uno o mas))
personas.splice(2, 1);
console.log(personas);

//Escribe un comando para agregar a "Luis" al inicio del arreglo

personas.unshift( "Luis");
console.log(personas);

/*otra forma de agregarlo en primer lugar
personas.splice(0, 0, "Luis")
console.log(personas); en ese caso, si lo pone al principio*/


//Escribe el comando para agregar tu nombre al final del arreglo
personas.push("Mag");
console.log(personas);
//Escribe el comando para mostrar la posición de "Maria"
personas.indexOf("Maria");
console.log("personas");
//    indexOf()
personas.indexOf("Maria");
console.log(personas.indexOf("Maria"));
//Escribe el comando para mostrar la posición de tu nombre
personas.indexOf("Mag");
console.log(personas.indexOf("Mag"));


