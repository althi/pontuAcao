$(document).ready(function() {
        function getQueryParams(qs) {
        qs = qs.split('+').join(' ');
        var params = {},
            tokens,
            re = /[?&]?([^=]+)=([^&]*)/g;
        while (tokens = re.exec(qs)) {
            params[decodeURIComponent(tokens[1])] = decodeURIComponent(tokens[2]);
        }
        return params;
    }
    var allcookies = document.cookie.split(";");
    var r = allcookies[0];
    var res = r.split("=");
    var mat = res[1];
    
    $.ajax({
        type: 'GET',
        url: 'http://192.168.0.107:8080/WSPont/webresources/com.usuario/' + mat,
        dataType: 'xml',
        error: function() {
        },
        success: function(response) {
            $(response).find('nome').each(function() {
                console.log($(this)[0].innerHTML);
                $('#avatarNome').html($(this)[0].innerHTML);
            });
        }
    });
    
    $.ajax({
        type: 'GET',
        url: 'http://192.168.0.107:8080/WSPont/webresources/com.servidor/' + mat,
        dataType: "xml",
        error: function() {
            console.log("oi");
        },
        success: function(response) {
            var aprovacao, freqAula, freqPesquisa, freqBiblioteca, curso, palestra, reprovacao;
            $(response).find('aprovacao').each(function() {
                aprovacao = ($(this)[0].innerHTML);
            });
            $(response).find('freqAula').each(function() {
                freqAula = ($(this)[0].innerHTML);
            });
            $(response).find('freqPesquisa').each(function() {
                freqPesquisa = ($(this)[0].innerHTML);
            });
            $(response).find('freqBiblioteca').each(function() {
                freqBiblioteca = ($(this)[0].innerHTML);
            });
            $(response).find('partiCurso').each(function() {
                curso = ($(this)[0].innerHTML);
            });
            $(response).find('partiPalestra').each(function() {
                palestra = ($(this)[0].innerHTML);
            });
            $(response).find('reprovacao').each(function() {
                reprovacao = ($(this)[0].innerHTML);
            });
            
            var somaExt = +palestra + +curso;
            var somaEns = +aprovacao + +freqBiblioteca + +freqAula - +reprovacao;
            var somaPesq = + +freqPesquisa;
            var total = +aprovacao + +freqPesquisa + +freqBiblioteca + +freqAula + +palestra + +curso + -reprovacao;
            console.log("Extensao: " + somaExt);
            console.log("Pesquisa: " + freqPesquisa);
            console.log("FreqAula: " + freqAula);
            
            var restante = 100 - +freqAula;
            var doughnutData = [{value: +freqAula, color:"#68dff0"},{value : restante, color : "#fdfdfd"}];
            var myDoughnut = new Chart(document.getElementById("serverstatus01").getContext("2d")).Doughnut(doughnutData);
            $('#freqAula').html(freqAula + '%');
            $('#pontEnsino').html('Ensino: ' + somaEns);  
            $('#pontExt').html('Extensão: ' + somaExt);
            $('#pontPesq').html('Pesquisa: ' + somaPesq);
            $('#pontuacaoTotal').html('Total: ' + total);
        }
    });
});