package com.project.idiotclub.app.entity.leader;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.member.JoinClubRequest;
import com.project.idiotclub.app.entity.member.User;
import com.project.idiotclub.app.entity.community.Community;
import com.project.idiotclub.app.entity.member.JoinedClubs;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "my_club")
public class MyClub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "club_id")
    private Long id;

    @Column(name = "club_name")
    private String name;

    @Column(name = "club_description")
    private String description;

    @Column(name = "club_logo")
    @Lob
    private String logo;

    @OneToMany(mappedBy = "myClub")
    @JsonIgnore
    private List<JoinClubRequest> joinClubRequests;

    @ManyToOne
    @JoinColumn(name = "community_id")
    @JsonIgnore
    private Community community;

    @OneToMany(mappedBy = "myClub")
    @JsonIgnore
    private List<Post> posts;

    @OneToMany(mappedBy = "myClub")
    @JsonIgnore
    private List<JoinedClubs> joinedClubs;

    @ManyToOne
    @JoinColumn(name = "club_leader_id", nullable = false)
    @JsonIgnore
    private User clubLeader;

    // No-args constructor
    public MyClub() {}

    // All-args constructor
    public MyClub(Long id, String name, String description, String logo,
                  List<JoinClubRequest> joinClubRequests, Community community,
                  List<Post> posts, List<JoinedClubs> joinedClubs, User clubLeader) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.logo = logo;
        this.joinClubRequests = joinClubRequests;
        this.community = community;
        this.posts = posts;
        this.joinedClubs = joinedClubs;
        this.clubLeader = clubLeader;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<JoinClubRequest> getJoinClubRequests() {
        return joinClubRequests;
    }

    public void setJoinClubRequests(List<JoinClubRequest> joinClubRequests) {
        this.joinClubRequests = joinClubRequests;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<JoinedClubs> getJoinedClubs() {
        return joinedClubs;
    }

    public void setJoinedClubs(List<JoinedClubs> joinedClubs) {
        this.joinedClubs = joinedClubs;
    }

    public User getClubLeader() {
        return clubLeader;
    }

    public void setClubLeader(User clubLeader) {
        this.clubLeader = clubLeader;
    }
}