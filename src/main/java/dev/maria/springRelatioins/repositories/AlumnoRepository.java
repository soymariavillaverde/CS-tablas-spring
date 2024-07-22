package dev.maria.springRelatioins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.maria.springRelatioins.models.Alumno;

    public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    }

