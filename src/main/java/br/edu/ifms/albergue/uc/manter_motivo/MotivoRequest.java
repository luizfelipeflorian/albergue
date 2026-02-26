/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import br.edu.ifms.albergue.uc.manter_regras.RegraResponse;

/**
 *
 * @author 1513003
 */
public class MotivoRequest {
    private String nome;
    private String descricao;
    private RegraResponse regra;

    public MotivoRequest() {
    }

    public MotivoRequest(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RegraResponse getRegra() {
        return regra;
    }

    public void setRegra(RegraResponse regra) {
        this.regra = regra;
    }
}
