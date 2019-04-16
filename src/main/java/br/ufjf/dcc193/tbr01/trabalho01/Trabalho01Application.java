package br.ufjf.dcc193.tbr01.trabalho01;

import br.ufjf.dcc193.tbr01.trabalho01.models.Membro;
import br.ufjf.dcc193.tbr01.trabalho01.models.Sede;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.MembroRepository;
import br.ufjf.dcc193.tbr01.trabalho01.repositories.SedeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Trabalho01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Trabalho01Application.class, args);
        SedeRepository rep = ctx.getBean(SedeRepository.class);
        Sede sede1 = new Sede("Sede São Paulo", "SP", "São Paulo", "Guarulhos", "(11) 1234-5678", "www.google.com");
        Sede sede2 = new Sede("Sede Juiz de Fora", "MG", "Juiz de Fora", "Cascatinha", "(32) 1234-5678", "www.google.com");
        rep.save(sede1);
        rep.save(sede2);

        MembroRepository memRep = ctx.getBean(MembroRepository.class);
        Membro membro = new Membro("Zeca","Tesoureiro", "zeca@gmail.com",null ,null, sede1);
        Membro membro2 = new Membro("Lucas","Presidente", "lucas@gmail.com",null ,null, sede1);
        Membro membro3 = new Membro("Maria","Vice-Presidente", "maria@gmail.com",null ,null, sede1);
        Membro membro4 = new Membro("Pablo","RH", "pablo@gmail.com",null ,null, sede2);
        memRep.save(membro);
        memRep.save(membro2);
        memRep.save(membro3);
        memRep.save(membro4);
    }

}
