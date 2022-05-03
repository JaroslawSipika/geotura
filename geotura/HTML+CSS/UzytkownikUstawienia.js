$(document).ready(function() {

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

    $('#stronaGlowna').click(function () {
        window.location.href = 'Uzytkownik.html'
    })


    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/user/info",
        }).then(function (data) {
            lista(data)
        })

        function lista(data) {
            $("#imie").val(data[0].firstName);
            $("#nazwisko").val(data[0].lastName);
            $("#email").val(data[0].email);
            $("#haslo").val(data[0].password);

        };

        $('#zapisz').on('click', function () {


            var object = {
                firstName: $('#imie').val(),
                lastName: $('#nazwisko').val(),
                email: $('#email').val(),
                password: $('#haslo').val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/user/update',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Zaaktualizowano")
                }, error: function () {
                    window.alert("1) Podany format emaila jest niewłaściwy\nlub\n2) Hasło musi mieć 1 małą litere, 1 dużą litere, 1 znak specjalny, 1 cyfre, i składać się musi z minimum 8 znaków \nlub\n3) Nie uzupełniłeś wszystkich pól")
                }
            })


        });



    });




    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080//dateactivity/mountain",
        }).then(function (data) {
            lista1(data)
        })

        function lista1(data) {
            let name = "";
            data.forEach(function (data) {
                    name += `<option value="${data.iddateactivity}">Utworzone: ${data.createDate}// Zakończone: ${data.endDate}// Szlak: ${data.description} </option>`;
            });
            tablica = data;
            $("#trasa").append(name);
        };


        $("#trasa").change(function () {
            const trasaid= this.value;
            selectedTrasa = tablica.find(data => data.iddateactivity.toString() === trasaid);
        });


        $('#usun').on('click', function () {
            var object = {
                iddateactivity: selectedTrasa.iddateactivity,
            };

            $.ajax({

                type: 'POST',
                url: 'http://localhost:8080/dateactivity/delete',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,

                success: function () {
                    window.location.reload(true)
                    window.alert("Usunieto")
                }

            })
        });







    });

    $('#usunkonto').on('click', function () {


        var answer = window.confirm("Czy aby na pewno chcesz usunąc konto?");
        if (answer) {
            var object = {
                firstName: $('#imie').val(),
            };


        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/user/delete',
            //  crossDomain: true,
            //  dataType: 'json',
            Accept: 'application/json',
            //  'Content-Type': 'application/json',
            data: object,
            success: function () {
               // window.location.reload(true)
                window.location.href = 'Logowanie.html'
            }
        })

        }
        else {

        }



    });




});

