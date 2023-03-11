package kea.project.superhero_v4.Repositories;

import kea.project.superhero_v4.Models.Superhero;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepositoryInterface {
    List<Superhero> getAllCreationYear();
    List<Superhero> getSpecificCreationYear(String heroname);
    List<Superhero> getAllSuperpowersAmount();
    List<Superhero> getSpecificSuperpowersAmount(String heroname);
    List<Superhero> getAllSuperpowers();
    List<Superhero> getSpecificSuperpowers(String heroname);
    List<Superhero> getAllCity();
    List<Superhero> getSpecificCity(String heroname);
}
