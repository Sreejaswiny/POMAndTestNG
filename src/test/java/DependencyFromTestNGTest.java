import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyFromTestNGTest {

    @Test
        void startCar() {
            System.out.println("Start the car");
            Assert.fail(); // Assert fail will fail the method or condition and
            // hence other method which are dependencies will not be executed
        }


        //here driver car is dependent on startCar, to make it dependent use "dependenceOnMethods"
        @Test(dependsOnMethods = {"startCar"})
        void driveCar() {
            System.out.println("Drive the car");
        }

        @Test(dependsOnMethods = {"driveCar"})
        void stopCar() {
            System.out.println("Stop the car");
        }

        //To run the method irrespective of dependency and dependency fails, we should set always run to true
        @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
        void parkCar() {
            System.out.println("Park the car");
        }


    }

