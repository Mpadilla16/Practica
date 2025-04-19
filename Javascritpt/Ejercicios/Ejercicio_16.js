/**Imprime todos los números entre 1 y 100 que sean divisibles por 3 y por 7 al mismo tiempo */

let i = 0;

for ( i; i <=100; i++ ){
    if (i % 3 ===0 && i % 7 ===0) {
        console.log(i);
    }

}