public class IsinfoStudent {
    private String fullName;
    private String knowledge;
    private String phoneNumber;
    private String email;

    public IsinfoStudent(String fullName, String knowledge, String phoneNumber, String email) {
        this.fullName = fullName;
        this.knowledge = knowledge;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void infoStudent() {
        System.out.println("Student Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Knowledge: " + knowledge);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
