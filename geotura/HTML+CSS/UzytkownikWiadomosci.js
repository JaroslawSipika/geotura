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

    $('#skrzynka').click(function () {
        window.location.href = 'UzytkownikSkrzynka.html'
    })




    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/user/all",
        }).then(function (data) {
            lista(data)
        })

        function lista(data) {
            let name = "";
            data.forEach(function (data) {
                if(data.iduser == 1){
                    name += `<option value="${data.iduser}">ADMIN: ${data.firstName} ${data.lastName} - ${data.email}</option>`;
                }
                else {
                    name += `<option value="${data.iduser}">${data.firstName} ${data.lastName} - ${data.email}</option>`;
                }
            });
            tablica = data;
            $("#Name").append(name);
        };


        $("#Name").change(function () {
            const receiverId = this.value;
            selectedReceiver = tablica.find(data => data.iduser.toString() === receiverId);
        });


        $('#wyslij').on('click', function () {
            var object = {
                idreceiver: selectedReceiver.iduser,
                text: $('#wiadomosc').val(),
            };

            $.ajax({

                type: 'POST',
                url: 'http://localhost:8080/email/create',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,

                success: function () {
                    window.alert("Wysłano")
                }, error: function () {
                    window.alert("Uzupełnij treść!!!")
                }

            })
        });










    });




});

