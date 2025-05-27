package com.project.idiotclub.app.util.member;

public class JoinClubForm {

    private Long clubId;
    private Long communityId;
    private Long userId;
    private String reasonToJoinThisClub;

    // No-args constructor
    public JoinClubForm() {}

    // All-args constructor
    public JoinClubForm(Long clubId, Long communityId, Long userId, String reasonToJoinThisClub) {
        this.clubId = clubId;
        this.communityId = communityId;
        this.userId = userId;
        this.reasonToJoinThisClub = reasonToJoinThisClub;
    }

    // Getters and Setters
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReasonToJoinThisClub() {
        return reasonToJoinThisClub;
    }

    public void setReasonToJoinThisClub(String reasonToJoinThisClub) {
        this.reasonToJoinThisClub = reasonToJoinThisClub;
    }
}