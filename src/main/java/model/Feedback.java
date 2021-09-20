package model;

public class Feedback {

	private int userId;
	private int feedbackId;
	private String userName;
	private String email;
	private String feedback;
	
	public Feedback(int userId, int feedbackId, String userName, String email, String feedback) {
		super();
		this.userId = userId;
		this.feedbackId = feedbackId;
		this.userName = userName;
		this.email = email;
		this.feedback = feedback;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
