package com.curso.boot.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@SuppressWarnings("serial")
@Table(name = "DEPARTAMENTOS") //Faz o nome da tabela do banco ser criada nessse nome
public abstract class Departamento extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

    public String getNome(){
        return nome;
    }

    public void setNome(Long aLong) {
        super.setId(aLong);
    }
}