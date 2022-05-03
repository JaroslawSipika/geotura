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

    $('#napisz').click(function () {
        window.location.href = 'AdminWiadomosci.html'
    })




    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/email/all",
        }).then(function (data) {
            lista(data)
        })

        function lista(data) {
            let name = "";
            data.forEach(function (data) {
                name += `<option value="${data.idemail}">FROM: ${data.firstName} ${data.lastName} - ${data.email} DATE: ${data.dateSend} </option>`;
            });
            tablica = data;
            $("#Name").append(name);
        };


        $("#Name").change(function () {
            const emailId= this.value;
            selectedSender = tablica.find(data => data.idemail.toString() === emailId);
            $("#wiadomosc").val(selectedSender.text);
        });


        $('#usun').on('click', function () {
            var object = {
                idemail: selectedSender.idemail,
            };

            $.ajax({

                type: 'POST',
                url: 'http://localhost:8080/email/delete',
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




});

