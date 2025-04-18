/**	Crea un programa que cuente cuántos números pares e impares hay entre 1 y 50.
Imprime los resultados así: "Pares: X, Impares: Y". */

let pares = 0;
let impares = 0;

for (let i = 1; i <= 50; i++) {
  if (i % 2 === 0) {
    pares++;
  } else {
    impares++;
  }
}

console.log(`Pares: ${pares}, Impares: ${impares}`);