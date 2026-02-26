/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import br.edu.ifms.albergue.uc.manter_regras.Status;
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
public class MotivoService {

    @Autowired
    private MotivoRepository repository;

    public Motivo salvar(MotivoRequest request) {
        var motivo = IMotivoMapper.INSTANCE
                .toEntity(request);
//                MotivoMapper.toEntity(request);
        motivo.setStatus(Status.ATIVO);
        return repository.save(motivo);
    }

    public Motivo atualizar(Long id, MotivoRequest request) {
        var motivo = buscarPorId(id);
        motivo.setAlteracao(LocalDateTime.now());
        return IMotivoMapper.INSTANCE.update(request, motivo);
        
//        return MotivoMapper.update(request, motivo);
    }

    public Motivo buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "O motivo não foi encontrado"
        ));
    }

    public void remover(Long id) {
        var motivo = buscarPorId(id);
        try {
            repository.delete(motivo);
            repository.flush();
        } catch (DataIntegrityViolationException e) {
            //Ao invés de emitir uma exceção, faremos a exclusão lógica
            motivo.setStatus(Status.INATIVO);
            repository.save(motivo);
            repository.flush();
        }
    }

    public List<Motivo> buscarTodos() {
        return repository.findAll();
    }
}
