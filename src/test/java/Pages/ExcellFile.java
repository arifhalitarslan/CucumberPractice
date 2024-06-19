package Pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellFile {

/*  bunu ekle pom.xml'e

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.2.5</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.2.5</version>
        </dependency>

*/

    String path = "C:\\Users\\arifh\\OneDrive\\Masaüstü\\Testing\\Cucumber_Practice\\CucumberPractice\\src\\test\\java\\Utilities\\SampleData.xlsx";
    @Test
    public void test() throws IOException {

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        System.out.println(worksheet.getRow(2).getCell(2));

    }


    @Test
    public void test2() throws IOException {

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        XSSFCell cell = worksheet.getRow(0).createCell(0);
        cell.setCellValue(50);

        System.out.println(worksheet.getRow(2).getCell(2));


        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);

        fos.close();
        workbook.close();
        fis.close();
    }

}
