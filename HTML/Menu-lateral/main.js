/**Ejecutar funcion evento click */
document.getElementById("btn_open").addEventListener("click", open_close_menu)
//Declarar variables//
var menu_side = document.getElementById("menu_side");
var btn_open = document.getElementById("btn_open");
var body = document.getElementById("body")

//Evento para mostrar y coltar el menu//
function open_close_menu(){
    body.classList.toggle("body_move");
    menu_side.classList.toggle("menu__side_move");

}