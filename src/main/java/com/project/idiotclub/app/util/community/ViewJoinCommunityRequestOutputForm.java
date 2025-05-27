package com.project.idiotclub.app.util.community;

public class ViewJoinCommunityRequestOutputForm {

	private String userName;
	private String userPhoto;
	private Long userId;
	private Long joinCommunityRequestId;

	// No-args constructor
	public ViewJoinCommunityRequestOutputForm() {}

	// All-args constructor
	public ViewJoinCommunityRequestOutputForm(String userName, String userPhoto, Long userId, Long joinCommunityRequestId) {
		this.userName = userName;
		this.userPhoto = userPhoto;
		this.userId = userId;
		this.joinCommunityRequestId = joinCommunityRequestId;
	}

	// Getters and Setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getJoinCommunityRequestId() {
		return joinCommunityRequestId;
	}

	public void setJoinCommunityRequestId(Long joinCommunityRequestId) {
		this.joinCommunityRequestId = joinCommunityRequestId;
	}
}