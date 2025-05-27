package com.project.idiotclub.app.util.clubleader;

public class EditMyClubDescriptionForm {

    private Long leaderId;
    private Long clubId;
    private String newDescription;

    // No-args constructor
    public EditMyClubDescriptionForm() {}

    // All-args constructor
    public EditMyClubDescriptionForm(Long leaderId, Long clubId, String newDescription) {
        this.leaderId = leaderId;
        this.clubId = clubId;
        this.newDescription = newDescription;
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

    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }
}