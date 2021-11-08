package br.unisul.aula.msendereco.Controller;

import br.unisul.aula.msendereco.dto.EnderecoDTO;
import br.unisul.aula.msendereco.modelo.Endereco;
import br.unisul.aula.msendereco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/endereco")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/{cep}")
    public List<Endereco> LocalizarEndereco(@PathVariable(name = "cep") Long cep) {
        return enderecoRepository.findCidadeByCep(cep);

    }
    @GetMapping
    public List<EnderecoDTO> ListarEndereco() {
        List<EnderecoDTO> enderecoDTO = new ArrayList<>();
        List<Endereco> enderecoList = enderecoRepository.findAll();
        for (Endereco endereco: enderecoList){
            EnderecoDTO dto = new EnderecoDTO(endereco);
            enderecoDTO.add(dto);
        }
        return enderecoDTO;
    }

    @PostMapping
    public Endereco InserirEndereco(@RequestBody EnderecoDTO dto) {
        Endereco endereco = dto.converterEndereco(dto);
        return enderecoRepository.save(endereco);
    }
}