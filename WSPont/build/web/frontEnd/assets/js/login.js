$(document).ready(function() {
    $('#login-form').submit(function(e){
        console.log(document.getElementById("matricula").value);
        console.log(document.getElementById("senha").value);
    }); 
});