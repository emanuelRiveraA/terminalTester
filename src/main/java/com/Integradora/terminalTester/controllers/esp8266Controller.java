package com.Integradora.terminalTester.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

@RestController
public class esp8266Controller {

    //private Boolean status = true;

    /*@RequestMapping(value = "/saludo", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map mensaje() {

        System.out.println("si funciono de el esp8266");

        return Collections.singletonMap("Conductividad", status);

    }*/

    @RequestMapping(value = "/getConductividad", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map mensaje() throws IOException {

        /*try {
            String result = sendGET("http://10.1.7.3:80/conductividad");
            //String result = sendPOST("http://192.168.1.50:80/variable", letra);
            System.out.println("conductividad"+result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "hola desde spring rest con arduino";*/

        // request url
        //String url = "http://10.1.7.3:80/conductividad";
        String url = "http://192.168.1.10/conductividad";

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // make an HTTP GET request
        String json = restTemplate.getForObject(url, String.class);

        // print json
        System.out.println(json);

        return Collections.singletonMap("Conductividad", json);
    }


}
