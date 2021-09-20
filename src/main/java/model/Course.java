package model;

public class Course {

	private int courseId;
	private String courseName;
	private String courseDesc;
	private int fee;
	private String courseResource;
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, String courseDesc, int fee, String courseResource) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.fee = fee;
		this.courseResource = courseResource;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getCourseResource() {
		return courseResource;
	}
	public void setCourseResource(String courseResource) {
		this.courseResource = courseResource;
	}
	
	
}
