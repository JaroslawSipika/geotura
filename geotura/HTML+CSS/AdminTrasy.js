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


    let iddateactivity;


    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/dateactivity/mountain",
        }).then(function (data) {
            buildTable(data)
            lista1(data)
        })


        function buildTable(data) {
            var listaGor = '';

            data.forEach(function (data) {
                listaGor += '<tr>';
                listaGor += '<td>' + data.createDate + '</td>';
                if (data.endDate == null){
                    listaGor += '<td>' + 'Brak' + '</td>'
                }
                else {
                    listaGor += '<td>' + data.endDate + '</td>';
                }
                listaGor += '<td>' + data.mountainRange + '</td>';
                listaGor += '<td>' + data.topMountain + '</td>';
                listaGor += '<td>' + data.top + 'm.n.p.m' + '</td>';
                listaGor += '<td>' + data.time + '</td>';
                listaGor += '<td>' + data.distance + 'km' + '</td>';
                listaGor += '</tr>';
            });
            $('#listaGor').append(listaGor);
        };


        function lista1(data) {
            let name = "";
            data.forEach(function (data) {
                if (data.endDate == null) {name += `<option value="${data.iddateactivity}">${data.createDate} ${data.topMountain}</option>`;}
            });
            tablica = data;
            $("#trasa").append(name);
        };

        $("#trasa").change(function () {
            const dateActivityId = this.value;
            selectediddateactivity = tablica.find(data => data.iddateactivity.toString() === dateActivityId);
        });



        $('#zapisz').on('click', function () {

            var object = {
                iddateactivity: selectediddateactivity.iddateactivity,
                createDate: selectediddateactivity.createDate,
                endDate: $('#endDate').val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/dateactivity/update',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Zapisano")
                }, error: function () {
                    window.alert("Nieodpowiednia data!!!")
                }
            })
        });




    });









});

