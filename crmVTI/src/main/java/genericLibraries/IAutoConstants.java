package genericLibraries;

import java.time.LocalTime;

public interface IAutoConstants {
	String Idt=LocalTime.now().toString().replace(":","-");
	String SSPATH=System.getProperty("user-dir");
	String PROPERTYFILE="./src/test/resources/commondata.properties";
	String EXCELPATH="./src/test/resources/Testdata.xlsx";
}
