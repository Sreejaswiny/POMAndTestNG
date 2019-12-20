import org.testng.annotations.Test;

public class NewTest {

    @Test(priority = 1)
    void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("Login test");
    }

    @Test(priority = 3)
    void logOut() {
        System.out.println("Logout test");
    }

    @Test (priority = 4, enabled = false)
        //by enabling false, it will not execute this particular method when u run the test
    void close() {
        System.out.println("Closing browser");
    }

}


