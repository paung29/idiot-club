package com.project.idiotclub.app.util.clubleader;

import jakarta.validation.constraints.NotNull;

public class ChangeLeaderForm {

    @NotNull
    private Long currentLeaderId;

    @NotNull
    private Long newLeaderId;

    @NotNull
    private Long clubId;

    // No-args constructor
    public ChangeLeaderForm() {}

    // All-args constructor
    public ChangeLeaderForm(Long currentLeaderId, Long newLeaderId, Long clubId) {
        this.currentLeaderId = currentLeaderId;
        this.newLeaderId = newLeaderId;
        this.clubId = clubId;
    }

    // Getters and Setters
    public Long getCurrentLeaderId() {
        return currentLeaderId;
    }

    public void setCurrentLeaderId(Long currentLeaderId) {
        this.currentLeaderId = currentLeaderId;
    }

    public Long getNewLeaderId() {
        return newLeaderId;
    }

    public void setNewLeaderId(Long newLeaderId) {
        this.newLeaderId = newLeaderId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }
}