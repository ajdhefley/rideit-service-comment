package com.github.ajdhefley.rideit.services.comment;

import com.github.ajdhefley.rideit.services.comment.model.Comment;
import com.github.ajdhefley.rideit.services.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/comments/{coasterUrl}")
    public ResponseEntity<List<Comment>> getReviewsByCoasterUrl(@PathVariable("coasterUrl") String coasterUrl) {
        return new ResponseEntity<>(this.commentRepository.findByUrl(coasterUrl), HttpStatus.OK);
    }

}
