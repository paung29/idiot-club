package com.project.idiotclub.app.entity.community;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.idiotclub.app.entity.member.CreateClubRequest;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "community_creator")
public class CommunityCreator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long communityCreatorId;

    @Column(name = "creator_name", nullable = false)
    private String creatorName;

    @Column(name = "creator_email", unique = true)
    private String creatorEmail;

    @Column(name = "creator_password", nullable = false)
    private String creatorPassword;

    @Lob
    private String creatorPhoto;

    @OneToOne(mappedBy = "communityCreator")
    @JsonBackReference
    private Community community;

    @OneToMany(mappedBy = "communityCreator")
    @JsonIgnore
    private List<CreateClubRequest> createClubRequests;

    // No-args constructor
    public CommunityCreator() {}

    // All-args constructor
    public CommunityCreator(long communityCreatorId, String creatorName, String creatorEmail,
                            String creatorPassword, String creatorPhoto, Community community,
                            List<CreateClubRequest> createClubRequests) {
        this.communityCreatorId = communityCreatorId;
        this.creatorName = creatorName;
        this.creatorEmail = creatorEmail;
        this.creatorPassword = creatorPassword;
        this.creatorPhoto = creatorPhoto;
        this.community = community;
        this.createClubRequests = createClubRequests;
    }

    // Getters and Setters

    public long getCommunityCreatorId() {
        return communityCreatorId;
    }

    public void setCommunityCreatorId(long communityCreatorId) {
        this.communityCreatorId = communityCreatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorEmail() {
        return creatorEmail;
    }

    public void setCreatorEmail(String creatorEmail) {
        this.creatorEmail = creatorEmail;
    }

    public String getCreatorPassword() {
        return creatorPassword;
    }

    public void setCreatorPassword(String creatorPassword) {
        this.creatorPassword = creatorPassword;
    }

    public String getCreatorPhoto() {
        return creatorPhoto;
    }

    public void setCreatorPhoto(String creatorPhoto) {
        this.creatorPhoto = creatorPhoto;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public List<CreateClubRequest> getCreateClubRequests() {
        return createClubRequests;
    }

    public void setCreateClubRequests(List<CreateClubRequest> createClubRequests) {
        this.createClubRequests = createClubRequests;
    }
}