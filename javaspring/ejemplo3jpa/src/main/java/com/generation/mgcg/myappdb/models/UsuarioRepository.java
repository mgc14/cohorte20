package com.generation.mgcg.myappdb.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long> {
}
