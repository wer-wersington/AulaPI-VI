package com.curso.boot.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;


    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

}