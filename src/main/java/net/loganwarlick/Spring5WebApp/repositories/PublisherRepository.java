package net.loganwarlick.Spring5WebApp.repositories;

import net.loganwarlick.Spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
