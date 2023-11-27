package Tests;
import Pages.EmployeesPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.CommonDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Employees_Tests extends CommonDriver {

@BeforeTest
        public void EmployeeSetUp()
        {
            driver1 = new ChromeDriver();
            LoginPage loginPageObj = new LoginPage();
            loginPageObj.LoginAction(driver1);
            HomePage homePageObj = new HomePage();
            homePageObj.GoToEmployeePage(driver1);
        }

        public void Create_Employee()
        {

            EmployeesPage EmployeePageObj = new EmployeesPage();

            //Create
            EmployeePageObj.Create_EmployeeRecord(driver1);
        }

        public void Edit_Employee()
        {

            EmployeesPage EmployeePageObj = new EmployeesPage();
            EmployeePageObj.Edit_EmployeeRecord(driver1);
        }

        public void Delete_Employee()
        {

            EmployeesPage EmployeePageObj = new EmployeesPage();
            EmployeePageObj.Delete_EmployeeRecord(driver1);
        }
  @AfterTest
        public void EmployeeTearDown()
        {
            driver1.quit();
        }
}
