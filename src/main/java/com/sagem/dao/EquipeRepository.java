package com.sagem.dao;

import com.sagem.entity.Equipe;
import com.sagem.entity.Ligne;
import com.sagem.entity.Planning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    @Query("select  l from Equipe  l inner join l.detai_plannings dp where dp.planning=:planning")
    List<Equipe> findByPlannings(Planning planning);
}

