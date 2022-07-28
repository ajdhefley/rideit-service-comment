package com.github.ajdhefley.rideit.services.comment.model;

import javax.persistence.*;

@Entity
@Table(name="coasters")
public class Coaster {

    @Id
    @Column(name="coasterid", nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer coasterId;

    @Column(name="url")
    private String url;

}
