/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import br.edu.ifms.albergue.uc.manter_regras.RegraResponse;
import br.edu.ifms.albergue.uc.manter_regras.Status;

/**
 *
 * @author 1513003
 */
public class MotivoResponse {
    private Long id;
    private String nome;
    private Status status;
    private RegraResponse regra;

    public MotivoResponse() {
    }

    public MotivoResponse(Long id, String nome, Status status, RegraResponse regra) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.regra = regra;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Status getStatus() {
        return status;
    }

    public RegraResponse getRegra() {
        return regra;
    }
}
