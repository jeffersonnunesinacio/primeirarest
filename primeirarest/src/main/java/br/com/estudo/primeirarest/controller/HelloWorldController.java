package br.com.estudo.primeirarest.controller;

import br.com.estudo.primeirarest.controller.dto.Resposta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/bemvindo")
    public Resposta HelloWorld() {
        Resposta resposta = new Resposta();
        resposta.setNome("Paulo");
        resposta.setIdade(43);
        return resposta;
    }
}
