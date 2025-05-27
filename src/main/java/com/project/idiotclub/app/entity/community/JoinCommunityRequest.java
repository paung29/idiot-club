package com.project.idiotclub.app.entity.community;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.RequestStatus;
import com.project.idiotclub.app.entity.member.User;
import jakarta.persistence.*;

@Entity
@Table(name = "join_community_request")
public class JoinCommunityRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "request_description")
    private String requestDescription;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "community_id", nullable = false)
    @JsonIgnore
    private Community community;

    @Enumerated(EnumType.STRING)
    @Column(name = "request_status")
    private RequestStatus status;

    // No-args constructor
    public JoinCommunityRequest() {}

    // All-args constructor
    public JoinCommunityRequest(Long id, String requestDescription, User user,
                                Community community, RequestStatus status) {
        this.id = id;
        this.requestDescription = requestDescription;
        this.user = user;
        this.community = community;
        this.status = status;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }
}