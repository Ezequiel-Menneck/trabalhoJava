package br.unisul.aula.mscliente.repository;

import br.unisul.aula.mscliente.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
