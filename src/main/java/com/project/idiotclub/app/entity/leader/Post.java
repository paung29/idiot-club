package com.project.idiotclub.app.entity.leader;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.member.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String message;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    @JsonIgnore
    private MyClub myClub;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // No-args constructor
    public Post() {}

    // All-args constructor
    public Post(long id, String message, User user, MyClub myClub, LocalDateTime createdAt) {
        this.id = id;
        this.message = message;
        this.user = user;
        this.myClub = myClub;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MyClub getMyClub() {
        return myClub;
    }

    public void setMyClub(MyClub myClub) {
        this.myClub = myClub;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}