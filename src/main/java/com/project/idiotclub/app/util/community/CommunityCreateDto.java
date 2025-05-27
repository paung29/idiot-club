package com.project.idiotclub.app.util.community;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CommunityCreateDto {

    @NotBlank(message = "Community name is required")
    private String communityName;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Image is required")
    private String image;

    @NotNull(message = "Community creator id is required")
    private Long communityCreatorId;

    // No-args constructor
    public CommunityCreateDto() {}

    // All-args constructor
    public CommunityCreateDto(String communityName, String description, String image, Long communityCreatorId) {
        this.communityName = communityName;
        this.description = description;
        this.image = image;
        this.communityCreatorId = communityCreatorId;
    }

    // Getters and Setters
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

    public Long getCommunityCreatorId() {
        return communityCreatorId;
    }

    public void setCommunityCreatorId(Long communityCreatorId) {
        this.communityCreatorId = communityCreatorId;
    }
}