package com.github.ajdhefley.rideit.services.comment.repository;

import com.github.ajdhefley.rideit.services.comment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query("SELECT c FROM Comment c WHERE c.coaster.url=:url")
    public List<Comment> findByUrl(@Param("url") String coasterUrl);

}