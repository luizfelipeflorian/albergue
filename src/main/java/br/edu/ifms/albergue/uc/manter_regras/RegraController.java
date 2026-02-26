/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_regras;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nicho
 */
@RestController
@RequestMapping("/api/regra")
public class RegraController {
    
    @Autowired
    private RegraService service;
    
    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody RegraRequest req) {
        service.salvar(req);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping
    public List<RegraResponse> findAll() {
        List<Regra> lista = service.buscarTodos();
        List<RegraResponse> listaResponse = IRegraMapper
                .INSTANCE.toDtoList(lista);
        return listaResponse;
    }
    
}
