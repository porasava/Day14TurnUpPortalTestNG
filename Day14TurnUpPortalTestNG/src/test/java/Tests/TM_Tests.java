package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TMPage;
import Utilities.CommonDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TM_Tests extends CommonDriver {

    @BeforeTest
        public void TimeSetUp()
        {
            driver2 = new ChromeDriver();
            LoginPage loginPageObj = new LoginPage();
            loginPageObj.LoginActionTM(driver2);
            HomePage homePageObj = new HomePage();
            homePageObj.GoToTMPage(driver2);
        }
@Test(priority=0, description="This user checks if user is able to create a new time record")
        public void Create_TimeRecord()
        {

            TMPage TMPageObj = new TMPage();

            //Create
            TMPageObj.Create_TimeRecord(driver2, "TanyaTestNG", "two","3");
        }
    @Test(priority=1, description="This user checks if user is able to edit a time record")
            public void EditTime_Test()
        {

            TMPage TMPageObj = new TMPage();
            TMPageObj.Update_TimeRecord(driver2, "TanyaTestNG", "two");
        }
    @Test(priority=2, description="This user checks if user is able to delete a time record")
            public void DeleteTime_Test()
        {

            TMPage TMPageObj = new TMPage();
            TMPageObj.Delete_TimeRecord(driver2, "TanyaTestNG", "two", "$3.00");
        }
      @AfterTest
        public void CloseTestRun()
        {
            driver2.quit();
        }


    }


