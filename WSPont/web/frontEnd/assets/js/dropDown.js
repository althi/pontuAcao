var carregaLista = function (){
    $('#listaDisc').html("");
        $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/WSPont/webresources/com.disciplina/',
                dataType: 'xml',
                error: function(){
                    console.log("oi");
                },
                success: function(response) {
                    var vetDisc = [];
                    var i = 0; 
                    $(response).find('nomeDisc').each(function() {
                        vetDisc[i] = $(this)[0].innerHTML;
                        i++;
                    });
                    
                    for(var j=0;j<vetDisc.length;j++){
                        $('#listaDisc').append('<li><a>'+vetDisc[j]+'</a></li>');
                    }
                }
            });
            return false;
    };
   

var carregaTable = function (){
    $('#tableDisc').html("");
        $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/WSPont/webresources/com.disciplina/',
                dataType: 'xml',
                error: function(){
                    console.log("oi");
                },
                success: function(response) {
                    var vetDisc = [];
                    var i = 0; 
                    $(response).find('nomeDisc').each(function() {
                        vetDisc[i] = $(this)[0].innerHTML;  
                        i++;
                    });
                    
                    var vetIdDisc = [];
                     var k = 0; 
                    $(response).find('idDisciplina').each(function() {
                        vetIdDisc[k] = $(this)[0].innerHTML;  
                        i++;
                    });                   
                    
                    for(var j=0;j<vetDisc.length;j++){
                        $('#tableDisc').append('<tr><td>'+vetIdDisc[j]+'</td><td>'+vetDisc[j]+ '</td><td><button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button><button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button></td></tr>');
                    }
                }
            });
            return false;
    };
    
    
  
 
var deletaDisc = function (){
    $('#tableDisc').html("");
        $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/WSPont/webresources/com.disciplina/',
                dataType: 'xml',
                error: function(){
                    console.log("oi");
                },
                success: function(response) {
                    var vetDisc = [];
                    var i = 0; 
                    $(response).find('nomeDisc').each(function() {
                        vetDisc[i] = $(this)[0].innerHTML;  
                        i++;
                    });
                    
                    var vetIdDisc = [];
                     var k = 0; 
                    $(response).find('idDisciplina').each(function() {
                        vetIdDisc[k] = $(this)[0].innerHTML;  
                        i++;
                    });                   
                    
                    for(var j=0;j<vetDisc.length;j++){
                        $('#tableDisc').append('<tr><td>'+vetIdDisc[j]+'</td><td>'+vetDisc[j]+ '</td><td><button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button><button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button></td></tr>');
                    }
                }
            });
            return false;
    };
    
    