package com.HRApp.HRApp.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.HRApp.HRApp.models.Candidato;
import com.HRApp.HRApp.models.Vaga;
import com.HRApp.repository.CandidatoRepository;
import com.HRApp.repository.VagaRepository;


@Controller
public class VagaController {
    private VagaRepository vr;
    private CandidatoRepository cr;

    // Cadastrar vaga
    @RequestMapping(value = "cadastrarVaga", method = RequestMethod.GET)
    public String form(){
        return "vaga/formVaga";
    }
}
