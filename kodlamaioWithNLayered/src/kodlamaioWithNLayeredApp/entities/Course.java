package kodlamaioWithNLayeredApp.entities;

public class Course {
    private int id;
    private String courseName;
    private double coursePrice;
    private String categoryName;
    private String instructorName;

    public Course() {
    }

    public Course(int id, String courseName, double coursePrice, String categoryName, String instructorName) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.categoryName = categoryName;
        this.instructorName = instructorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
