public class test {
    public static void main(String[] args) {
        fb fbTest = new fb();

        // get email and password from the user
        fbTest.getEmailAndPassword();

        // login and get notification count for the user
        fbTest.loginAndGetNotification();
    }
}
