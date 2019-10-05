package com.certicom.biometria.asistcerticomservice.controller;

import com.certicom.biometria.asistcerticomservice.model.Personal;
import com.certicom.biometria.asistcerticomservice.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private Environment env;

    @Autowired
    private PersonalService personalService;


    @GetMapping("/listAll")
    public List<Personal> getAllPersonal() {
        System.out.println("ENTRANDO A LISTA");
        List<Personal> personals = personalService.findAll();
        System.out.println(personals);
        return personals;
    }

    @RequestMapping("/personal/{dni}")
    public Personal getPersonalById(@PathVariable String dni) {
        System.out.println("ENTRANDO A LISTA");
        Personal personals = personalService.findByDniAndEstado(dni);
        System.out.println(personals);
        return personals;
    }
    @RequestMapping("/horariobypersonal/{dni}")
    public Personal getHorarioByPersonal(@PathVariable String dni) {
        System.out.println("ENTRANDO A LISTA");
        Personal personals = personalService.findByDniAndEstado(dni);
        System.out.println(personals);
        return personals;
    }
}
