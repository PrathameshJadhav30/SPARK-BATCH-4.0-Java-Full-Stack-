package com.Prathamesh.BookMyShow.repository;

import com.Prathamesh.BookMyShow.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Long>
{
    List<Theater> findByCity(String city);

}