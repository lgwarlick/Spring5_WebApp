package net.loganwarlick.Spring5WebApp.repositories;

import net.loganwarlick.Spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
