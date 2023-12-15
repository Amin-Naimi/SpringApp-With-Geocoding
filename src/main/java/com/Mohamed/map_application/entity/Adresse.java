package com.Mohamed.map_application.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

    private String rue;
    private String ville;
    private String pays;
}
