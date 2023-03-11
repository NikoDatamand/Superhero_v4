package kea.project.superhero_v4.Dto;

import java.util.List;

public class Superhero_DTO {

    private int HERO_ID;
    private String HERO_NAME;
    private String REAL_NAME;
    private int CREATION_YEAR;
    private List<String> SUPERPOWERS;
    private int SUPERPOWRES_AMOUNT = SUPERPOWERS.size();
    private String CITY;
}
