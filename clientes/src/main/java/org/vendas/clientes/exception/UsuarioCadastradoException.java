package org.vendas.clientes.exception;

public class UsuarioCadastradoException extends  RuntimeException {

    public UsuarioCadastradoException( String login ){

        super("Usuario já castrado para o Login" + login);

    }

}
