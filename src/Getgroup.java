public class Getgroup {
    private String groupName;
    private String courseName;

    public Getgroup(String groupName, String courseName) {
        this.groupName = groupName;
        this.courseName = courseName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void getnameofgroup() {
        System.out.println("Group Name: " + groupName);
    }

    public void getnameofcourse() {
        System.out.println("Course Name: " + courseName);
    }
}
