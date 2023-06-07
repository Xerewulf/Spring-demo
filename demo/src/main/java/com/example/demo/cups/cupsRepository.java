package com.example.demo.cups;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;


//Responsible for data access
@Repository
public interface cupsRepository extends JpaRepository<Cups,Integer>
{
    @Query(value = "SELECT  s FROM  Cups s WHERE  s.name = ?1",nativeQuery = true)
    Optional<Cups> findCupsByName(String name);

}
