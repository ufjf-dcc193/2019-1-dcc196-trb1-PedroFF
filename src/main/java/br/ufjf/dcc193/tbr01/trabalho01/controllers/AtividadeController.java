package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Atividade;
import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AtividadeController {
    @Autowired
    private AtividadeRepository repAtividade;

    @RequestMapping("atividades.html")
    public ModelAndView atividades() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividade> atividades = repAtividade.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }
}
