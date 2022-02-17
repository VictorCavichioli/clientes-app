package org.vendas.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.vendas.clientes.model.entify.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
