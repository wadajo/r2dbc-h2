package com.graphql.r2dbc.repository;

import com.graphql.r2dbc.entity.ObraEntity;
import com.graphql.r2dbc.model.Obra;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ObraRepository extends R2dbcRepository<ObraEntity,Long> {

    @Query("SELECT * FROM obras WHERE titulo = :titulo)")
    Collection<Obra> encontrarPorTitulo(String titulo);


}
