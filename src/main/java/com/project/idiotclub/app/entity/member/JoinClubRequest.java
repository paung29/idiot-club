package com.project.idiotclub.app.entity.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.RequestStatus;
import com.project.idiotclub.app.entity.leader.MyClub;
import jakarta.persistence.*;

@Entity
@Table(name = "join_club_request")
public class JoinClubRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    @JsonIgnore
    private MyClub myClub;

    @Column(name = "reason_to_join")
    private String reasonToJoin;

    @Enumerated(EnumType.STRING)
    @Column(name = "request_status")
    private RequestStatus requestStatus;

    // No-args constructor
    public JoinClubRequest() {}

    // All-args constructor
    public JoinClubRequest(Long id, User user, MyClub myClub, String reasonToJoin, RequestStatus requestStatus) {
        this.id = id;
        this.user = user;
        this.myClub = myClub;
        this.reasonToJoin = reasonToJoin;
        this.requestStatus = requestStatus;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getReasonToJoin() {
        return reasonToJoin;
    }

    public void setReasonToJoin(String reasonToJoin) {
        this.reasonToJoin = reasonToJoin;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}