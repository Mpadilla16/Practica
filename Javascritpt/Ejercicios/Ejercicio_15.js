/**Crea un programa que reciba dos números y un operador (+, -, *, /) y muestre el resultado de la operación. */

console.log("ingrese 2 numeros y el signo de la operacion  basica que desea que se realice")
let numero1 =32;
let numero2 = 5;

let signo = "+";
 
let mat  ;

if ( signo == "+" ) {
    console.log((mat = numero1 + numero2) );
    
} else if ( signo == "-"){
    console.log((mat = numero1 - numero2));
} else if ( signo == "*"){
    console.log((mat = numero1 * numero2));
 }else {
    console.log((mat = numero1 / numero2));
 }