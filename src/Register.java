public class Register {
    private String firstName;
    private String lastName;
    private String middleName;
    private String knowlage;
    private long numberPhone;
    private  String gmail;

    public Register(String firstName, String lastName, String middleName, String knowlage, long numberPhone, String gmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.knowlage = knowlage;
        this.numberPhone = numberPhone;
        this.gmail = gmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getKnowlage() {
        return knowlage;
    }

    public void setKnowlage(String knowlage) {
        this.knowlage = knowlage;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

}
