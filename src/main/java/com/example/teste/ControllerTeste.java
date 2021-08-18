package com.example.teste;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class ControllerTeste {
    private ResponseTeste response;

    @GetMapping("teste")
    @ResponseStatus(HttpStatus.OK)
    public ResponseTeste testApp() {
        response = new ResponseTeste(true);
        return response;
    }
}
