package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Membro;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MembroController {
    @Autowired
    private MembroRepository rep;


    @RequestMapping("membros.html")
    public ModelAndView membros() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        List<Membro> membros = rep.findAll();
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("membros-listar/{idSede}")
    public ModelAndView membros(@PathVariable Long idSede)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros-listar");
        List<Membro> membros = rep.findAllBySede(idSede);
        mv.addObject("membros",membros);
        return mv;
    }

    @RequestMapping("membro-cadastrar")
    public ModelAndView membroCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-cadastrar");
        return mv;
    }

    @RequestMapping(value = "membro-cadastrar", method = RequestMethod.POST)
    public ModelAndView membroCadastrarPost(@RequestBody Membro membro){
        rep.save(membro);
        ModelAndView mv = new ModelAndView();
        mv.addObject("cadastro", true);
        mv.setViewName("membro-cadastrar");
        return mv;
    }

    @RequestMapping("membro-alterar/{id}")
    public ModelAndView membroAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("membro",rep.getOne(id));
        mv.setViewName("membro-alterar");
        return mv;
    }
    @RequestMapping(value = "membro-alterar", method = RequestMethod.POST)
    public ModelAndView membroAlterarPost(@RequestBody Membro membro){
        ModelAndView mv = new ModelAndView();
        rep.save(membro);
        mv.addObject("alteracao", true);
        mv.setViewName("membro-alterar");
        return mv;
    }

    @RequestMapping("membro-deletar/{id}")
    public ModelAndView membroDeletar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-deletar");
        rep.deleteById(id);
        return  mv;
    }

}
