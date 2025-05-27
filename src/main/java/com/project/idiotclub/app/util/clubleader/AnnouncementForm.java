package com.project.idiotclub.app.util.clubleader;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AnnouncementForm {

    @NotNull(message = "Leader ID is required")
    private Long leaderId;

    @NotNull(message = "Club ID is required")
    private Long clubId;

    @NotNull(message = "Community ID is required")
    private Long communityId;

    @NotBlank(message = "Message cannot be empty")
    private String message;

    // No-args constructor
    public AnnouncementForm() {}

    // All-args constructor
    public AnnouncementForm(Long leaderId, Long clubId, Long communityId, String message) {
        this.leaderId = leaderId;
        this.clubId = clubId;
        this.communityId = communityId;
        this.message = message;
    }

    // Getters and Setters
    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}