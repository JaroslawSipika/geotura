let selectedPhoto;


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

    $('#mojeZdjecia').click(function () {
        window.location.href = 'AdminZdjecia.html'
    })

    let pozdrowienie;

    $(document).ready(function() {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/user/info",
        }).then(function (data) {
            showName(data)
        })

        function showName(data) {
            pozdrowienie = `${data[0].iduser} ${data[0].firstName} ${data[0].lastName}`;
        };
    });




    $(document).ready(function() {

        let tablica = [];
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/photo/find1",
        }).then(function (data) {
            lista(data)

        })

        function lista(data) {
            let name = "";
            data.forEach(function (data) {
                if (data.endDate == null || data.dateActivityId != null) {}
                else {
                    name += `<option value="${data.iddateactivity}">${data.endDate} ${data.topMountain}</option>`;
                }
            });
            tablica = data;
            $("#Name").append(name);
        };

        $("#Name").change(function () {
            const dateActivityId = this.value;
            selectedPhoto = tablica.find(data => data.iddateactivity.toString() === dateActivityId);
            $("#link").val(selectedPhoto.createDate+" "+selectedPhoto.topMountain +" - id:"+pozdrowienie);
        });
    });
});

function zapisz () {
    var object = {
        iddateactivity: selectedPhoto.iddateactivity,
        link: $("#urlalbumu").val(),
    };

    $.ajax({

        type: 'POST',
        url: 'http://localhost:8080/photo/create',
        //  crossDomain: true,
        //  dataType: 'json',
        Accept: 'application/json',
        //  'Content-Type': 'application/json',
        data: object,

        success: function () {
            // window.alert("Zapisano")
            // window.location.reload(true)
        }, error: function () {
            window.alert("Błąd danych!")
        }
    })


}