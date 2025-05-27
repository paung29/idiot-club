package com.project.idiotclub.app.util.community;

import java.time.LocalDateTime;

public class CommunityCreateResponseDto {

    private Long communityId;
    private String communityName;
    private String description;
    private String image;
    private LocalDateTime createAt;
    private String creatorName;
    private String creatorEmail;
    private Long communityInfoId;
    private Integer memberCount;

    // No-args constructor
    public CommunityCreateResponseDto() {}

    // All-args constructor
    public CommunityCreateResponseDto(Long communityId, String communityName, String description, String image,
                                      LocalDateTime createAt, String creatorName, String creatorEmail,
                                      Long communityInfoId, Integer memberCount) {
        this.communityId = communityId;
        this.communityName = communityName;
        this.description = description;
        this.image = image;
        this.createAt = createAt;
        this.creatorName = creatorName;
        this.creatorEmail = creatorEmail;
        this.communityInfoId = communityInfoId;
        this.memberCount = memberCount;
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

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
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

    public Long getCommunityInfoId() {
        return communityInfoId;
    }

    public void setCommunityInfoId(Long communityInfoId) {
        this.communityInfoId = communityInfoId;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }
}