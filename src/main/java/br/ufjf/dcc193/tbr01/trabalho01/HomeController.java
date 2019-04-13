package br.ufjf.dcc193.tbr01.trabalho01;

import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.AtividadeRepository;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.MembroRepository;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SedeRepository repSede;
    @Autowired
    private AtividadeRepository repAtividade;
    @Autowired
    private MembroRepository repMembro;

    @RequestMapping({"", "index.html"})
    public String home() {
        return "home";
    }

    @RequestMapping("sedes.html")
    public ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        List<Sede> sedes = repSede.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("atividades.html")
    public ModelAndView atividades() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Sede> atividades = repSede.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("membros.html")
    public ModelAndView membros() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        List<Sede> membros = repSede.findAll();
        mv.addObject("membros", membros);
        return mv;
    }
}
