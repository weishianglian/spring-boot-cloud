package me.wslian.cloud.repository;

import me.wslian.cloud.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Override
    Book getOne(Integer id);

    @Override
    List<Book> findAll();

    @Override
    Page<Book> findAll(Pageable pageable);

    @Override
    Book save(Book book);

    @Override
    @RestResource(exported = false)
    void delete(Book book);
}
