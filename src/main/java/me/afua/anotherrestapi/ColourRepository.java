package me.afua.anotherrestapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ColourRepository extends CrudRepository<Colour, Long> {
}
