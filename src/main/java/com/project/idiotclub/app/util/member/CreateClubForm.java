package com.project.idiotclub.app.util.member;

public class CreateClubForm {

    private Long userId;
    private Long communityId;
    private String clubName;
    private String clubDescription;
    private String clubLogo;
    private String reasonToCreateClub;

    // No-args constructor
    public CreateClubForm() {}

    // All-args constructor
    public CreateClubForm(Long userId, Long communityId, String clubName, String clubDescription, String clubLogo, String reasonToCreateClub) {
        this.userId = userId;
        this.communityId = communityId;
        this.clubName = clubName;
        this.clubDescription = clubDescription;
        this.clubLogo = clubLogo;
        this.reasonToCreateClub = reasonToCreateClub;
    }

    // Getters and Setters
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

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public String getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

    public String getReasonToCreateClub() {
        return reasonToCreateClub;
    }

    public void setReasonToCreateClub(String reasonToCreateClub) {
        this.reasonToCreateClub = reasonToCreateClub;
    }
}