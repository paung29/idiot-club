package com.project.idiotclub.app.util.community;

import com.project.idiotclub.app.entity.RequestStatus;

public class CheckForm {

    private RequestStatus requestStatus;
    private Long joinCommunityRequestId;
    private Long userId;
    private Long communityCreatorId;
    private Long communityId;

    // No-args constructor
    public CheckForm() {}

    // All-args constructor
    public CheckForm(RequestStatus requestStatus, Long joinCommunityRequestId, Long userId,
                     Long communityCreatorId, Long communityId) {
        this.requestStatus = requestStatus;
        this.joinCommunityRequestId = joinCommunityRequestId;
        this.userId = userId;
        this.communityCreatorId = communityCreatorId;
        this.communityId = communityId;
    }

    // Getters and Setters
    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Long getJoinCommunityRequestId() {
        return joinCommunityRequestId;
    }

    public void setJoinCommunityRequestId(Long joinCommunityRequestId) {
        this.joinCommunityRequestId = joinCommunityRequestId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCommunityCreatorId() {
        return communityCreatorId;
    }

    public void setCommunityCreatorId(Long communityCreatorId) {
        this.communityCreatorId = communityCreatorId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }
}