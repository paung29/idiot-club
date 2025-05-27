package com.project.idiotclub.app.util.member;

import lombok.Data;


public class ReadPostForm {

    private Long clubId;
    private Long communityId;

    public ReadPostForm(Long clubId, Long communityId) {
        this.clubId = clubId;
        this.communityId = communityId;
    }

    public ReadPostForm() {
    }

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
}
