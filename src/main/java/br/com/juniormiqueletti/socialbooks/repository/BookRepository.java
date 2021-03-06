package br.com.juniormiqueletti.socialbooks.repository;

import br.com.juniormiqueletti.socialbooks.domain.document.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String> {
    Optional<Book> findById(String id);
    void deleteById(String id);
    List<Book> findByNameLikeIgnoreCase(String name);
    List<Book> findAllBy(TextCriteria textCriteria, Pageable pageable);
}
