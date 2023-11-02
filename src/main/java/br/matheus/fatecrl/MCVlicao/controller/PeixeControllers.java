package br.matheus.fatecrl.MCVlicao.controller;

import br.matheus.fatecrl.MCVlicao.models.Peixe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/peixe")
public class PeixeControllers {
    private static final List<Peixe> peixes = new ArrayList<Peixe>();

    public PeixeControllers(){
        peixes.add(new Peixe("Tubarão","comestivel",5000,2.35 ));
        peixes.add(new Peixe("Baleia","comestível",10000,6.0 ));
        peixes.add(new Peixe("Enguia","elétrico",10,1.0));
    }
    @GetMapping
    public List<Peixe> getPeixes(){
        return peixes;
    }
}
