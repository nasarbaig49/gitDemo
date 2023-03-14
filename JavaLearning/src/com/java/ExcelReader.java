package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Data\\DataDrive.xlsx");
        //XSSFWorkbook workbook=new XSSFWorkbook(fis);
    }
}
