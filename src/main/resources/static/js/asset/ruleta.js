'use strict'

var miRuleta = new Winwheel({
    'numSegments': 24, // Número de segmentos
    'innerRadius' : 120, // Radio externo
    'responsive'   : true,  // This wheel is responsive!
    'segments':[ // Datos de los segmentos
    { 'fillStyle': '#f1c40f', 'text': '1' },
    { 'fillStyle': '#2ecc71', 'text': '2' },
    { 'fillStyle': '#e67e22', 'text': '3' },
    { 'fillStyle': '#e74c3c', 'text': '4' },
    { 'fillStyle': '#8e44ad', 'text': '5' },
    { 'fillStyle': '#f1c40f', 'text': '6' },
    { 'fillStyle': '#2ecc71', 'text': '7' },
    { 'fillStyle': '#e67e22', 'text': '8' },
    { 'fillStyle': '#e74c3c', 'text': '9' },
    { 'fillStyle': '#8e44ad', 'text': '10' },
    { 'fillStyle': '#f1c40f', 'text': '11' },
    { 'fillStyle': '#2ecc71', 'text': '12' },
    { 'fillStyle': '#e67e22', 'text': '13' },
    { 'fillStyle': '#e74c3c', 'text': '14' },
    { 'fillStyle': '#8e44ad', 'text': '15' },
    { 'fillStyle': '#f1c40f', 'text': '16' },
    { 'fillStyle': '#2ecc71', 'text': '17' },
    { 'fillStyle': '#e67e22', 'text': '18' },
    { 'fillStyle': '#e74c3c', 'text': '19' },
    { 'fillStyle': '#8e44ad', 'text': '20' },
    { 'fillStyle': '#f1c40f', 'text': '21' },
    { 'fillStyle': '#2ecc71', 'text': '22' },
    { 'fillStyle': '#e67e22', 'text': '23' },
    { 'fillStyle': '#e74c3c', 'text': '24' },
    ],
    'animation': {
        'type': 'spinToStop', // Giro y alto
        'duration':2, // Duración de giro
        //'stopAngle':10,
        'spins': -1,        
        'easing': 'Linear.easeNone',
        //'callbackFinished': 'Mensaje()', // Función para mostrar mensaje
        'callbackAfter': 'dibujarIndicador()' // Funciona de pintar indicador
        }
    });

    // Funciones complementarias
    dibujarIndicador();
    miRuleta.rotationAngle = 0;
    miRuleta.draw();

    function seleccionarPosicion(letra){
        
        miRuleta.rotationAngle = 0;
        miRuleta.draw();
        // This formula always makes the wheel stop somewhere inside prize 3 at least
        // 1 degree away from the start and end edges of the segment.
        
        let stopAt = numLetra(letra);

        // Important thing is to set the stopAngle of the animation before stating the spin.
        miRuleta.animation.stopAngle = stopAt;

        // May as well start the spin from here.
        miRuleta.startAnimation();
    }

    function dibujarIndicador() {
        var ctx = miRuleta.ctx;
        ctx.strokeStyle = 'navy';
        ctx.fillStyle = 'black';
        ctx.lineWidth = 2;
        ctx.beginPath();
        ctx.moveTo(170, 0);
        ctx.lineTo(230, 0);
        ctx.lineTo(200, 25);
        ctx.lineTo(171, 0);
        ctx.stroke();
        ctx.fill();
    }

    function numLetra(letra){
        //var letra = document.getElementById("letra").value;
        
        if(letra == 'a'){
            return 10;
        }else if(letra == 'b'){
            return 25;
        }else if(letra == 'c'){
            return 40;
        }else if(letra == 'd'){
            return 55;
        }else if(letra == 'e'){
            return 70;
        }else if(letra == 'f'){
            return 85;
        }else if(letra == 'g'){
            return 100;
        }else if(letra == 'h'){
            return 115;
        }else if(letra == 'i'){
            return 130;
        }else if(letra == 'j'){
            return 145;
        }else if(letra == 'k'){
            return 160;
        }else if(letra == 'l'){
            return 175;
        }else if(letra == 'm'){
            return 190;
        }else if(letra == 'n'){
            return 205;
        }else if(letra == 'o'){
            return 220;
        }else if(letra == 'p'){
            return 235;
        }else if(letra == 'q'){
            return 250;
        }else if(letra == 'r'){
            return 265;
        }else if(letra == 's'){
            return 280;
        }else if(letra == 't'){
            return 295;
        }else if(letra == 'u'){
            return 310;
        }else if(letra == 'v'){
            return 325;
        }else if(letra == 'w'){
            return 340;
        }else if(letra == 'x'){
            return 355;
        }
    }
