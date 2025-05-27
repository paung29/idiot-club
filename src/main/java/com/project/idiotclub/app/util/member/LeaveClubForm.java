package com.project.idiotclub.app.util.member;


import jakarta.validation.constraints.NotNull;
import lombok.Data;


public class LeaveClubForm {

    @NotNull(message = "community id is required")
    private Long communityId;
    @NotNull(message = "club id is required")
    private Long clubId;
    @NotNull(message = "user id is required")
    private Long userId;


    public LeaveClubForm() {
    }

    public LeaveClubForm(Long communityId, Long clubId, Long userId) {
        this.communityId = communityId;
        this.clubId = clubId;
        this.userId = userId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
