/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.albergue.uc.manter_regras;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper
public interface IRegraMapper {

    IRegraMapper INSTANCE = Mappers
            .getMapper(IRegraMapper.class);

    RegraResponse toDto(Regra entity);

    List<RegraResponse> toDtoList(List<Regra> items);

    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "status", ignore = true)
    Regra toEntity(RegraResponse dto);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "status", ignore = true)
    Regra toEntity(RegraRequest dto);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "criacao", ignore = true)
    @Mapping(target = "alteracao", ignore = true)
    @Mapping(target = "status", ignore = true)
    Regra update(RegraRequest dto, 
            @MappingTarget Regra entity);
}
