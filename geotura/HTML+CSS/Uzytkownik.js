$(document).ready(function() {

    $('#mojeTrasy').click(function () {
        window.location.href = 'UzytkownikTrasy.html'
    })

    $('#mojeZdjecia').click(function () {
        window.location.href = 'UzytkownikZdjecia.html'
    })

    $('#statystyki').click(function () {
        window.location.href = 'UzytkownikStatystyki.html'
    })

    $('#listaSzlakow').click(function () {
        window.location.href = 'UzytkownikLista.html'
    })

    $('#wiadomosci').click(function () {
        window.location.href = 'UzytkownikWiadomosci.html'
    })

    $('#ustawienia').click(function () {
        window.location.href = 'UzytkownikUstawienia.html'
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
            pozdrowienie = 'Witaj ' + data;
            document.getElementById("firstName1").innerHTML = pozdrowienie;
        };
    });
});

