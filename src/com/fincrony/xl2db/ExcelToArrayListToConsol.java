package com.fincrony.xl2db;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToArrayListToConsol {

	public void readExcel(String fileName) {
		try {

			@SuppressWarnings("resource")
			Workbook workbook = new XSSFWorkbook(fileName);// XSSFWorkbook is
			// sheet, 1 means second and so on.
			Sheet sheet = workbook.getSheetAt(0);

			// following code will work with empty cells
			Row row = null;
			Cell cell = null;
			// int noOfRows = getPhysicalNumberOfRows();// returns the total no
			// of rows in the selected sheet
			int noOfRows = sheet.getLastRowNum();
			for (int i = 0; i <= noOfRows; i++) {
				row = sheet.getRow(i);
				// int noOfCells = row.getPhysicalNumberOfCells();// returns the
				// total no of cells in the selected row
				int noOfCells = row.getLastCellNum();// returns the no of the
														// last cell in the row
				for (int j = 0; j < noOfCells; j++) {
					cell = row.getCell(j);

					if (cell != null) {
						System.out.print(getCellValue(cell).toString() + "\t");
					} else {
						Cell blanckCell = row.createCell(j);
						blanckCell.setCellValue("");
						System.out.print(getCellValue(blanckCell) + "\t");
					}
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not available.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem reading file from directory.");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public Object getCellValue(Cell cell) {
		Object cellValue = null;
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			cellValue = cell.getStringCellValue();
		} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			cellValue = cell.getNumericCellValue();
		} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			cellValue = cell.getBooleanCellValue();
		} else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
			cellValue = "";
		}
		return cellValue;
	}

	public static void main(String[] args) {
		new ExcelToArrayListToConsol().readExcel("C:/Users/prabhu/Desktop/Excel1/employee.xlsx");
	}
}