package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot extends BaseClass {
	
	public static String takescreenshot(String screenshotName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);

		String Idt = LocalDateTime.now().toString().replace(":", "-");
		String path=System.getProperty("user.dir") + "./Errorshot/"+screenshotName+""+Idt+"+.png";
		File dest = new File(path);

		try {
			FileUtils.copyFile(photo, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return path;
	}

}
