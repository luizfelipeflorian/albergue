/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_regras;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 1513003
 */
@Service
public class RegraService {
    
    @Autowired
    private RegraRepository repository;
    
    public Regra salvar(RegraRequest request) {
        Regra regra = IRegraMapper.INSTANCE
                .toEntity(request);
        regra.setStatus(Status.ATIVO);
        
                //RegraMapper.toEntity(request);
        return repository.save(regra);
    }
    
    public Regra atualizar(Long id, RegraRequest request) {
        Regra regra = buscarPorId(id);
        regra.setAlteracao(LocalDateTime.now());
        IRegraMapper.INSTANCE.update(request, regra);
        
        return regra;
    }
    
    public Regra buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, 
                        "Regra não encontrada"));
    }
    
    public Regra remover(Long id) {
        Regra regra = buscarPorId(id);
        try {
            repository.delete(regra);
            repository.flush();
        } catch(DataIntegrityViolationException ex) {
            regra.setStatus(Status.INATIVO);
            repository.save(regra);
            repository.flush();
        }
        
        return regra;
    }
    
    public List<Regra> buscarTodos() {
        return repository.findAll();
    }
}
