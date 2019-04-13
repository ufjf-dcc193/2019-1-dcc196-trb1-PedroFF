package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class SedeController {
    @Autowired
    private SedeRepository repSede;

    @RequestMapping("sedes.html")
    public ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        List<Sede> sedes = repSede.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @GetMapping("sede-cadastrar")
    public ModelAndView sedeCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-cadastrar");
        return mv;
    }

    @PostMapping("sede-cadastrar")
    public ModelAndView sedeCadastrarPost(@RequestBody Sede sede){
        repSede.save(sede);
        ModelAndView mv = new ModelAndView();
        mv.addObject("cadastro", true);
        mv.setViewName("sede-cadastrar");
        return mv;
    }

    @RequestMapping("sede-alterar/{id}")
    public ModelAndView sedeAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("sede",repSede.getOne(id));
        mv.setViewName("sede-alterar");
        return mv;
    }
    @RequestMapping(value = "sede-alterar", method = RequestMethod.POST)
    public ModelAndView sedeAlterarPost(@RequestBody Sede sede){
        ModelAndView mv = new ModelAndView();
        repSede.save(sede);
        mv.addObject("alteracao", true);
        mv.setViewName("sede-alterar");
        return mv;
    }

    @RequestMapping("sede-deletar/{id}")
    public ModelAndView sedeDeletar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-deletar");
        repSede.deleteById(id);
        return  mv;
    }
}
