/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 1513003
 */
@Tag(name = "Manter Motivos de hospedagem", 
        description = """
                    Serviço utilizado para manter os dados 
                    de motivos que serão utilizados na hora de 
                    registrar a diária do hóspede.
                    """)
@RestController
@RequestMapping("/api/motivo")
public class MotivoController {
    
    @Autowired
    private MotivoService service;
    
    @Operation(
            summary = "Criar motivo",
            description = "Cria um novo motivo de hospedagem no albergue")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", 
                    description = """
                                  Criação de motivo efetuada com sucesso.
                                  """)
    })
    @PostMapping
    public ResponseEntity<MotivoResponse> adicionar(
            @RequestBody MotivoRequest request,
            UriComponentsBuilder builder
    ) {
        Motivo motivo = service.salvar(request);
        MotivoResponse response = IMotivoMapper.INSTANCE.toDto(motivo);
//        MotivoResponse response = MotivoMapper.toResponse(motivo);
        var uri = builder.path("api/motivo/{id}")
                .buildAndExpand(motivo.getId())
                .toUri();
        return ResponseEntity.created(uri).body(response);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<MotivoResponse> alterar(
            @PathVariable Long id,
            @RequestBody MotivoRequest request
    ) {
        var motivo = service.atualizar(id, request);
        var response = IMotivoMapper.INSTANCE.toDto(motivo);
        //var response = MotivoMapper.toResponse(motivo);
        return ResponseEntity.ok(response);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(
            @PathVariable Long id
    ) {
        service.remover(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping
    public List<MotivoResponse> findAll() {
        List<Motivo> lista = service.buscarTodos();
        List<MotivoResponse> listaResponse = new LinkedList();
        for(int i = 0; i < lista.size(); i++) {
            Motivo motivo = lista.get(i);
            MotivoResponse response = IMotivoMapper.INSTANCE.toDto(motivo);
//            MotivoResponse response = MotivoMapper.toResponse(motivo);
            listaResponse.add(response);
        }
        return listaResponse;
    }
}
