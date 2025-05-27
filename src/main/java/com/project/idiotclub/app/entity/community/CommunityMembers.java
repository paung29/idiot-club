package com.project.idiotclub.app.entity.community;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.member.User;
import jakarta.persistence.*;

@Entity
@Table(name = "community_members")
public class CommunityMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "community_id")
    @JsonIgnore
    private Community community;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    // No-args constructor
    public CommunityMembers() {}

    // All-args constructor
    public CommunityMembers(Long id, Community community, User user) {
        this.id = id;
        this.community = community;
        this.user = user;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}