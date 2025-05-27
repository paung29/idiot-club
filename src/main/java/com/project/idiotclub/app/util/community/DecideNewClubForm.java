package com.project.idiotclub.app.util.community;

import com.project.idiotclub.app.entity.RequestStatus;

public class DecideNewClubForm {

    private Long creatorId;
    private Long communityId;
    private Long createClubRequestId;
    private RequestStatus requestStatus;

    // No-args constructor
    public DecideNewClubForm() {}

    // All-args constructor
    public DecideNewClubForm(Long creatorId, Long communityId, Long createClubRequestId, RequestStatus requestStatus) {
        this.creatorId = creatorId;
        this.communityId = communityId;
        this.createClubRequestId = createClubRequestId;
        this.requestStatus = requestStatus;
    }

    // Getters and Setters
    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getCreateClubRequestId() {
        return createClubRequestId;
    }

    public void setCreateClubRequestId(Long createClubRequestId) {
        this.createClubRequestId = createClubRequestId;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}