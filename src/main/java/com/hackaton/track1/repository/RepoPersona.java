package com.hackaton.track1.repository;

import com.hackaton.track1.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoPersona extends JpaRepository<Persona, Long> {

}
