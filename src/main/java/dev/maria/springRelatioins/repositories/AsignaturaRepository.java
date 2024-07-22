package dev.maria.springRelatioins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.maria.springRelatioins.models.Asignatura;


public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
