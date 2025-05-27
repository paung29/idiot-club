package com.project.idiotclub.app.util.clubleader;

import com.project.idiotclub.app.entity.RequestStatus;

public class NewJoinClubRequestDecideForm {

    private Long communityId;
    private Long clubLeaderId;
    private Long clubId;
    private Long joinClubRequestId;
    private RequestStatus requestStatus;

    // No-args constructor
    public NewJoinClubRequestDecideForm() {}

    // All-args constructor
    public NewJoinClubRequestDecideForm(Long communityId, Long clubLeaderId, Long clubId,
                                        Long joinClubRequestId, RequestStatus requestStatus) {
        this.communityId = communityId;
        this.clubLeaderId = clubLeaderId;
        this.clubId = clubId;
        this.joinClubRequestId = joinClubRequestId;
        this.requestStatus = requestStatus;
    }

    // Getters and Setters
    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getClubLeaderId() {
        return clubLeaderId;
    }

    public void setClubLeaderId(Long clubLeaderId) {
        this.clubLeaderId = clubLeaderId;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public Long getJoinClubRequestId() {
        return joinClubRequestId;
    }

    public void setJoinClubRequestId(Long joinClubRequestId) {
        this.joinClubRequestId = joinClubRequestId;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}