/**	Crea un programa que imprima todos los números del 1 al 20.
	Si el número es múltiplo de 3, muestra "Fizz" en lugar del número.
	Si es múltiplo de 5, muestra "Buzz".
Si es múltiplo de 3 y 5, muestra "FizzBuzz". */

/**or cada número, verifique si cumple alguna de estas condiciones:

Si es múltiplo de 3, imprimir "Fizz".

Si es múltiplo de 5, imprimir "Buzz".

Si es múltiplo de 3 y 5 (es decir, múltiplo de 15), imprimir "FizzBuzz".

Si no cumple ninguna de esas condiciones, imprimir el número como está. */

let i;

for (i = 0; i < 21; i++){
    if (i % 3 === 0 && i % 5 === 0) {
        console.log("FizzBuzz");
        
    } else if (i % 3 === 0){
        console.log("Fizz")
    } else if (i % 5 === 0 ){
        console.log("Buzz");
    }else{
        console.log(i)
    }

}