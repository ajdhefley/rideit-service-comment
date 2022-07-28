package com.github.ajdhefley.rideit.services.comment.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="comments")
public class Comment {

    @Id
    @Column(name="commentid", nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer commentId;

    @Column(name="body")
    private String body;

    @Column(name="likecount")
    private Integer likeCount;

    @Column(name="timestamp")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name="userid", nullable=false, updatable=false)
    private CommentAuthor author;

    @ManyToOne
    @JoinColumn(name="coasterid")
    private Coaster coaster;

    public Integer getCommentId() {
        return this.commentId;
    }

    public String getBody() {
        return this.body;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public CommentAuthor getAuthor() {
        return this.author;
    }

}