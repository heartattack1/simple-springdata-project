package com.tenshun.repository;

import com.tenshun.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 10.05.2016.
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
