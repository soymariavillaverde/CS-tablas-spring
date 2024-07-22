package dev.maria.springRelatioins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public class AlumnoRepository {
    public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    }
}
