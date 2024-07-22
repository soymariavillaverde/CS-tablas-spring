package dev.maria.springRelatioins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.maria.springRelatioins.models.Escuela;

public interface EscuelaRepository extends JpaRepository<Escuela, Long> {
}
