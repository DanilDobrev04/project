public class RegisterWhiteBoxTest {

    public static void main(String[] args) {
        testConstructor();
        testGetFirstName();
        testSetFirstName();
        testGetLastName();
        testSetLastName();
        // Додайте інші тести
    }

    public static void testConstructor() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        assert register.getFirstName().equals("John");
        assert register.getLastName().equals("Doe");
        assert register.getMiddleName().equals("Smith");
        assert register.getKnowlage().equals("Java Programming");
        assert register.getNumberPhone() == 1234567890;
        assert register.getGmail().equals("johndoe@gmail.com");
    }

    public static void testGetFirstName() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        assert register.getFirstName().equals("John");
    }

    public static void testSetFirstName() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        register.setFirstName("Jane");
        assert register.getFirstName().equals("Jane");
    }

    public static void testGetLastName() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        assert register.getLastName().equals("Doe");
    }

    public static void testSetLastName() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        register.setLastName("Smith");
        assert register.getLastName().equals("Smith");
    }



}
