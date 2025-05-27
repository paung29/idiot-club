package com.project.idiotclub.app.entity.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.RequestStatus;
import com.project.idiotclub.app.entity.community.Community;
import com.project.idiotclub.app.entity.community.CommunityCreator;
import jakarta.persistence.*;

@Entity
@Table(name = "create_club_request")
public class CreateClubRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "club_name")
    private String clubName;

    @Column(name = "club_description")
    private String clubDescription;

    @Column(name = "club_leader_name")
    private String clubLeaderName;

    @Column(name = "reason_to_create_club")
    private String reasonToCreateClub;

    @Column(name = "club_logo")
    @Lob
    private String clubLogo;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    @ManyToOne
    @JoinColumn(name = "club_lader_id")
    @JsonIgnore
    private User clubLeader;

    @ManyToOne
    @JoinColumn(name = "community_creator_id", nullable = false)
    @JsonIgnore
    private CommunityCreator communityCreator;

    @ManyToOne
    @JoinColumn(name = "community_id", nullable = false)
    @JsonIgnore
    private Community community;

    // No-args constructor
    public CreateClubRequest() {}

    // All-args constructor
    public CreateClubRequest(Long id, String clubName, String clubDescription, String clubLeaderName,
                             String reasonToCreateClub, String clubLogo, RequestStatus status,
                             User clubLeader, CommunityCreator communityCreator, Community community) {
        this.id = id;
        this.clubName = clubName;
        this.clubDescription = clubDescription;
        this.clubLeaderName = clubLeaderName;
        this.reasonToCreateClub = reasonToCreateClub;
        this.clubLogo = clubLogo;
        this.status = status;
        this.clubLeader = clubLeader;
        this.communityCreator = communityCreator;
        this.community = community;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public String getClubLeaderName() {
        return clubLeaderName;
    }

    public void setClubLeaderName(String clubLeaderName) {
        this.clubLeaderName = clubLeaderName;
    }

    public String getReasonToCreateClub() {
        return reasonToCreateClub;
    }

    public void setReasonToCreateClub(String reasonToCreateClub) {
        this.reasonToCreateClub = reasonToCreateClub;
    }

    public String getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public User getClubLeader() {
        return clubLeader;
    }

    public void setClubLeader(User clubLeader) {
        this.clubLeader = clubLeader;
    }

    public CommunityCreator getCommunityCreator() {
        return communityCreator;
    }

    public void setCommunityCreator(CommunityCreator communityCreator) {
        this.communityCreator = communityCreator;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
}