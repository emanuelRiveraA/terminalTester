package com.Integradora.terminalTester.repositories;


import com.Integradora.terminalTester.models.Componentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ComponentesRepository extends JpaRepository<Componentes,Long> {

    /*@Query(value = "select * from componentes c where c.code7en = :code", nativeQuery = true)
    public List<Componentes> obtenerComponente(String code);*/

    @Query(value = "select c.custpn, pn.caracter from componentes c inner join partnumber pn on c.CUSTPN=pn.custpn where c.CODE7EN = :code AND c.elitem = :referencia", nativeQuery = true)
    public List<Object> obtenerComponente(String code, String referencia);

    @Query(value = "select code7en,elitem, count(elitem) from componentes  where code7en =:code7 group by code7en,elitem order by count(elitem) desc",nativeQuery = true)
    Collection<Object> obtenerComponente7(String code7);


}
