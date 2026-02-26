/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_motivo;

import br.edu.ifms.albergue.uc.manter_regras.IRegraMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper(
        uses = { IRegraMapper.class }
)
public interface IMotivoMapper {
    
    IMotivoMapper INSTANCE = Mappers.getMapper(IMotivoMapper.class);
    
    MotivoResponse toDto(Motivo entity);
    List<MotivoResponse> toDtoList(List<Motivo> items);
    
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "descricao", ignore = true)
    Motivo toEntity(MotivoResponse dto);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "status", ignore = true)
    Motivo toEntity(MotivoRequest dto);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "status", ignore = true)
    Motivo update(MotivoRequest dto,
            @MappingTarget Motivo entity);
}
