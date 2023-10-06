public class IsCourse {
    private String courseName;
    private double price;

    public IsCourse(String courseName, double price) {
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void timeofstudy() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Time of Study: 6 weeks");
    }

    public void add() {
        System.out.println("Course added successfully!");
    }
}
