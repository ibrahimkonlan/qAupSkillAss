Q2
public class Main {
    public static void main(String[] args) {
        printNameDetails("John", "Doe");
    }

    public static void printNameDetails(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();

        System.out.println("Hello, my name is " + fullName + ". There are " + firstNameLength + " letters in my first name and " + lastNameLength + " letters in my last name.");
    }
}

3E
public class Main {
    public static void main(String[] args) {
        int count = 10; // Initial count value

        while (count >= 1) {
            System.out.println(count);
            count--; // Decrement the count for the next iteration
        }
    }
}