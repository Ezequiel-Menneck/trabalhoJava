package com.example.msconfigserver.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class server {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @Column(name = "endereco_id")
    private Long endereco_id;

    @ElementCollection
    private Set<Long> enderecoDados;

    public server() {
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

    public Set<Long> getEnderecoDados() {
        return enderecoDados;
    }

    public void setEnderecoDados(Set<Long> enderecoDados) {
        this.enderecoDados = enderecoDados;
    }
}
