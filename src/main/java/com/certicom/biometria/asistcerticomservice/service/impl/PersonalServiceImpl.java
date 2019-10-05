package com.certicom.biometria.asistcerticomservice.service.impl;

import com.certicom.biometria.asistcerticomservice.model.Personal;
import com.certicom.biometria.asistcerticomservice.repository.PersonalRepository;
import com.certicom.biometria.asistcerticomservice.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository repository;

    @Override
    public List<Personal> findAll() {
        return repository.findAll();
    }

    @Override
    public Personal findByDniAndEstado(String dni) {
        return repository.findByDni(dni);
    }
}
