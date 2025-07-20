package seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleExtentReport {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//codes of ExtentReeport lines are copied from Extent Report Complete Example for java
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("sampleSparkReport.html");
		extent.attachReporter(spark);
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		extent.createTest("Screen Capture").addVideoFromPath("extent.png").pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		extent.createTest("Capture Status").log(Status.PASS,"Validated Extend Reeport");
		extent.flush();

		
		
		
		
		
	}

}
