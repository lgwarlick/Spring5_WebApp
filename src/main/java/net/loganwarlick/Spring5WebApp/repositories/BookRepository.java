package net.loganwarlick.Spring5WebApp.repositories;

import net.loganwarlick.Spring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
