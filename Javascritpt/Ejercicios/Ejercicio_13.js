/**Crea un programa que determine si un año es bisiesto o no. */
/**✅ 2000: Es divisible por 4, por 100, y por 400 → Es bisiesto.
❌ 1900: Es divisible por 4 y por 100, pero NO por 400 → No es bisiesto.
✅ 2024: Es divisible por 4, pero no por 100 → Es bisiesto.
❌ 2023: No es divisible por 4 → No es bisiesto. */

/**📌 Reglas para saber si un año es bisiesto:
Un año es bisiesto si es divisible por 4.
Excepto si es divisible por 100, entonces NO es bisiesto.
A menos que también sea divisible por 400, en cuyo caso sí es bisiesto. */


let año = 2000;


if (año % 400 === 0) { 
    console.log("Bisiesto");  // Es divisible por 400 (bisiesto sí o sí)
} else if (año % 100 === 0) {
    console.log("No es Bisiesto");  // Divisible por 100 pero no por 400
} else if (año % 4 === 0) {
    console.log("Bisiesto");  // Divisible por 4 pero no por 100 (bisiesto normal)
} else {
    console.log("No es Bisiesto");  // No es divisible por 4
}

