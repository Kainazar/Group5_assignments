package utilities;

import org.openqa.selenium.support.ui.Wait;

public class BrowserUtils {
    //    **
//            * Method that will accept int
// * Wait for given second duration.
// */
    public static void sleep(int second)  {
        second *= 1000;
        // 1 sec = 1000 milli seconds

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

            System.out.println("something happened in the sleep method!");;
        }

    }
}

