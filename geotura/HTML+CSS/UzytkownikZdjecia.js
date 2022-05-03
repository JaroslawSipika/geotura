$(document).ready(function () {

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

        $('#zapisz').click(function () {
            window.location.href = 'UzytkownikZdjeciaDodaj.html'
        })


    $.ajax({
            method: "GET",
            url: "http://localhost:8080/photo/find2",
        }).then(function (data) {
            buildTable(data)
        })

        function buildTable(data) {
            var listaGor = '';
            let i = 1;
            data.forEach(function (data) {

                if (data.link == null) {
                } else {

                    listaGor += '<tr>';
                    listaGor += '<td>' + data.endDate + '</td>';
                    listaGor += '<td>' + data.mountainRange + '</td>';
                    listaGor += '<td>' + data.topMountain + '</td>';
                    listaGor += '<td>' + '<button id="open' + i + '" >Otwórz</button>' + '</td>'
                    listaGor += '</tr>';
                    i++
                }

            });
            $('#listaGor').append(listaGor);
            let k = 1;
            data.forEach(function (data) {
                if (data.link == null) {
                } else {
                    $('#open' + k).click(function () {


                        $('#listaGor').empty();
                        var listaGor = '';
                        listaGor += '<tr>';
                        listaGor += '<td>' + data.endDate + '</td>';
                        listaGor += '<td>' + data.mountainRange + '</td>';
                        listaGor += '<td>' + data.topMountain + '</td>';
                        listaGor += '</tr>';
                        $('#listaGor1').append(listaGor);
                        document.getElementById("listaGor1").style.visibility="visible";

                        let iddateactivity = data.iddateactivity;


                        $.ajax({
                            method: "GET",
                            url: "http://localhost:8080/photo/find",
                        }).then(function (data) {
                            buildd(data);
                        })

                            function buildd(data){
                                var photos = '';

                                data.forEach(function (data) {

                                    if (data.iddateactivity == iddateactivity) {
                                        photos += '<img src='+data.link+', onclick=openFullImg(this.src)>'
                                    }
                                    else{}
                                });
                                $('#gallery1').append(photos);






                                document.getElementById("gallery1").style.visibility="visible";
                            };






                    })
                    k++
                }
            });
        };



});



