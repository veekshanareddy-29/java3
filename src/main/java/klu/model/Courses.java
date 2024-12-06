package klu.model;

public class Courses {
	String coursecode;
	String courseTitle;
	double credits;
	
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Courses [coursecode=" + coursecode + ", courseTitle=" + courseTitle + ", credits=" + credits + "]";
	}
}
