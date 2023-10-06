public class Main {
    public static void main(String[] args) {
        // Example using the Register class
        Register register = new Register("John", "Doe", "Smith", "Programming", 1234567890, "johndoe@example.com");
        System.out.println("Register Information:");
        System.out.println("First Name: " + register.getFirstName());
        System.out.println("Last Name: " + register.getLastName());
        System.out.println("Middle Name: " + register.getMiddleName());
        System.out.println("Knowledge: " + register.getKnowlage());
        System.out.println("Phone Number: " + register.getNumberPhone());
        System.out.println("Email: " + register.getGmail());

        // Example using the IsinfoStudent class
        IsinfoStudent student = new IsinfoStudent("Jane Doe", "Programming", "9876543210", "janedoe@example.com");
        System.out.println("\nStudent Information:");
        student.infoStudent();

        // Example using the Getgroup class
        Getgroup group = new Getgroup("Group A", "Java Programming");
        System.out.println("\nGroup Information:");
        group.getnameofgroup();
        group.getnameofcourse();

        // Example using the GetPrice class
        GetPrice coursePrice = new GetPrice(99.99);
        System.out.println("\nCourse Price:");
        coursePrice.displayPrice();

        // Example using the IsCourse class
        IsCourse course = new IsCourse("Python Programming", 129.99);
        System.out.println("\nCourse Information:");
        course.timeofstudy();
        course.add();

        // Example using the Order class
        Order order = new Order("John", "Doe", "Smith", "Programming", 1234567890, "johndoe@example.com");
        order.setPrice(99.99f);
        System.out.println("\nOrder Information:");
        System.out.println("Order Price: $" + order.getPrice());

        // Example using the Tariff class
        Tariff tariff = new Tariff("Java Programming", 199.99f);
        System.out.println("\nTariff Information:");
        System.out.println("Tariff Name: " + tariff.getNameOfCourse());
        System.out.println("Tariff Price: $" + tariff.getPrice());
    }
}

