package com.graphql.r2dbc.controller;

import com.graphql.r2dbc.entity.ObraEntity;
import com.graphql.r2dbc.model.Obra;
import com.graphql.r2dbc.repository.ObraRepository;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class ObraController {

    ObraRepository obraRepository;
    ConnectionFactory connectionFactory;

    public ObraController(ObraRepository obraRepository, ConnectionFactory connectionFactory) {
        this.obraRepository = obraRepository;
        this.connectionFactory = connectionFactory;
    }

    @QueryMapping
    public Flux<ObraEntity> obras(){
        R2dbcEntityTemplate template = new R2dbcEntityTemplate(connectionFactory);
        Flux<ObraEntity> all = template.select(ObraEntity.class).from("obras").all();

        return all;
    }
}
