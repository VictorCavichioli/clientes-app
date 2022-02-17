package org.vendas.clientes.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.vendas.clientes.exception.UsuarioCadastradoException;
import org.vendas.clientes.model.entify.Usuario;
import org.vendas.clientes.model.repository.UsuarioRepository;
import org.vendas.clientes.service.UsuarioService;

import javax.validation.Valid;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){

        try{
            service.salvar(usuario);
        }catch (UsuarioCadastradoException e){
            throw  new ResponseStatusException( HttpStatus.BAD_REQUEST, e.getMessage() );
        }


    }
}
