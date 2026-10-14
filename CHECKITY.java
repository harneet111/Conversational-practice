public class CHECKITY {
    public static void main(String[] args) {

        String correctUsername = "beep";
        String correctPassword = "words";
        String inputUsername = "admin";
        String inputPassword = "wrongPassword";
        if (!inputUsername.equals(correctUsername)) {
            System.out.println("Login Failed: Incorrect username.");
        } else if (!inputPassword.equals(correctPassword)) {
            System.out.println("Login Failed: Incorrect password.");
        } else {
            System.out.println("Login Successful! Welcome to the system.");
        }
    }
}