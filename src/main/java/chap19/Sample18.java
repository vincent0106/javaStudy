package chap19;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class Sample18 {

    public static void main(String[] args){
        //엑셀 workboox 생성
        XSSFWorkbook workbook = new XSSFWorkbook();

        //엑셀 sheet 생성
        XSSFSheet sheet = workbook.createSheet("1학년 1반 성적");

        //sheet 눈금선 없애기
        sheet.setDisplayGridlines(false);

        //표 헤어 cell의 style 정의
        CellStyle tableHeaderStyle = workbook.createCellStyle();

        //배경색
        tableHeaderStyle.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        tableHeaderStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        //정렬
        tableHeaderStyle.setAlignment(HorizontalAlignment.CENTER);      //가운데 정렬
        tableHeaderStyle.setVerticalAlignment(VerticalAlignment.CENTER);    //높이 가운데 정룔

        //폰트
        Font headerFont = workbook.createFont();
        headerFont.setFontHeightInPoints((short) 12);
        headerFont.setBold(true);
        tableHeaderStyle.setFont(headerFont);

        // 테두리선
        tableHeaderStyle.setBorderLeft(BorderStyle.THIN);
        tableHeaderStyle.setBorderRight(BorderStyle.THIN);
        tableHeaderStyle.setBorderTop(BorderStyle.THIN);
        tableHeaderStyle.setBorderBottom(BorderStyle.THIN);

        //Row 생성
        Row row = sheet.createRow(0);

        //Cell 생성
        Cell cell = row .createCell(0);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("학번");

        cell = row.createCell(1);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("이름");

        cell = row.createCell(2);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("점수");

        cell = row.createCell(3);
        cell.setCellStyle(tableHeaderStyle);

        cell = row.createCell(4);
        cell.setCellStyle(tableHeaderStyle);


        row = sheet.createRow(1);
        cell = row.createCell(0);
        cell.setCellStyle(tableHeaderStyle);

        cell = row.createCell(1);
        cell.setCellStyle(tableHeaderStyle);

        cell = row.createCell(2);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("국어");

        cell = row.createCell(3);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("영어");

        cell = row.createCell(4);
        cell.setCellStyle(tableHeaderStyle);
        cell.setCellValue("수학");

        //셀 병합
        sheet.addMergedRegion(new CellRangeAddress(0,0,2,4));   // row 시작, row 종료, cell 시작, cell 종료
        sheet.addMergedRegion(new CellRangeAddress(0,1,0,0));
        sheet.addMergedRegion(new CellRangeAddress(0,1,1,1));

        //엑셀 파일 작성
        try (FileOutputStream out = new FileOutputStream(new File("성적 18.xlsx"))){
            workbook.write(out);
            System.out.println("엑셀 파일이 작성되었습니다.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
