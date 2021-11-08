package com.example.msconfigserver.dto;

import java.util.List;

public class ServeDTO {

    private String nomeServe;
    private String endereco;
    private List<String> nomeEndereco;

    public ServeDTO() {}

    public String getNomeServe() {
        return nomeServe;
    }

    public void setNomeServe(String nomeServe) {
        this.nomeServe = nomeServe;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getNomeCliente() {
        return nomeEndereco;
    }

    public void setNomeCliente(List<String> nomeCliente) {
        this.nomeEndereco = nomeCliente;
    }
}
