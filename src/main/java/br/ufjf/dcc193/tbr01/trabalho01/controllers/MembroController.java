package br.ufjf.dcc193.tbr01.trabalho01.controllers;

import br.ufjf.dcc193.tbr01.trabalho01.models.Membro;
import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.MembroRepository;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MembroController {

    @Autowired
    private MembroRepository rep;
    @Autowired
    private SedeRepository sedeRep;


    @RequestMapping("membros.html")
    public ModelAndView membros() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        List<Membro> membros = rep.findAll();
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("membros-sede/{idSede}.html")
    public ModelAndView membros(@PathVariable Long idSede)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros-sede");
        List<Membro> membros = rep.findAllBySede(idSede);
        mv.addObject("membros",membros);
        return mv;
    }

    @RequestMapping("membro-cadastrar.html")
    public ModelAndView membroCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-cadastrar");
        List<Sede> sedes = sedeRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping(value = "membro-cadastrar.html", method = RequestMethod.POST)
    public RedirectView membroCadastrarPost(Membro membro){
        rep.save(membro);
        return new RedirectView("/membros.html?cadastrado=true");
    }

    @RequestMapping("membro-editar/{id}.html")
    public ModelAndView membroAlterar(@PathVariable Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("membro",rep.getOne(id));
        mv.setViewName("membro-editar");
        List<Sede> sedes = sedeRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }
    @RequestMapping(value = "membro-editar.html", method = RequestMethod.POST)
    public RedirectView membroAlterarPost( Membro membro){
        rep.save(membro);
        return new RedirectView("/membros.html?alterado=true");
    }

    @RequestMapping("membro-deletar/{id}.html")
    public RedirectView membroDeletar(@PathVariable Long id){
        rep.deleteById(id);
        return new RedirectView("/membros.html?deletado=true");
    }

}
