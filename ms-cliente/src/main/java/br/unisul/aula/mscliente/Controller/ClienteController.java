package br.unisul.aula.mscliente.Controller;

import br.unisul.aula.mscliente.dto.ClienteDTO;
import br.unisul.aula.mscliente.modelo.Cliente;
import br.unisul.aula.mscliente.repository.ClienteRepository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/{id}")
    public ClienteDTO localizaCliente(@PathVariable(name = "id") Long id) {
        ClienteDTO cliente = new ClienteDTO(clienteRepository.getById(id));
        System.out.println(cliente);
        return cliente;
    }

    @GetMapping("/todos")
    public List<ClienteDTO> listarClientes() {
        List<ClienteDTO> clienteDTOS = new ArrayList<>();
        List<Cliente> clienteList = clienteRepository.findAll();
        for (Cliente cliente: clienteList) {
            ClienteDTO dto = new ClienteDTO(cliente);
            clienteDTOS.add(dto);
        }
        return clienteDTOS;
    }

    @PostMapping
    public Cliente InserirCliente(@RequestBody ClienteDTO dto) {
        Cliente cliente = dto.converteCliente(dto);
        return clienteRepository.save(cliente);
    }
}
