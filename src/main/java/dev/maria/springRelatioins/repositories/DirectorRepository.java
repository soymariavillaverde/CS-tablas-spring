package dev.maria.springRelatioins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.maria.springRelatioins.models.Director;



public interface DirectorRepository extends JpaRepository<Director, Long> {
}