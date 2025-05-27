package com.project.idiotclub.app.entity.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.ClubRole;
import com.project.idiotclub.app.entity.leader.MyClub;
import jakarta.persistence.*;

@Entity
@Table(name = "joined_clubs")
public class JoinedClubs {

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

    @Column(name = "membership_role", nullable = false)
    @Enumerated(EnumType.STRING)
    private ClubRole role;

    // No-args constructor
    public JoinedClubs() {}

    // All-args constructor
    public JoinedClubs(Long id, User user, MyClub myClub, ClubRole role) {
        this.id = id;
        this.user = user;
        this.myClub = myClub;
        this.role = role;
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

    public ClubRole getRole() {
        return role;
    }

    public void setRole(ClubRole role) {
        this.role = role;
    }
}