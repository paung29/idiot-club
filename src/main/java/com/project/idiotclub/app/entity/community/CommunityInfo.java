package com.project.idiotclub.app.entity.community;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "community_info")
public class CommunityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "communityInfo")
    @JsonBackReference
    private Community community;

    @Column(name = "club_count")
    private int clubCount;

    // No-args constructor
    public CommunityInfo() {}

    // All-args constructor
    public CommunityInfo(Long id, Community community, int clubCount) {
        this.id = id;
        this.community = community;
        this.clubCount = clubCount;
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

    public int getClubCount() {
        return clubCount;
    }

    public void setClubCount(int clubCount) {
        this.clubCount = clubCount;
    }
}