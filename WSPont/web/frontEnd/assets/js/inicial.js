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
        url: 'http://localhost:8080/WSPont/webresources/com.usuario/' + mat,
        dataType: 'xml',
        error: function() {
        },
        success: function(response) {
            $(response).find('nome').each(function() {
                $('#avatarNome').html($(this)[0].innerHTML);
            });
        }
    });
});