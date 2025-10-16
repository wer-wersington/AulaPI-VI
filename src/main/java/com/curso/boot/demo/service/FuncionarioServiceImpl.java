package com.curso.boot.demo.service;

import com.curso.boot.demo.dao.FuncionarioDao;
import com.curso.boot.demo.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {
    @Autowired
    private FuncionarioDao dao;

    @Override
    public void salvar(Funcionario funcionario) {
    dao.save(funcionario);
    }


    @Transactional(readOnly = true)
    @Override
    public void editar(Funcionario funcionario) {
    dao.update(funcionario);
    }

    @Transactional(readOnly = true)
    @Override
    public void excluir(Long id) {
    dao.delete(id);
    }


    @Override
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }
}
