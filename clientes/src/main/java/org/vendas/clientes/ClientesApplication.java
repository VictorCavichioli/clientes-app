package org.vendas.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.vendas.clientes.model.entify.Cliente;
import org.vendas.clientes.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
