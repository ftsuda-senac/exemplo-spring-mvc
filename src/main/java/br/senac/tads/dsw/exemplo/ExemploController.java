package br.senac.tads.dsw.exemplo;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo-dinamico")
public class ExemploController {
    
    @GetMapping
    public ModelAndView gerarInfos() {
        ModelAndView mv = new ModelAndView("index-dinamico");
        mv.addObject("titulo", "Exemplo página dinâmica - Texto criado no Controller");
        mv.addObject("dataHora", LocalDateTime.now());
        return mv;
    }
    
}
