$(document).ready(function() {

    $('#mojeTrasy').click(function () {
        window.location.href = 'AdminTrasy.html'
    })

    $('#mojeZdjecia').click(function () {
        window.location.href = 'AdminZdjecia.html'
    })

    $('#statystyki').click(function () {
        window.location.href = 'AdminStatystyki.html'
    })

    $('#listaSzlakow').click(function () {
        window.location.href = 'AdminLista.html'
    })

    $('#wiadomosci').click(function () {
        window.location.href = 'AdminWiadomosci.html'
    })

    $('#ustawienia').click(function () {
        window.location.href = 'AdminUstawienia.html'
    })

    $('#wyloguj').click(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/auth/logout",
        }).then(function(){
            logout()
        })

        function logout(){
            window.location.href = 'Logowanie.html'
        };

    })


    $(document).ready(function() {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/user/name",
        }).then(function (data) {
            showName(data)
        })

        function showName(data) {
            let pozdrowienie;
            pozdrowienie = 'Witaj ' + data+ ' - Jesteś adminem ';
            document.getElementById("firstName1").innerHTML = pozdrowienie;
        };
    });
});

