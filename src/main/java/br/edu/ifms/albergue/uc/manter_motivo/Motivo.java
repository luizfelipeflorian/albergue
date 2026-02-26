/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import br.edu.ifms.albergue.uc.manter_regras.Regra;
import br.edu.ifms.albergue.uc.manter_regras.Status;
import br.edu.ifms.albergue.uc.padrao.Padrao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "motivo_sequence", name = "baseSequence", allocationSize = 1)
public class Motivo extends Padrao {

    @Column(nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(optional = false)
    private Regra regra;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Regra getRegra() {
        return regra;
    }

    public void setRegra(Regra regra) {
        this.regra = regra;
    }

    @Override
    public String toString() {
        return "Motivo{" + super.toString()
                + ", " + regra.toString()
                + ", descricao=" + descricao + ", status=" + status + '}';
    }

}
