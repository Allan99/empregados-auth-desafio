package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.demo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
