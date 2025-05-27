package com.project.idiotclub.app.entity.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.ClubRole;
import com.project.idiotclub.app.entity.community.CommunityMembers;
import com.project.idiotclub.app.entity.community.JoinCommunityRequest;
import com.project.idiotclub.app.entity.leader.Post;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", updatable = false, nullable = false)
    private String name;

    @Column(name = "user_email", updatable = false, nullable = false)
    private String email;

    @Column(name = "user_password", updatable = false, nullable = false)
    private String password;

    @Column(name = "user_profile_image")
    private String profile_image;

    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private ClubRole role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<CommunityMembers> communityMembers;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<JoinClubRequest> joinClubRequests;

    @OneToMany(mappedBy = "clubLeader")
    @JsonIgnore
    private List<CreateClubRequest> createClubRequest;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<JoinedClubs> joinedClubs;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<JoinCommunityRequest> joinCommunityRequest;

    // No-args constructor (required by JPA)
    public User() {}

    // All-args constructor
    public User(Long id, String name, String email, String password, String profile_image, ClubRole role,
                List<Post> posts, List<CommunityMembers> communityMembers, List<JoinClubRequest> joinClubRequests,
                List<CreateClubRequest> createClubRequest, List<JoinedClubs> joinedClubs,
                List<JoinCommunityRequest> joinCommunityRequest) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile_image = profile_image;
        this.role = role;
        this.posts = posts;
        this.communityMembers = communityMembers;
        this.joinClubRequests = joinClubRequests;
        this.createClubRequest = createClubRequest;
        this.joinedClubs = joinedClubs;
        this.joinCommunityRequest = joinCommunityRequest;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public ClubRole getRole() {
        return role;
    }

    public void setRole(ClubRole role) {
        this.role = role;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<CommunityMembers> getCommunityMembers() {
        return communityMembers;
    }

    public void setCommunityMembers(List<CommunityMembers> communityMembers) {
        this.communityMembers = communityMembers;
    }

    public List<JoinClubRequest> getJoinClubRequests() {
        return joinClubRequests;
    }

    public void setJoinClubRequests(List<JoinClubRequest> joinClubRequests) {
        this.joinClubRequests = joinClubRequests;
    }

    public List<CreateClubRequest> getCreateClubRequest() {
        return createClubRequest;
    }

    public void setCreateClubRequest(List<CreateClubRequest> createClubRequest) {
        this.createClubRequest = createClubRequest;
    }

    public List<JoinedClubs> getJoinedClubs() {
        return joinedClubs;
    }

    public void setJoinedClubs(List<JoinedClubs> joinedClubs) {
        this.joinedClubs = joinedClubs;
    }

    public List<JoinCommunityRequest> getJoinCommunityRequest() {
        return joinCommunityRequest;
    }

    public void setJoinCommunityRequest(List<JoinCommunityRequest> joinCommunityRequest) {
        this.joinCommunityRequest = joinCommunityRequest;
    }
}