package com.project.idiotclub.app.entity.community;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.idiotclub.app.entity.leader.MyClub;
import com.project.idiotclub.app.entity.member.CreateClubRequest;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "community")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long communityId;

    @Column(name = "community_name", nullable = false, updatable = false)
    private String communityName;

    @Column(name = "description", nullable = false, updatable = true)
    private String description;

    @Column(name = "community_image", nullable = false, updatable = true)
    @Lob
    private String image;

    @Column(name = "craete_at")
    private LocalDateTime createTime;

    @OneToOne
    @JoinColumn(name = "community_creator_id", nullable = false, unique = true)
    @JsonManagedReference
    private CommunityCreator communityCreator;

    @OneToMany(mappedBy = "community")
    @JsonIgnore
    private List<CommunityMembers> communityMembers;

    @OneToMany(mappedBy = "community")
    @JsonIgnore
    private List<MyClub> myClubs;

    @OneToMany(mappedBy = "community")
    @JsonIgnore
    private List<JoinCommunityRequest> joinCommunityRequests;

    @OneToOne
    @JoinColumn(name = "community_info_id")
    @JsonManagedReference
    private CommunityInfo communityInfo;

    @OneToMany(mappedBy = "community")
    @JsonIgnore
    private List<CreateClubRequest> createClubRequests;

    // No-args constructor
    public Community() {}

    // All-args constructor
    public Community(Long communityId, String communityName, String description, String image,
                     LocalDateTime createTime, CommunityCreator communityCreator,
                     List<CommunityMembers> communityMembers, List<MyClub> myClubs,
                     List<JoinCommunityRequest> joinCommunityRequests, CommunityInfo communityInfo,
                     List<CreateClubRequest> createClubRequests) {
        this.communityId = communityId;
        this.communityName = communityName;
        this.description = description;
        this.image = image;
        this.createTime = createTime;
        this.communityCreator = communityCreator;
        this.communityMembers = communityMembers;
        this.myClubs = myClubs;
        this.joinCommunityRequests = joinCommunityRequests;
        this.communityInfo = communityInfo;
        this.createClubRequests = createClubRequests;
    }

    // Getters and Setters

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public CommunityCreator getCommunityCreator() {
        return communityCreator;
    }

    public void setCommunityCreator(CommunityCreator communityCreator) {
        this.communityCreator = communityCreator;
    }

    public List<CommunityMembers> getCommunityMembers() {
        return communityMembers;
    }

    public void setCommunityMembers(List<CommunityMembers> communityMembers) {
        this.communityMembers = communityMembers;
    }

    public List<MyClub> getMyClubs() {
        return myClubs;
    }

    public void setMyClubs(List<MyClub> myClubs) {
        this.myClubs = myClubs;
    }

    public List<JoinCommunityRequest> getJoinCommunityRequests() {
        return joinCommunityRequests;
    }

    public void setJoinCommunityRequests(List<JoinCommunityRequest> joinCommunityRequests) {
        this.joinCommunityRequests = joinCommunityRequests;
    }

    public CommunityInfo getCommunityInfo() {
        return communityInfo;
    }

    public void setCommunityInfo(CommunityInfo communityInfo) {
        this.communityInfo = communityInfo;
    }

    public List<CreateClubRequest> getCreateClubRequests() {
        return createClubRequests;
    }

    public void setCreateClubRequests(List<CreateClubRequest> createClubRequests) {
        this.createClubRequests = createClubRequests;
    }
}