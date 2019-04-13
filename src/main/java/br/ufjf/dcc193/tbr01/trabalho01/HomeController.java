package br.ufjf.dcc193.tbr01.trabalho01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"", "index.html"})
    public String home(){
        return "home";
    }

    @RequestMapping("sedes.html")
    public String sede(){
        return "sede";
    }

    @RequestMapping("atividades.html")
    public String atividades(){
        return "atividades";
    }

    @RequestMapping("membros.html")
    public String membros(){
        return "membros";
    }
}
