package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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

    @GetMapping("sede-cadastrar.html")
    public ModelAndView sedeCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-cadastrar");
        return mv;
    }

    @PostMapping("sede-cadastrar.html")
    public RedirectView sedeCadastrarPost(Sede sede){
        repSede.save(sede);
        return new RedirectView("/sedes.html?cadastrado=true");
    }

    @RequestMapping("sede-editar/{id}.html")
    public ModelAndView sedeAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("sede",repSede.getOne(id));
        mv.setViewName("sede-editar");
        return mv;
    }
    @RequestMapping(value = "sede-editar.html", method = RequestMethod.POST)
    public RedirectView sedeAlterarPost(Sede sede){
        repSede.save(sede);
        return new RedirectView("/sedes.html?alterado=true");
    }

    @RequestMapping("sede-deletar/{id}.html")
    public RedirectView sedeDeletar(@PathVariable Long id){
        repSede.deleteById(id);
        return new RedirectView("/sedes.html?deletado=true");
    }
}
