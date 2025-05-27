package com.project.idiotclub.app.auth.dto;

import com.project.idiotclub.app.util.community.CommunityCreateResponseDto;


public class LoginOutputDto {

	private Long communityCreatorId;
	private String creatorName;
	private String creatorEmail;
	private String creatorPassword;
	private String creatorPhoto;
	private boolean hasCommunity;
	private CommunityCreateResponseDto communityInfo;

	// No-args constructor
	public LoginOutputDto() {}

	// All-args constructor
	public LoginOutputDto(Long communityCreatorId, String creatorName, String creatorEmail,
						  String creatorPassword, String creatorPhoto, boolean hasCommunity,
						  CommunityCreateResponseDto communityInfo) {
		this.communityCreatorId = communityCreatorId;
		this.creatorName = creatorName;
		this.creatorEmail = creatorEmail;
		this.creatorPassword = creatorPassword;
		this.creatorPhoto = creatorPhoto;
		this.hasCommunity = hasCommunity;
		this.communityInfo = communityInfo;
	}

	// Getters and Setters
	public Long getCommunityCreatorId() {
		return communityCreatorId;
	}

	public void setCommunityCreatorId(Long communityCreatorId) {
		this.communityCreatorId = communityCreatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCreatorEmail() {
		return creatorEmail;
	}

	public void setCreatorEmail(String creatorEmail) {
		this.creatorEmail = creatorEmail;
	}

	public String getCreatorPassword() {
		return creatorPassword;
	}

	public void setCreatorPassword(String creatorPassword) {
		this.creatorPassword = creatorPassword;
	}

	public String getCreatorPhoto() {
		return creatorPhoto;
	}

	public void setCreatorPhoto(String creatorPhoto) {
		this.creatorPhoto = creatorPhoto;
	}

	public boolean isHasCommunity() {
		return hasCommunity;
	}

	public void setHasCommunity(boolean hasCommunity) {
		this.hasCommunity = hasCommunity;
	}

	public CommunityCreateResponseDto getCommunityInfo() {
		return communityInfo;
	}

	public void setCommunityInfo(CommunityCreateResponseDto communityInfo) {
		this.communityInfo = communityInfo;
	}
}
