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
        window.location.href = 'Admin.html'
    })



    $(document).ready(function () {
        let selectedUser;
        let tablica = [];
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/user/info1",
        }).then(function (data) {
            lista(data)
        })

        function lista(data) {
            let name = "";
            data.forEach(function (data) {
                    name += `<option value="${data.iduser}">${data.firstName} ${data.lastName} // ${data.email}</option>`;
            });
            tablica = data;
            $("#name").append(name);

        };

        $("#name").change(function () {
            const userId = this.value;
            selectedUser = tablica.find(data => data.iduser.toString() === userId);
            $("#imie").val(selectedUser.firstName);
            $("#nazwisko").val(selectedUser.lastName);
            $("#email").val(selectedUser.email);
            $("#haslo").val(selectedUser.password);
        });


        $('#edytuj').on('click', function () {

            var object = {
                iduser: selectedUser.iduser,
                firstName: $('#imie').val(),
                lastName: $('#nazwisko').val(),
                email: $('#email').val(),
                password: $('#haslo').val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/user/update1',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Zaaktualizowano")
                }, error: function () {
                    window.alert("1) Podany format emaila jest niew??a??ciwy\nlub\n2) Has??o musi mie?? 1 ma???? litere, 1 du???? litere, 1 znak specjalny, 1 cyfre, i sk??ada?? si?? musi z minimum 8 znak??w \nlub\n3) Nie uzupe??ni??e?? wszystkich p??l")
                }
            })


        });

        $('#usunUzytkownika').on('click', function () {

            var answer = window.confirm("Czy aby na pewno chcesz usun??c konto u??ytkownika?");
            if (answer) {
                var object = {
                    iduser: selectedUser.iduser,
                };

                // var object = {
                //     iduser: selectedUser.iduser,
                // };

                $.ajax({
                    type: 'POST',
                    url: 'http://localhost:8080/user/delete1',
                    //  crossDomain: true,
                    //  dataType: 'json',
                    Accept: 'application/json',
                    //  'Content-Type': 'application/json',
                    data: object,
                    success: function () {
                        window.location.reload(true)
                    }
                })
            }
            else {

            }
        });


        $('#nadajUprawnienia').on('click', function () {
            var object = {
                iduser: selectedUser.iduser,
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/user/admin',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Nadano uprawnienia")
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
                name += `<option value="${data.iddateactivity}">Utworzone: ${data.createDate}// Zako??czone: ${data.endDate}// Szlak: ${data.description} </option>`;
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


    $('#usunKonto').on('click', function () {

        var answer = window.confirm("Czy aby na pewno chcesz usun??c konto admina? Pami??taj o przekazaniu uprawnie??!");
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
                }, error: function () {
                    window.alert("Nie przekaza??e?? uprawnie??!!!")
                }
            })
        }
        else {

        }


    });

});

