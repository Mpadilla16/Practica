/**Crea un programa que sume todos los números impares entre 1 y 100. */
let i;
let suma = 0;

for (i = 0; i <= 100; i++) {
    if (i % 2 !== 0) {
        suma += i;
    }    
}

console.log(suma);