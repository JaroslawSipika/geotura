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
            url: "http://localhost:8080/dateactivity/statystyki",
        }).then(function (data) {
            show(data)
        })

        function show(data) {
            let ilosctras;
            let sumakilometrow;
            let najwyzszypunkt;
            let najdluzszatrasa;
            ilosctras = data[0];
            sumakilometrow = data[1];
            najwyzszypunkt = data[2];
            najdluzszatrasa = data[3];
            document.getElementById("ilosctras").innerHTML = ilosctras;
            document.getElementById("sumakilometrow").innerHTML = sumakilometrow + ' km';
            document.getElementById("najwyzszypunkt").innerHTML = najwyzszypunkt + ' m.n.p.m.';
            document.getElementById("najdluzszatrasa").innerHTML = najdluzszatrasa + ' km';
        };
    });

    $(document).ready(function() {
        $.ajax({
            method: "GET",
            url: "http://localhost:8080/mountain/statystyki",
        }).then(function (data) {
            show(data)
        })

        function show(data) {

            let ilosctrastatry;
            let ilosctrastatryzachodnie;
            let ilosctraspieniny;
            let ilosctrasbeskidslaski;
            let ilosctrasbeskidmaly;
            let ilosctrasbeskidzywiecki;
            let ilosctrasgorce;
            let ilosctrasbeskidsadecki;
            let ilosctrasbeskidniski;
            let ilosctrasbeskidmakowski;
            let ilosctrasbeskidwyspowy;
            let ilosctrasbieszczady;
            let ilosctrasgorysanockoturczanskie;
            let ilosctrasgoryizerskie;
            let ilosctraskarkonosze;
            let ilosctrasgorykaczawskie;
            let ilosctrasrudawyjanowickie;
            let ilosctrasgorywalbrzyskie;
            let ilosctrasgorykamienne;
            let ilosctrasgoryjastrzebie;
            let ilosctrasgorystolowe;
            let ilosctrasgoryorlickieibystrzyckie;
            let ilosctrasgorysowie;
            let ilosctrasgorybardzkie;
            let ilosctrasgoryzloteibialskie;
            let ilosctrasmasywsnieznika;
            let ilosctrasgoryopawskie;
            let ilosctrasmasywslezy;
            let ilosctrasgoryswietokrzyskie;

            ilosctrastatry= data[0];
            ilosctrastatryzachodnie= data[1];
            ilosctraspieniny= data[2];
            ilosctrasbeskidslaski= data[3];
            ilosctrasbeskidmaly= data[4];
            ilosctrasbeskidzywiecki= data[5];
            ilosctrasgorce= data[6];
            ilosctrasbeskidsadecki= data[7];
            ilosctrasbeskidniski= data[8];
            ilosctrasbeskidmakowski= data[9];
            ilosctrasbeskidwyspowy= data[10];
            ilosctrasbieszczady= data[11];
            ilosctrasgorysanockoturczanskie= data[12];
            ilosctrasgoryizerskie= data[13];
            ilosctraskarkonosze= data[14];
            ilosctrasgorykaczawskie= data[15];
            ilosctrasrudawyjanowickie= data[16];
            ilosctrasgorywalbrzyskie= data[17];
            ilosctrasgorykamienne= data[18];
            ilosctrasgoryjastrzebie= data[19];
            ilosctrasgorystolowe= data[20];
            ilosctrasgoryorlickieibystrzyckie= data[21];
            ilosctrasgorysowie= data[22];
            ilosctrasgorybardzkie= data[23];
            ilosctrasgoryzloteibialskie= data[24];
            ilosctrasmasywsnieznika= data[25];
            ilosctrasgoryopawskie= data[26];
            ilosctrasmasywslezy= data[27];
            ilosctrasgoryswietokrzyskie= data[28];

            let ilosctrastatryz;
            let ilosctrastatryzachodniez;
            let ilosctraspieninyz;
            let ilosctrasbeskidslaskiz;
            let ilosctrasbeskidmalyz;
            let ilosctrasbeskidzywieckiz;
            let ilosctrasgorcez;
            let ilosctrasbeskidsadeckiz;
            let ilosctrasbeskidniskiz;
            let ilosctrasbeskidmakowskiz;
            let ilosctrasbeskidwyspowyz;
            let ilosctrasbieszczadyz;
            let ilosctrasgorysanockoturczanskiez;
            let ilosctrasgoryizerskiez;
            let ilosctraskarkonoszez;
            let ilosctrasgorykaczawskiez;
            let ilosctrasrudawyjanowickiez;
            let ilosctrasgorywalbrzyskiez;
            let ilosctrasgorykamiennez;
            let ilosctrasgoryjastrzebiez;
            let ilosctrasgorystolowez;
            let ilosctrasgoryorlickieibystrzyckiez;
            let ilosctrasgorysowiez;
            let ilosctrasgorybardzkiez;
            let ilosctrasgoryzloteibialskiez;
            let ilosctrasmasywsnieznikaz;
            let ilosctrasgoryopawskiez;
            let ilosctrasmasywslezyz;
            let ilosctrasgoryswietokrzyskiez;

            ilosctrastatryz= data[29];
            ilosctrastatryzachodniez= data[30];
            ilosctraspieninyz= data[31];
            ilosctrasbeskidslaskiz= data[32];
            ilosctrasbeskidmalyz= data[33];
            ilosctrasbeskidzywieckiz= data[34];
            ilosctrasgorcez= data[35];
            ilosctrasbeskidsadeckiz= data[36];
            ilosctrasbeskidniskiz= data[37];
            ilosctrasbeskidmakowskiz= data[38];
            ilosctrasbeskidwyspowyz= data[39];
            ilosctrasbieszczadyz= data[40];
            ilosctrasgorysanockoturczanskiez= data[41];
            ilosctrasgoryizerskiez= data[42];
            ilosctraskarkonoszez= data[43];
            ilosctrasgorykaczawskiez= data[44];
            ilosctrasrudawyjanowickiez= data[45];
            ilosctrasgorywalbrzyskiez= data[46];
            ilosctrasgorykamiennez= data[47];
            ilosctrasgoryjastrzebiez= data[48];
            ilosctrasgorystolowez= data[49];
            ilosctrasgoryorlickieibystrzyckiez= data[50];
            ilosctrasgorysowiez= data[51];
            ilosctrasgorybardzkiez= data[52];
            ilosctrasgoryzloteibialskiez= data[53];
            ilosctrasmasywsnieznikaz= data[54];
            ilosctrasgoryopawskiez= data[55];
            ilosctrasmasywslezyz= data[56];
            ilosctrasgoryswietokrzyskiez= data[57];

            let ilosctrastatryu;
            let ilosctrastatryzachodnieu;
            let ilosctraspieninyu;
            let ilosctrasbeskidslaskiu;
            let ilosctrasbeskidmalyu;
            let ilosctrasbeskidzywieckiu;
            let ilosctrasgorceu;
            let ilosctrasbeskidsadeckiu;
            let ilosctrasbeskidniskiu;
            let ilosctrasbeskidmakowskiu;
            let ilosctrasbeskidwyspowyu;
            let ilosctrasbieszczadyu;
            let ilosctrasgorysanockoturczanskieu;
            let ilosctrasgoryizerskieu;
            let ilosctraskarkonoszeu;
            let ilosctrasgorykaczawskieu;
            let ilosctrasrudawyjanowickieu;
            let ilosctrasgorywalbrzyskieu;
            let ilosctrasgorykamienneu;
            let ilosctrasgoryjastrzebieu;
            let ilosctrasgorystoloweu;
            let ilosctrasgoryorlickieibystrzyckieu;
            let ilosctrasgorysowieu;
            let ilosctrasgorybardzkieu;
            let ilosctrasgoryzloteibialskieu;
            let ilosctrasmasywsnieznikau;
            let ilosctrasgoryopawskieu;
            let ilosctrasmasywslezyu;
            let ilosctrasgoryswietokrzyskieu;

            ilosctrastatryu= data[58];
            ilosctrastatryzachodnieu= data[59];
            ilosctraspieninyu= data[60];
            ilosctrasbeskidslaskiu= data[61];
            ilosctrasbeskidmalyu= data[62];
            ilosctrasbeskidzywieckiu= data[63];
            ilosctrasgorceu= data[64];
            ilosctrasbeskidsadeckiu= data[65];
            ilosctrasbeskidniskiu= data[66];
            ilosctrasbeskidmakowskiu= data[67];
            ilosctrasbeskidwyspowyu= data[68];
            ilosctrasbieszczadyu= data[69];
            ilosctrasgorysanockoturczanskieu= data[70];
            ilosctrasgoryizerskieu= data[71];
            ilosctraskarkonoszeu= data[72];
            ilosctrasgorykaczawskieu= data[73];
            ilosctrasrudawyjanowickieu= data[74];
            ilosctrasgorywalbrzyskieu= data[75];
            ilosctrasgorykamienneu= data[76];
            ilosctrasgoryjastrzebieu= data[77];
            ilosctrasgorystoloweu= data[78];
            ilosctrasgoryorlickieibystrzyckieu= data[79];
            ilosctrasgorysowieu= data[80];
            ilosctrasgorybardzkieu= data[81];
            ilosctrasgoryzloteibialskieu= data[82];
            ilosctrasmasywsnieznikau= data[83];
            ilosctrasgoryopawskieu= data[84];
            ilosctrasmasywslezyu= data[85];
            ilosctrasgoryswietokrzyskieu= data[86];

            let ilosctrastatryd;
            let ilosctrastatryzachodnied;
            let ilosctraspieninyd;
            let ilosctrasbeskidslaskid;
            let ilosctrasbeskidmalyd;
            let ilosctrasbeskidzywieckid;
            let ilosctrasgorced;
            let ilosctrasbeskidsadeckid;
            let ilosctrasbeskidniskid;
            let ilosctrasbeskidmakowskid;
            let ilosctrasbeskidwyspowyd;
            let ilosctrasbieszczadyd;
            let ilosctrasgorysanockoturczanskied;
            let ilosctrasgoryizerskied;
            let ilosctraskarkonoszed;
            let ilosctrasgorykaczawskied;
            let ilosctrasrudawyjanowickied;
            let ilosctrasgorywalbrzyskied;
            let ilosctrasgorykamienned;
            let ilosctrasgoryjastrzebied;
            let ilosctrasgorystolowed;
            let ilosctrasgoryorlickieibystrzyckied;
            let ilosctrasgorysowied;
            let ilosctrasgorybardzkied;
            let ilosctrasgoryzloteibialskied;
            let ilosctrasmasywsnieznikad;
            let ilosctrasgoryopawskied;
            let ilosctrasmasywslezyd;
            let ilosctrasgoryswietokrzyskied;

            ilosctrastatryd= data[87];
            ilosctrastatryzachodnied= data[88];
            ilosctraspieninyd= data[89];
            ilosctrasbeskidslaskid= data[90];
            ilosctrasbeskidmalyd= data[91];
            ilosctrasbeskidzywieckid= data[92];
            ilosctrasgorced= data[93];
            ilosctrasbeskidsadeckid= data[94];
            ilosctrasbeskidniskid= data[95];
            ilosctrasbeskidmakowskid= data[96];
            ilosctrasbeskidwyspowyd= data[97];
            ilosctrasbieszczadyd= data[98];
            ilosctrasgorysanockoturczanskied= data[99];
            ilosctrasgoryizerskied= data[100];
            ilosctraskarkonoszed= data[101];
            ilosctrasgorykaczawskied= data[102];
            ilosctrasrudawyjanowickied= data[103];
            ilosctrasgorywalbrzyskied= data[104];
            ilosctrasgorykamienned= data[105];
            ilosctrasgoryjastrzebied= data[106];
            ilosctrasgorystolowed= data[107];
            ilosctrasgoryorlickieibystrzyckied= data[108];
            ilosctrasgorysowied= data[109];
            ilosctrasgorybardzkied= data[110];
            ilosctrasgoryzloteibialskied= data[111];
            ilosctrasmasywsnieznikad= data[112];
            ilosctrasgoryopawskied= data[113];
            ilosctrasmasywslezyd= data[114];
            ilosctrasgoryswietokrzyskied= data[115];

            let ilosctrastatryc;
            let ilosctrastatryzachodniec;
            let ilosctraspieninyc;
            let ilosctrasbeskidslaskic;
            let ilosctrasbeskidmalyc;
            let ilosctrasbeskidzywieckic;
            let ilosctrasgorcec;
            let ilosctrasbeskidsadeckic;
            let ilosctrasbeskidniskic;
            let ilosctrasbeskidmakowskic;
            let ilosctrasbeskidwyspowyc;
            let ilosctrasbieszczadyc;
            let ilosctrasgorysanockoturczanskiec;
            let ilosctrasgoryizerskiec;
            let ilosctraskarkonoszec;
            let ilosctrasgorykaczawskiec;
            let ilosctrasrudawyjanowickiec;
            let ilosctrasgorywalbrzyskiec;
            let ilosctrasgorykamiennec;
            let ilosctrasgoryjastrzebiec;
            let ilosctrasgorystolowec;
            let ilosctrasgoryorlickieibystrzyckiec;
            let ilosctrasgorysowiec;
            let ilosctrasgorybardzkiec;
            let ilosctrasgoryzloteibialskiec;
            let ilosctrasmasywsnieznikac;
            let ilosctrasgoryopawskiec;
            let ilosctrasmasywslezyc;
            let ilosctrasgoryswietokrzyskiec;

            ilosctrastatryc= data[116];
            ilosctrastatryzachodniec= data[117];
            ilosctraspieninyc= data[118];
            ilosctrasbeskidslaskic= data[119];
            ilosctrasbeskidmalyc= data[120];
            ilosctrasbeskidzywieckic= data[121];
            ilosctrasgorcec= data[122];
            ilosctrasbeskidsadeckic= data[123];
            ilosctrasbeskidniskic= data[124];
            ilosctrasbeskidmakowskic= data[125];
            ilosctrasbeskidwyspowyc= data[126];
            ilosctrasbieszczadyc= data[127];
            ilosctrasgorysanockoturczanskiec= data[128];
            ilosctrasgoryizerskiec= data[129];
            ilosctraskarkonoszec= data[130];
            ilosctrasgorykaczawskiec= data[131];
            ilosctrasrudawyjanowickiec= data[132];
            ilosctrasgorywalbrzyskiec= data[133];
            ilosctrasgorykamiennec= data[134];
            ilosctrasgoryjastrzebiec= data[135];
            ilosctrasgorystolowec= data[136];
            ilosctrasgoryorlickieibystrzyckiec= data[137];
            ilosctrasgorysowiec= data[138];
            ilosctrasgorybardzkiec= data[139];
            ilosctrasgoryzloteibialskiec= data[140];
            ilosctrasmasywsnieznikac= data[141];
            ilosctrasgoryopawskiec= data[142];
            ilosctrasmasywslezyc= data[143];
            ilosctrasgoryswietokrzyskiec= data[144];



            document.getElementById("ilosctrastatry").innerHTML = ilosctrastatry;
            document.getElementById("ilosctraspieniny").innerHTML = ilosctraspieniny;
            document.getElementById("ilosctrasbeskidslaski").innerHTML = ilosctrasbeskidslaski ;
            document.getElementById("ilosctrasbeskidmaly").innerHTML = ilosctrasbeskidmaly;
            document.getElementById("ilosctrasbeskidzywiecki").innerHTML = ilosctrasbeskidzywiecki;
            document.getElementById("ilosctrasgorce").innerHTML = ilosctrasgorce;
            document.getElementById("ilosctrasbeskidsadecki").innerHTML = ilosctrasbeskidsadecki;
            document.getElementById("ilosctrasbeskidniski").innerHTML = ilosctrasbeskidniski;
            document.getElementById("ilosctrasbieszczady").innerHTML = ilosctrasbieszczady;
            document.getElementById("ilosctrasbeskidmakowski").innerHTML = ilosctrasbeskidmakowski;
            document.getElementById("ilosctrasbeskidwyspowy").innerHTML = ilosctrasbeskidwyspowy;
            document.getElementById("ilosctrastatryzachodnie").innerHTML = ilosctrastatryzachodnie;
            document.getElementById("ilosctrasgorysanockoturczanskie").innerHTML = ilosctrasgorysanockoturczanskie;
            document.getElementById("ilosctrasgoryizerskie").innerHTML = ilosctrasgoryizerskie;
            document.getElementById("ilosctraskarkonosze").innerHTML = ilosctraskarkonosze;
            document.getElementById("ilosctrasgorykaczawskie").innerHTML = ilosctrasgorykaczawskie;
            document.getElementById("ilosctrasrudawyjanowickie").innerHTML = ilosctrasrudawyjanowickie;
            document.getElementById("ilosctrasgorywalbrzyskie").innerHTML = ilosctrasgorywalbrzyskie;
            document.getElementById("ilosctrasgorykamienne").innerHTML = ilosctrasgorykamienne;
            document.getElementById("ilosctrasgoryjastrzebie").innerHTML = ilosctrasgoryjastrzebie;
            document.getElementById("ilosctrasgorystolowe").innerHTML = ilosctrasgorystolowe;
            document.getElementById("ilosctrasgoryorlickieibystrzyckie").innerHTML = ilosctrasgoryorlickieibystrzyckie;
            document.getElementById("ilosctrasgorysowie").innerHTML = ilosctrasgorysowie;
            document.getElementById("ilosctrasgorybardzkie").innerHTML = ilosctrasgorybardzkie;
            document.getElementById("ilosctrasgoryzloteibialskie").innerHTML = ilosctrasgoryzloteibialskie;
            document.getElementById("ilosctrasmasywsnieznika").innerHTML = ilosctrasmasywsnieznika;
            document.getElementById("ilosctrasgoryopawskie").innerHTML = ilosctrasgoryopawskie;
            document.getElementById("ilosctrasmasywslezy").innerHTML = ilosctrasmasywslezy;
            document.getElementById("ilosctrasgoryswietokrzyskie").innerHTML = ilosctrasgoryswietokrzyskie;

            document.getElementById("ilosctrastatryz").innerHTML = ilosctrastatryz;
            document.getElementById("ilosctraspieninyz").innerHTML = ilosctraspieninyz;
            document.getElementById("ilosctrasbeskidslaskiz").innerHTML = ilosctrasbeskidslaskiz ;
            document.getElementById("ilosctrasbeskidmalyz").innerHTML = ilosctrasbeskidmalyz;
            document.getElementById("ilosctrasbeskidzywieckiz").innerHTML = ilosctrasbeskidzywieckiz;
            document.getElementById("ilosctrasgorcez").innerHTML = ilosctrasgorcez;
            document.getElementById("ilosctrasbeskidsadeckiz").innerHTML = ilosctrasbeskidsadeckiz;
            document.getElementById("ilosctrasbeskidniskiz").innerHTML = ilosctrasbeskidniskiz;
            document.getElementById("ilosctrasbieszczadyz").innerHTML = ilosctrasbieszczadyz;
            document.getElementById("ilosctrasbeskidmakowskiz").innerHTML = ilosctrasbeskidmakowskiz;
            document.getElementById("ilosctrasbeskidwyspowyz").innerHTML = ilosctrasbeskidwyspowyz;
            document.getElementById("ilosctrastatryzachodniez").innerHTML = ilosctrastatryzachodniez;
            document.getElementById("ilosctrasgorysanockoturczanskiez").innerHTML = ilosctrasgorysanockoturczanskiez;
            document.getElementById("ilosctrasgoryizerskiez").innerHTML = ilosctrasgoryizerskiez;
            document.getElementById("ilosctraskarkonoszez").innerHTML = ilosctraskarkonoszez;
            document.getElementById("ilosctrasgorykaczawskiez").innerHTML = ilosctrasgorykaczawskiez;
            document.getElementById("ilosctrasrudawyjanowickiez").innerHTML = ilosctrasrudawyjanowickiez;
            document.getElementById("ilosctrasgorywalbrzyskiez").innerHTML = ilosctrasgorywalbrzyskiez;
            document.getElementById("ilosctrasgorykamiennez").innerHTML = ilosctrasgorykamiennez;
            document.getElementById("ilosctrasgoryjastrzebiez").innerHTML = ilosctrasgoryjastrzebiez;
            document.getElementById("ilosctrasgorystolowez").innerHTML = ilosctrasgorystolowez;
            document.getElementById("ilosctrasgoryorlickieibystrzyckiez").innerHTML = ilosctrasgoryorlickieibystrzyckiez;
            document.getElementById("ilosctrasgorysowiez").innerHTML = ilosctrasgorysowiez;
            document.getElementById("ilosctrasgorybardzkiez").innerHTML = ilosctrasgorybardzkiez;
            document.getElementById("ilosctrasgoryzloteibialskiez").innerHTML = ilosctrasgoryzloteibialskiez;
            document.getElementById("ilosctrasmasywsnieznikaz").innerHTML = ilosctrasmasywsnieznikaz;
            document.getElementById("ilosctrasgoryopawskiez").innerHTML = ilosctrasgoryopawskiez;
            document.getElementById("ilosctrasmasywslezyz").innerHTML = ilosctrasmasywslezyz;
            document.getElementById("ilosctrasgoryswietokrzyskiez").innerHTML = ilosctrasgoryswietokrzyskiez;


            document.getElementById("ilosctrastatryu").innerHTML = ilosctrastatryu;
            document.getElementById("ilosctraspieninyu").innerHTML = ilosctraspieninyu;
            document.getElementById("ilosctrasbeskidslaskiu").innerHTML = ilosctrasbeskidslaskiu ;
            document.getElementById("ilosctrasbeskidmalyu").innerHTML = ilosctrasbeskidmalyu;
            document.getElementById("ilosctrasbeskidzywieckiu").innerHTML = ilosctrasbeskidzywieckiu;
            document.getElementById("ilosctrasgorceu").innerHTML = ilosctrasgorceu;
            document.getElementById("ilosctrasbeskidsadeckiu").innerHTML = ilosctrasbeskidsadeckiu;
            document.getElementById("ilosctrasbeskidniskiu").innerHTML = ilosctrasbeskidniskiu;
            document.getElementById("ilosctrasbieszczadyu").innerHTML = ilosctrasbieszczadyu;
            document.getElementById("ilosctrasbeskidmakowskiu").innerHTML = ilosctrasbeskidmakowskiu;
            document.getElementById("ilosctrasbeskidwyspowyu").innerHTML = ilosctrasbeskidwyspowyu;
            document.getElementById("ilosctrastatryzachodnieu").innerHTML = ilosctrastatryzachodnieu;
            document.getElementById("ilosctrasgorysanockoturczanskieu").innerHTML = ilosctrasgorysanockoturczanskieu;
            document.getElementById("ilosctrasgoryizerskieu").innerHTML = ilosctrasgoryizerskieu;
            document.getElementById("ilosctraskarkonoszeu").innerHTML = ilosctraskarkonoszeu;
            document.getElementById("ilosctrasgorykaczawskieu").innerHTML = ilosctrasgorykaczawskieu;
            document.getElementById("ilosctrasrudawyjanowickieu").innerHTML = ilosctrasrudawyjanowickieu;
            document.getElementById("ilosctrasgorywalbrzyskieu").innerHTML = ilosctrasgorywalbrzyskieu;
            document.getElementById("ilosctrasgorykamienneu").innerHTML = ilosctrasgorykamienneu;
            document.getElementById("ilosctrasgoryjastrzebieu").innerHTML = ilosctrasgoryjastrzebieu;
            document.getElementById("ilosctrasgorystoloweu").innerHTML = ilosctrasgorystoloweu;
            document.getElementById("ilosctrasgoryorlickieibystrzyckieu").innerHTML = ilosctrasgoryorlickieibystrzyckieu;
            document.getElementById("ilosctrasgorysowieu").innerHTML = ilosctrasgorysowieu;
            document.getElementById("ilosctrasgorybardzkieu").innerHTML = ilosctrasgorybardzkieu;
            document.getElementById("ilosctrasgoryzloteibialskieu").innerHTML = ilosctrasgoryzloteibialskieu;
            document.getElementById("ilosctrasmasywsnieznikau").innerHTML = ilosctrasmasywsnieznikau;
            document.getElementById("ilosctrasgoryopawskieu").innerHTML = ilosctrasgoryopawskieu;
            document.getElementById("ilosctrasmasywslezyu").innerHTML = ilosctrasmasywslezyu;
            document.getElementById("ilosctrasgoryswietokrzyskieu").innerHTML = ilosctrasgoryswietokrzyskieu;



            document.getElementById("ilosctrastatryd").innerHTML = ilosctrastatryd;
            document.getElementById("ilosctraspieninyd").innerHTML = ilosctraspieninyd;
            document.getElementById("ilosctrasbeskidslaskid").innerHTML = ilosctrasbeskidslaskid ;
            document.getElementById("ilosctrasbeskidmalyd").innerHTML = ilosctrasbeskidmalyd;
            document.getElementById("ilosctrasbeskidzywieckid").innerHTML = ilosctrasbeskidzywieckid;
            document.getElementById("ilosctrasgorced").innerHTML = ilosctrasgorced;
            document.getElementById("ilosctrasbeskidsadeckid").innerHTML = ilosctrasbeskidsadeckid;
            document.getElementById("ilosctrasbeskidniskid").innerHTML = ilosctrasbeskidniskid;
            document.getElementById("ilosctrasbieszczadyd").innerHTML = ilosctrasbieszczadyd;
            document.getElementById("ilosctrasbeskidmakowskid").innerHTML = ilosctrasbeskidmakowskid;
            document.getElementById("ilosctrasbeskidwyspowyd").innerHTML = ilosctrasbeskidwyspowyd;
            document.getElementById("ilosctrastatryzachodnied").innerHTML = ilosctrastatryzachodnied;
            document.getElementById("ilosctrasgorysanockoturczanskied").innerHTML = ilosctrasgorysanockoturczanskied;
            document.getElementById("ilosctrasgoryizerskied").innerHTML = ilosctrasgoryizerskied;
            document.getElementById("ilosctraskarkonoszed").innerHTML = ilosctraskarkonoszed;
            document.getElementById("ilosctrasgorykaczawskied").innerHTML = ilosctrasgorykaczawskied;
            document.getElementById("ilosctrasrudawyjanowickied").innerHTML = ilosctrasrudawyjanowickied;
            document.getElementById("ilosctrasgorywalbrzyskied").innerHTML = ilosctrasgorywalbrzyskied;
            document.getElementById("ilosctrasgorykamienned").innerHTML = ilosctrasgorykamienned;
            document.getElementById("ilosctrasgoryjastrzebied").innerHTML = ilosctrasgoryjastrzebied;
            document.getElementById("ilosctrasgorystolowed").innerHTML = ilosctrasgorystolowed;
            document.getElementById("ilosctrasgoryorlickieibystrzyckied").innerHTML = ilosctrasgoryorlickieibystrzyckied;
            document.getElementById("ilosctrasgorysowied").innerHTML = ilosctrasgorysowied;
            document.getElementById("ilosctrasgorybardzkied").innerHTML = ilosctrasgorybardzkied;
            document.getElementById("ilosctrasgoryzloteibialskied").innerHTML = ilosctrasgoryzloteibialskied;
            document.getElementById("ilosctrasmasywsnieznikad").innerHTML = ilosctrasmasywsnieznikad;
            document.getElementById("ilosctrasgoryopawskied").innerHTML = ilosctrasgoryopawskied;
            document.getElementById("ilosctrasmasywslezyd").innerHTML = ilosctrasmasywslezyd;
            document.getElementById("ilosctrasgoryswietokrzyskied").innerHTML = ilosctrasgoryswietokrzyskied;


            document.getElementById("ilosctrastatryc").innerHTML = ilosctrastatryc;
            document.getElementById("ilosctraspieninyc").innerHTML = ilosctraspieninyc;
            document.getElementById("ilosctrasbeskidslaskic").innerHTML = ilosctrasbeskidslaskic ;
            document.getElementById("ilosctrasbeskidmalyc").innerHTML = ilosctrasbeskidmalyc;
            document.getElementById("ilosctrasbeskidzywieckic").innerHTML = ilosctrasbeskidzywieckic;
            document.getElementById("ilosctrasgorcec").innerHTML = ilosctrasgorcec;
            document.getElementById("ilosctrasbeskidsadeckic").innerHTML = ilosctrasbeskidsadeckic;
            document.getElementById("ilosctrasbeskidniskic").innerHTML = ilosctrasbeskidniskic;
            document.getElementById("ilosctrasbieszczadyc").innerHTML = ilosctrasbieszczadyc;
            document.getElementById("ilosctrasbeskidmakowskic").innerHTML = ilosctrasbeskidmakowskic;
            document.getElementById("ilosctrasbeskidwyspowyc").innerHTML = ilosctrasbeskidwyspowyc;
            document.getElementById("ilosctrastatryzachodniec").innerHTML = ilosctrastatryzachodniec;
            document.getElementById("ilosctrasgorysanockoturczanskiec").innerHTML = ilosctrasgorysanockoturczanskiec;
            document.getElementById("ilosctrasgoryizerskiec").innerHTML = ilosctrasgoryizerskiec;
            document.getElementById("ilosctraskarkonoszec").innerHTML = ilosctraskarkonoszec;
            document.getElementById("ilosctrasgorykaczawskiec").innerHTML = ilosctrasgorykaczawskiec;
            document.getElementById("ilosctrasrudawyjanowickiec").innerHTML = ilosctrasrudawyjanowickiec;
            document.getElementById("ilosctrasgorywalbrzyskiec").innerHTML = ilosctrasgorywalbrzyskiec;
            document.getElementById("ilosctrasgorykamiennec").innerHTML = ilosctrasgorykamiennec;
            document.getElementById("ilosctrasgoryjastrzebiec").innerHTML = ilosctrasgoryjastrzebiec;
            document.getElementById("ilosctrasgorystolowec").innerHTML = ilosctrasgorystolowec;
            document.getElementById("ilosctrasgoryorlickieibystrzyckiec").innerHTML = ilosctrasgoryorlickieibystrzyckiec;
            document.getElementById("ilosctrasgorysowiec").innerHTML = ilosctrasgorysowiec;
            document.getElementById("ilosctrasgorybardzkiec").innerHTML = ilosctrasgorybardzkiec;
            document.getElementById("ilosctrasgoryzloteibialskiec").innerHTML = ilosctrasgoryzloteibialskiec;
            document.getElementById("ilosctrasmasywsnieznikac").innerHTML = ilosctrasmasywsnieznikac;
            document.getElementById("ilosctrasgoryopawskiec").innerHTML = ilosctrasgoryopawskiec;
            document.getElementById("ilosctrasmasywslezyc").innerHTML = ilosctrasmasywslezyc;
            document.getElementById("ilosctrasgoryswietokrzyskiec").innerHTML = ilosctrasgoryswietokrzyskiec;



        };
    });











});
