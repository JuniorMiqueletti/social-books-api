package br.com.juniormiqueletti.socialbooks.repository;

import br.com.juniormiqueletti.socialbooks.domain.document.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository  extends MongoRepository<Comment, String> {
}
