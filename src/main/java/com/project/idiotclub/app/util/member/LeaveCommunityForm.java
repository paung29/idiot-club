package com.project.idiotclub.app.util.member;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

public class LeaveCommunityForm {

    @NotNull(message = "community id is required")
    private Long communityId;
    @NotNull(message = "user id is required")
    private Long userId;


    public LeaveCommunityForm() {
    }

    public LeaveCommunityForm(Long communityId, Long userId) {
        this.communityId = communityId;
        this.userId = userId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
