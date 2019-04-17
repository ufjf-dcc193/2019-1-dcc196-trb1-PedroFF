package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Atividade;
import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.AtividadeRepository;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AtividadeController {
    @Autowired
    private AtividadeRepository rep;

    @Autowired
    private SedeRepository sedeRep;


    @RequestMapping("atividades.html")
    public ModelAndView atividades() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("atividades-sede/{idSede}.html")
    public ModelAndView atividades(@PathVariable Long idSede)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades-sede");
        List<Atividade> atividades = rep.findAllBySede(idSede);
        mv.addObject("atividades",atividades);
        return mv;
    }

    @RequestMapping("atividade-cadastrar.html")
    public ModelAndView atividadeCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-cadastrar");
        List<Sede> sedes = sedeRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping(value = "atividade-cadastrar.html", method = RequestMethod.POST)
    public RedirectView atividadeCadastrarPost(Atividade Atividade){
        rep.save(Atividade);
        return new RedirectView("/atividades.html?cadastrado=true");
    }

    @RequestMapping("/atividade-editar/{id}.html")
    public ModelAndView atividadeAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("atividade",rep.getOne(id));
        mv.setViewName("atividade-editar");
        List<Sede> sedes = sedeRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }
    @RequestMapping(value = "/atividade-editar.html", method = RequestMethod.POST)
    public RedirectView atividadeAlterarPost(Atividade atividade){
        rep.save(atividade);
        return new RedirectView("/atividades.html?alterado=true");
    }

    @RequestMapping("/atividade-deletar/{id}.html")
    public RedirectView atividadeDeletar(@PathVariable Long id){
        rep.deleteById(id);
        return new RedirectView("/atividades.html?deletado=true");
    }
}
