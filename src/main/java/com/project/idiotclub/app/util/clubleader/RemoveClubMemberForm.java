package com.project.idiotclub.app.util.clubleader;

import jakarta.validation.constraints.NotNull;

public class RemoveClubMemberForm {

    @NotNull
    private Long leaderId;

    @NotNull
    private Long clubId;

    @NotNull
    private Long memberId;

    // No-args constructor
    public RemoveClubMemberForm() {}

    // All-args constructor
    public RemoveClubMemberForm(Long leaderId, Long clubId, Long memberId) {
        this.leaderId = leaderId;
        this.clubId = clubId;
        this.memberId = memberId;
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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}