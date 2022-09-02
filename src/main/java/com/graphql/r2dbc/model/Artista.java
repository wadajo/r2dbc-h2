package com.graphql.r2dbc.model;
import java.util.Collection;

public class Artista {
    private Long id;

    private String apellido;

    private Integer nacimiento;

    private Collection<Obra> obras;
}
