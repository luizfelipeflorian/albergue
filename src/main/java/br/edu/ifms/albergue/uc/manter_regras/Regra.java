/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_regras;

import br.edu.ifms.albergue.uc.padrao.Padrao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@SequenceGenerator(sequenceName = "regra_sequence", name = "baseSequence", allocationSize = 1)
public class Regra extends Padrao {

    @ToString.Include
    @Column(nullable = false)
    private Long numeroDeDiarias;

    @ToString.Include
    @Column(columnDefinition = "varchar(255) default 'ATIVO'")
    @Enumerated(EnumType.STRING)
    private Status status;

}
