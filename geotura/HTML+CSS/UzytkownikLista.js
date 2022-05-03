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


    let iddateactivity;


    $(document).ready(function () {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/mountain/all",
        }).then(function (data) {
            buildTable(data)
            lista(data)
        })

        function buildTable(data) {
            var listaGor = '';

            data.forEach(function (data) {
                listaGor += '<tr>';
                listaGor += '<td>' + data.description + '</td>';
                listaGor += '<td>' + data.mountainRange + '</td>';
                listaGor += '<td>' + data.topMountain + '</td>';
                listaGor += '<td>' + data.top + ' m.n.p.m.' + '</td>';
                listaGor += '<td>' + data.time + '</td>';
                listaGor += '<td>' + data.distance + ' km' + '</td>';
                listaGor += '<td>' + '<a href= ' + data.pdf + ' >Otwórz</a>' + '</td>';
                listaGor += '</tr>';
            });
            $('#listaGor').append(listaGor);
        }


        function lista(data) {
             let name = "";
             data.forEach(function (data) {
                 name += `<option value="${data.idmountain}">${data.mountainRange} // ${data.topMountain} // ${data.description}</option>`;
             });
                tablica = data;
                $("#Name").append(name);
            };


        $("#Name").change(function () {
            const mountainId = this.value;
            selectedMountain = tablica.find(data => data.idmountain.toString() === mountainId);
        });


        $('#zapisz').on('click', function () {
            var object = {
                idmountain: selectedMountain.idmountain,
            };

            $.ajax({

                type: 'POST',
                url: 'http://localhost:8080/dateactivity/create',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,

                success: function () {
                    window.location.reload(true)
                    window.alert("Dodano")
                }

            })
        });










    });

});

