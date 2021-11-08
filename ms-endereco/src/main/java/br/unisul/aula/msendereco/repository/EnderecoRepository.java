package br.unisul.aula.msendereco.repository;

import br.unisul.aula.msendereco.modelo.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    List<Endereco> findCidadeByCep(Long cep);

}
