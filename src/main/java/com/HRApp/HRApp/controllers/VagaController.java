package com.HRApp.HRApp.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.HRApp.HRApp.models.Vaga;
import com.HRApp.repository.CandidatoRepository;
import com.HRApp.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import com.HRApp.HRApp.models.Candidato;


@Controller
public class VagaController {
    private VagaRepository vr;
    private CandidatoRepository cr;

    // Cadastrar vaga
    @RequestMapping(value = "cadastrarVaga", method = RequestMethod.GET)
    public String form(){
        return "vaga/formVaga";
    }

    @RequestMapping(value = "/cadastrarVaga", method = RequestMethod.POST)
    public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Please check the information and try again.");
            return "redirect:/cadastrarVaga";
        }
        vr.save(vaga);
        attributes.addFlashAttribute("mensagem", "Job opportunity successfully registered");;

        return "redirect:/cadastrarVaga";
    }

    // Listar vagas
    @RequestMapping("/vagas")
    public ModelAndView listaVagas(){
        ModelAndView mv = new ModelAndView("vaga/listaVaga");
        Iterable<Vaga> vagas = vr.findAll();
        mv.addObject("vagas", vagas);
        return mv;
    }

    // Busca no banco de dados
    @RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
    public ModelAndView detalhesVaga(@PathVariable("codigo") long codigo){
        Vaga vaga = vr.findByCodigo(codigo);
        ModelAndView mv = new ModelAndView("vaga/detalhesVaga");
        mv.addObject("vaga", vaga);
        Iterable<Candidato> candidatos = cr.findByVaga(vaga);
        mv.addObject("candidatos", candidatos);
        return mv;
    }


}
