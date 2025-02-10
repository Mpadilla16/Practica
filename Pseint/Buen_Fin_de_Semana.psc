Algoritmo Buen_Fin_de_Semana
	Escribir 'Este programa solicita al usuario que ingrese el día de la semana'
	Escribir 'Por favor digite el dia de la semana'
	// Definir variables pedir informacion al usuario//
	Definir dia Como Cadena
	Leer dia
	// Convertir el día a minúsculas para evitar problemas con mayúsculas
	dia <- MINUSCULAS(dia)
	Si dia='sabado' O dia='domingo' Entonces
		Escribir '¡Buen fin de semana!'
	SiNo
		Escribir '¡Buena semana!'
	FinSi
FinAlgoritmo
