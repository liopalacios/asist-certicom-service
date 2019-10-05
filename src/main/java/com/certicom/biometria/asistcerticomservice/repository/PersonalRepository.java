package com.certicom.biometria.asistcerticomservice.repository;

import com.certicom.biometria.asistcerticomservice.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
    Personal findByDni(String dni);
}
