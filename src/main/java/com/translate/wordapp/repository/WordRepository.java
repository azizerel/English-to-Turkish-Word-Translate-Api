package com.translate.wordapp.repository;

import com.translate.wordapp.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Abdulaziz Erel on 23:27 09.06.2020
 **/
@Repository
public interface WordRepository extends JpaRepository<WordEntity, Long> {

}
