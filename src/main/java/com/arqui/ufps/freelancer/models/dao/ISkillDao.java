package com.arqui.ufps.freelancer.models.dao;

import com.arqui.ufps.freelancer.models.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillDao extends JpaRepository<Skill, Integer> {
}