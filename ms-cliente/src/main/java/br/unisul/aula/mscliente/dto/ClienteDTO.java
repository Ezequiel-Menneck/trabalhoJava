package br.unisul.aula.mscliente.dto;

import br.unisul.aula.mscliente.modelo.Cliente;

public class ClienteDTO {

    private Long id;
    private String nome;
    private Long endereco_id;
    private String complemento;
    private Integer numero;

    public ClienteDTO(){}

    public ClienteDTO(Long id, String nome, Long endereco_id, String complemento, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.endereco_id = endereco_id;
        this.complemento = complemento;
        this.numero = numero;
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.endereco_id = cliente.getEndereco_id();
        this.complemento = cliente.getComplemento();
        this.numero = cliente.getNumero();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Long endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ClienteDTO { \n" +
                "Nome = " + nome + '\n' +
                "Endereco_id = " + endereco_id + "\n" +
                "Complemento = " + complemento + '\n' +
                "Numero=" + numero + "\n" +
                '}';
    }

    public Cliente converteCliente(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.id);
        cliente.setNome(dto.nome);
        cliente.setEndereco_id(dto.endereco_id);
        cliente.setComplemento(dto.complemento);
        cliente.setNumero(dto.numero);
        return cliente;
    }

}
