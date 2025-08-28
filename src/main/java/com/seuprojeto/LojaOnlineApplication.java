package com.seuprojeto;  // Substitua pelo seu pacote real
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Permite o scan automático de componentes no pacote e subpacotes
public class  LojaOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaOnlineApplication.class, args);
    }
}
