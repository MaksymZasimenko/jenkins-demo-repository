import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class excelPractice {

    public static void main(String[] args) {

        try {

            //Workbook
            String filePath = System.getProperty("user.dir") + "/src/main/resources/data/Book1.xlsx";  //user.dir   user.home
            File file = new File(filePath);
            System.out.println("if file exists: " + file.exists());
            FileInputStream inputStream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(inputStream);

            //Sheet
            Sheet sheet = workbook.getSheet("Sheet1");
               // sheet.getLastRowNum()+1   => gives number of rows

            //Row
            Row row = sheet.getRow(0);
                // row.getLastCellNum()  => gives number of cells in a row

            //Cell
            Cell cell = row.getCell(0);


            System.out.println("======= first data: " + cell.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
