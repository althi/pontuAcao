$(document).ready(function() {
    $('#login-form').submit(function(e){
        var mat = document.getElementById("matricula").value;
        var senha = document.getElementById("senha").value;
        e.preventDefault();
        if(senha == '' || mat == '') {
            alert("Preencha os campos") 
        } else {
            $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/WSPont/webresources/com.usuario/' + mat,
                dataType: 'xml',
                success: function(response) {
                    if(response == null){
                        alert("Erro - Usuario Nao Identificado");
                    }else {
                        $(response).find('senha').each(function() {
                            if($(this)[0].innerHTML == senha){
                                window.location = 'http://localhost:8080/WSPont/inicial.html?matricula=' + mat;
                                document.cookie = "matricula = " + mat;
                            } else {
                                alert("Senha Incorreta");
                            }
                        });
                    }
                }
            });
            return false;
        }
    }); 
});