package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Atividade;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AtividadeController {
    @Autowired
    private AtividadeRepository rep;

    @RequestMapping("atividades.html")
    public ModelAndView atividades() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("atividades-sede/{idSede}")
    public ModelAndView membros(@PathVariable Long idSede)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades-sede");
        List<Atividade> atividades = rep.findAllBySede(idSede);
        mv.addObject("atividades",atividades);
        return mv;
    }

    @RequestMapping("atividade-cadastrar")
    public ModelAndView membroCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-cadastrar");
        return mv;
    }

    @RequestMapping(value = "atividade-cadastrar", method = RequestMethod.POST)
    public ModelAndView membroCadastrarPost(@RequestBody Atividade Atividade){
        rep.save(Atividade);
        ModelAndView mv = new ModelAndView();
        mv.addObject("cadastro", true);
        mv.setViewName("atividade-cadastrar");
        return mv;
    }

    @RequestMapping("atividade-alterar/{id}")
    public ModelAndView membroAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("atividade",rep.getOne(id));
        mv.setViewName("atividade-alterar");
        return mv;
    }
    @RequestMapping(value = "atividade-alterar", method = RequestMethod.POST)
    public ModelAndView membroAlterarPost(@RequestBody Atividade atividade){
        ModelAndView mv = new ModelAndView();
        rep.save(atividade);
        mv.addObject("alteracao", true);
        mv.setViewName("atividade-alterar");
        return mv;
    }

    @RequestMapping("atividade-deletar/{id}")
    public ModelAndView membroDeletar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-deletar");
        rep.deleteById(id);
        return  mv;
    }
}
