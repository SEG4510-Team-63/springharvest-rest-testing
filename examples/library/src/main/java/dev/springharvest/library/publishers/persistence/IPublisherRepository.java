package dev.springharvest.library.publishers.persistence;

import dev.springharvest.crud.persistence.IBaseCrudRepository;
import dev.springharvest.library.publishers.models.entities.PublisherEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublisherRepository extends IBaseCrudRepository<PublisherEntity, Long> {
}
