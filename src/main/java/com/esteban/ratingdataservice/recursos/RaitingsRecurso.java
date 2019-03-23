package com.esteban.ratingdataservice.recursos;

import com.esteban.ratingdataservice.modelos.Raiting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/raitings")
public class RaitingsRecurso {

    @GetMapping("/usuario/{idUsuario}")
    public List<Raiting> getPeliculaInfo(@PathVariable String idUsuario){

        // TODO logica que retona la lista de peliculas que vio el ususario

        List<Raiting> raitings = Arrays.asList(
                new Raiting("123",2),
                new Raiting("124",5)
        );
        return raitings;
    }

}
