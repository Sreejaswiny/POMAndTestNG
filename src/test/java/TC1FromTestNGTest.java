import org.testng.annotations.*;

public class TC1FromTestNGTest {


//    Before test, after test, before suite, after suite are added only once inspite of many test cases, if we executing thru xml filke
//    Before class, after class, before method, after method should be added for each class
// Test should be added before every method in a class

        //If you want to execute it thru everytest, the you mite include test and suite for each class if necessary

        @BeforeTest
        void beforeTest(){
            System.out.println("Executing before test");
        }
        @AfterTest
        void afterTest(){
            System.out.println("Executing after test");
        }

        @BeforeClass
        void beforeClass(){
            System.out.println("Executing before class");
        }
        @AfterClass
        void afterClass(){
            System.out.println("Executing after class");
        }

        @BeforeMethod
        void beforeMethod(){
            System.out.println("Executing before method");
        }
        @AfterMethod
        void afterMethod(){
            System.out.println("Executing after method");
        }

        @Test
        void test1(){
            System.out.println("Test1");
        }
        @Test
        void test2(){
            System.out.println("Test2");
        }




    }


