package br.matheus.fatecrl.MCVlicao.controller;

import br.matheus.fatecrl.MCVlicao.models.Peixe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/peixe")
public class PeixeController {

    private static final List<Peixe> peixes = new ArrayList<Peixe>();

    public PeixeController(){
        peixes.add(new Peixe("Baiacu","venenoso",5,0.25 ));
        peixes.add(new Peixe("Espada","comestível",6,0.75 ));
        peixes.add(new Peixe("Pescada Branca","comestível",5,0.35 ));
    }

    @GetMapping
    public String getPeixes(Model model){
        model.addAttribute("peixes", peixes);
        return "peixes";
    }
}
