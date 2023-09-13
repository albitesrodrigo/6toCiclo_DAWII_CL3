package com.sistemabackbautista.repository;

import com.sistemabackbautista.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface AutomovilRepository extends JpaRepository<Automovil,Long> {
}
