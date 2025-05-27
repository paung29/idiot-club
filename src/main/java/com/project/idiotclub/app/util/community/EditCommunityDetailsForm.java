package com.project.idiotclub.app.util.community;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EditCommunityDetailsForm {

    @NotNull
    private Long communityId;

    @NotNull
    private Long leaderId;

    @NotBlank
    private String newCommunityName;

    @NotBlank
    private String newCommunityDescription;

    @NotBlank
    private String newCommunityLogo;

    // No-args constructor
    public EditCommunityDetailsForm() {}

    // All-args constructor
    public EditCommunityDetailsForm(Long communityId, Long leaderId, String newCommunityName,
                                    String newCommunityDescription, String newCommunityLogo) {
        this.communityId = communityId;
        this.leaderId = leaderId;
        this.newCommunityName = newCommunityName;
        this.newCommunityDescription = newCommunityDescription;
        this.newCommunityLogo = newCommunityLogo;
    }

    // Getters and Setters
    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getNewCommunityName() {
        return newCommunityName;
    }

    public void setNewCommunityName(String newCommunityName) {
        this.newCommunityName = newCommunityName;
    }

    public String getNewCommunityDescription() {
        return newCommunityDescription;
    }

    public void setNewCommunityDescription(String newCommunityDescription) {
        this.newCommunityDescription = newCommunityDescription;
    }

    public String getNewCommunityLogo() {
        return newCommunityLogo;
    }

    public void setNewCommunityLogo(String newCommunityLogo) {
        this.newCommunityLogo = newCommunityLogo;
    }
}