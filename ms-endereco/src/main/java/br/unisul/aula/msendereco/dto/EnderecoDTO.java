package br.unisul.aula.msendereco.dto;

import br.unisul.aula.msendereco.modelo.Endereco;
import br.unisul.aula.msendereco.modelo.UnidadeFederativa;

public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private Long cep;
    private String bairro;
    private String cidade;
    private UnidadeFederativa uf;

    public EnderecoDTO() {}

    public EnderecoDTO(Long id, String logradouro, Long cep, String bairro, String cidade, UnidadeFederativa uf) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public EnderecoDTO(Endereco endereco) {
        this.setId(1L);
        this.setLogradouro("Rua da Tristeza");
        this.setCep(88L);
        this.setBairro("Bairro da Consolação");
        this.setCidade("Agrolândia");
        this.setUf(UnidadeFederativa.AC);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "EnderecoDTO { " +
                "Id=" + id + '\n' +
                "Logradouro = " + logradouro + '\n' +
                "CEP = " + cep + '\n' +
                "Bairro = " + bairro + '\n' +
                "Cidade = " + cidade + '\n' +
                "UF = " + uf + '\n' +
                '}';
    }

    public Endereco converterEndereco(EnderecoDTO dto) {
        Endereco endereco = new Endereco();
        endereco.setId(dto.id);
        endereco.setLogradouro(dto.logradouro);
        endereco.setCep(dto.cep);
        endereco.setBairro(dto.bairro);
        endereco.setCidade(dto.cidade);
        endereco.setUf(dto.uf);
        return endereco;
    }
}
