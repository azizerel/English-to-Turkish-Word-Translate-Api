package repository;

import entity.WordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Abdulaziz Erel on 23:27 09.06.2020
 **/
@Repository
public interface WordRepository extends CrudRepository<WordEntity, Long> {
}
