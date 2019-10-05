package com.certicom.biometria.asistcerticomservice.service;

import com.certicom.biometria.asistcerticomservice.model.Personal;

import java.util.List;

public interface PersonalService {

    List<Personal> findAll();

    Personal findByDniAndEstado(String dni);
}
