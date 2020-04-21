package com.Integradora.terminalTester.repositories;

import com.Integradora.terminalTester.models.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface RegistroRepository extends JpaRepository<Registro,Integer>{

    @Query(value = "select codeen,elitem, count(elitem) from registro  where codeen =:code7 group by codeen,elitem order by count(elitem) desc",nativeQuery = true)
    Collection<Object> obtenerComponente7(String code7);
}
