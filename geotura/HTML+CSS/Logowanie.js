$(document).ready(function() {

    var $email = $('#email');
    var $password = $('#password');

    $('#login').on('click', function () {
        var object = {
            email: $email.val(),
            password: $password.val(),
        };

        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/auth/login',
            //  crossDomain: true,
            //  dataType: 'json',
            Accept: 'application/json',
            //  'Content-Type': 'application/json',
            data: object,
            success: function (data) {
                console.log(data);
                if(data.type === 'CLIENT'){
                    window.location.href = 'Uzytkownik.html'
                }
                else if(data.type === 'ADMIN'){
                    window.location.href = 'Admin.html'
                }
            }, error: function () {
                window.alert("Błędne logowowanie!!!")
            }
        });
    });

    $(document).ready(function() {

        var $firstName = $('#firstName');
        var $lastName = $('#lastName');
        var $password1 = $('#password1');
        var $email1 = $('#email1');



        $('#registration').on('click', function () {
            var object = {

                firstName: $firstName.val(),
                lastName: $lastName.val(),
                password: $password1.val(),
                email: $email1.val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/auth/registration',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function (data) {
                    window.alert("Brawo! Teraz możesz się zalogować")

                }, error: function () {
                    window.alert("1) Użytkownik już istnieje w bazie \nlub\n2) Podany format emaila jest niewłaściwy\nlub\n3) Hasło musi mieć 1 małą litere, 1 dużą litere, 1 znak specjalny, 1 cyfre, i składać się musi z minimum 8 znaków \nlub\n4) Nie uzupełniłeś wszystkich pól")
                }
            });
        });
    });

















});
