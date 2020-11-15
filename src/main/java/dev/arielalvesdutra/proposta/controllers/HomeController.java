package dev.arielalvesdutra.proposta.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<HomeDTO> home() {

        return ResponseEntity.ok().body(
                new HomeDTO()
                        .setData(OffsetDateTime.now())
                        .setMensagem("bem vindo ao inicio!"));
    }

    private class HomeDTO {

        private OffsetDateTime data;
        private String mensagem;


        public OffsetDateTime getData() {
            return data;
        }

        public HomeDTO setData(OffsetDateTime data) {
            this.data = data;
            return this;
        }

        public String getMensagem() {
            return mensagem;
        }

        public HomeDTO setMensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }
    }
}
