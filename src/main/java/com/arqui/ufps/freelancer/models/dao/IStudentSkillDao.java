package com.arqui.ufps.freelancer.models.dao;

import com.arqui.ufps.freelancer.models.entities.StudentSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentSkillDao extends JpaRepository<StudentSkill, Integer> {
}