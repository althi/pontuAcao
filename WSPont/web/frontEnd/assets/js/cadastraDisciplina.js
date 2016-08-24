$(document).ready(function() {
    $('#discForm').submit(function(e){
        var id = document.getElementById("id").value;
        var nome = document.getElementById("nome").value;
        e.preventDefault();
        if(nome == '' || id == '') {
            alert("Preencha os campos") 
        } else {
            $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/WSPont/webresources/com.usuario/' + id,
                dataType: 'xml',
                error: function(){
                    console.log("oi");
                },
                success: function(response) {
                    if(response == null){
                        alert("Erro - Usuario Nao Identificado");
                    }else {
                        $(response).find('senha').each(function() {
                            if($(this)[0].innerHTML == nome){
                                window.location = 'http://localhost:8080/WSPont/inicial.html?matricula=' + id;
                                document.cookie = "matricula = " + id;
                                console.log(response);
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