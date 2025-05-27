package com.project.idiotclub.app.util.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


public class JoinCommunityRequestDto {

    @NotBlank(message = "request Description is Required")
    private String requestDescription;
    @NotNull(message = "user id is required")
    private Long userId;
    @NotNull(message = "community id is required")
    private Long communityId;

    public JoinCommunityRequestDto() {
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public JoinCommunityRequestDto(String requestDescription, Long userId, Long communityId) {
        this.requestDescription = requestDescription;
        this.userId = userId;
        this.communityId = communityId;
    }
}
