package books;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;

import objectrepository.HomePage;

public class TC_DWS_001_Test extends BaseClass {
	@Test
	public void clickOnBooks() {

		ExtentTest book = extReport.createTest("clickOnBooks");
		hp = new HomePage(driver);
		hp.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "not display");
		book.log(Status.PASS, "Books page is displayed");

	}
	//computers testing
@Test
	public void clickOnComputer() {
		ExtentTest computer = extReport.createTest("clickOnComputer");
		hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "not display");
		computer.log(Status.PASS, "Books page is displayed");

	}
}
