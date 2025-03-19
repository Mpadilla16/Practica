alert ("Este programa solicita al usuario que ingrese el día de la semana. Según la respuesta, realiza una verificación");

/*Definir variables peticion de informacion al usuario*/ 
let dia = prompt ("Ingrese que dia es hoy").toLowerCase();

/*proceso */

if (dia === "sabado" || dia === "domingo") {
    alert("!Buen Fin de Semana");
} else  {
    alert("!Buena Semana");
}

