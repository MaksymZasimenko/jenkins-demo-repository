package impls;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.CucumberLogUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelImpl {

    public void validateExcelFileRow(String sheetName, String fileName, List<String> expectedData) {
        try {
            String filePath = System.getProperty("user.dir") + "/src/main/resources/data/" + fileName;

            File file = new File(filePath);

            FileInputStream inputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet sheet = workbook.getSheet(sheetName);


            //row loop
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                List<String> actualData = new ArrayList<>();
                Row row = sheet.getRow(i);
                //cell loop
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    actualData.add(cell.toString());
                }
                if(actualData.equals(expectedData)){
                    CucumberLogUtils.logPass("The expected data was found in row: " + (i+1), false);
                    return;
                }
            }

            CucumberLogUtils.logFail("The data was NOT found", false);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
