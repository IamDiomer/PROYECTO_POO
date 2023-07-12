package org.example.repositorio;

import org.example.models.Comic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepositorio extends CrudRepository<Comic,Long> {

}
