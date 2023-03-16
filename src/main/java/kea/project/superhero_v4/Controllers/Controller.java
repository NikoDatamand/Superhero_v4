package kea.project.superhero_v4.Controllers;

import kea.project.superhero_v4.Models.Superhero;
//import kea.project.superhero_v4.Services.Service;
import kea.project.superhero_v4.Repositories.IRepositoryInterface;
import kea.project.superhero_v4.Repositories.Repository_DB;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("Superhelte")

public class Controller {

    Repository_DB superheroDatabase;

    public Controller(ApplicationContext context, @Value("${superhero.repository.impl}") String impl) {
        //superheroDatabase = (Repository_DB) context.getBean(impl);
    }

    private Service superheroService;

    public Controller(Service superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping(path="/")
    public ResponseEntity<List<Superhero>> getSuperheroDatabase() {
        List superheroList = superheroService.getSuperheroes();
        return new ResponseEntity<List<Superhero>>(superheroList, HttpStatus.OK);
    }

    @GetMapping(path="/{navn}")
    public ResponseEntity<String> getSuperhero(@PathVariable String navn){
        Superhero superhero = superheroService.getSuperhero(navn);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");

        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getName() + " " + superhero.getAge()+ " " + superhero.getSuperpower() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }

    @GetMapping(path="/superpower/count/{navn}")
    public ResponseEntity<String> getSuperhero(@PathVariable String navn){
        Superhero superhero = superheroService.getSuperhero(navn);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");

        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getName() + " " + superhero.getAge()+ " " + superhero.getSuperpower() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }

     @GetMapping(path="/superpower/{navn}")
    public ResponseEntity<String> getSuperhero(@PathVariable String navn){
        Superhero superhero = superheroService.getSuperhero(navn);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");

        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getName() + " " + superhero.getAge()+ " " + superhero.getSuperpower() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }

    @GetMapping(path="/city/{navn}")
    public ResponseEntity<String> getSuperhero(@PathVariable String navn){
        Superhero superhero = superheroService.getSuperhero(navn);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");

        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getName() + " " + superhero.getAge()+ " " + superhero.getSuperpower() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }
     
    }
