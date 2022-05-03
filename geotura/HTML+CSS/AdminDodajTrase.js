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


    $(document).ready(function() {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/mountain/all",
        }).then(function (data) {
            lista(data)

        })

        function lista(data) {
            let name = "";
            data.forEach(function (data) {
                name += `<option value="${data.idmountain}">${data.description}</option>`;
            });
            tablica = data;
            $("#trasa").append(name);

        };


        $("#trasa").change(function () {
            const mountainId = this.value;
            if (mountainId === "-select-"){
                $("#opis").val("");
                $("#pasmo").val("");
                $("#szczyt").val("");
                $("#wysokosc").val("");
                $("#czas").val("");
                $("#dystans").val("");
                $("#mapa").val("");
            }
            selectedMountain = tablica.find(data => data.idmountain.toString() === mountainId);
            $("#opis").val(selectedMountain.description);
            $("#pasmo").val(selectedMountain.mountainRange);
            $("#szczyt").val(selectedMountain.topMountain);
            $("#wysokosc").val(selectedMountain.top);
            $("#czas").val(selectedMountain.time);
            $("#dystans").val(selectedMountain.distance);
            $("#mapa").val(selectedMountain.pdf);

        });


        $('#edytuj').on('click', function () {

            var object = {
                idmountain: selectedMountain.idmountain,
                description: $('#opis').val(),
                time: $('#czas').val(),
                mountainRange: $('#pasmo').val(),
                topMountain: $('#szczyt').val(),
                top: $('#wysokosc').val(),
                distance: $('#dystans').val(),
                pdf: $('#mapa').val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/mountain/update',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Wykonano")
                }, error: function () {
                    window.alert("Nieodpowiednie dane!!!")
                }
            })
        });

        $('#dodaj').on('click', function () {

            var object = {
                description: $('#opis').val(),
                time: $('#czas').val(),
                mountainRange: $('#pasmo').val(),
                topMountain: $('#szczyt').val(),
                top: $('#wysokosc').val(),
                distance: $('#dystans').val(),
                pdf: $('#mapa').val(),
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/mountain/create',
                //  crossDomain: true,
                //  dataType: 'json',
                Accept: 'application/json',
                //  'Content-Type': 'application/json',
                data: object,
                success: function () {
                    window.location.reload(true)
                    window.alert("Utworzono")
                }, error: function () {
                    window.alert("Nieodpowiednie dane!!!")
                }
            })
        });

        $('#usun').on('click', function () {

            var object = {
                idmountain: selectedMountain.idmountain,
            };

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/mountain/delete',
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