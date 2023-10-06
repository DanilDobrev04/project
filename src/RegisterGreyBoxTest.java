public class RegisterGreyBoxTest {

    public static void main(String[] args) {
        testFullNameFormatting();
        testPhoneNumberValidation();

    }

    public static void testFullNameFormatting() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        String fullName = register.getLastName() + ", " + register.getFirstName() + " " + register.getMiddleName();
        assert fullName.equals("Doe, John Smith");
    }

    public static void testPhoneNumberValidation() {
        Register register = new Register("John", "Doe", "Smith", "Java Programming", 1234567890, "johndoe@gmail.com");
        long phoneNumber = register.getNumberPhone();
        assert isValidPhoneNumber(phoneNumber);
    }


    private static boolean isValidPhoneNumber(long phoneNumber) {
        String phoneNumberString = String.valueOf(phoneNumber);
        // Перевірка на наявність 10 цифр
        if (phoneNumberString.length() != 10) {
            return false;
        }
        // Перевірка на префіксну комбінацію "+1"
        if (!phoneNumberString.startsWith("+1")) {
            return false;
        }
        return true;
    }
}

