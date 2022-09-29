/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pass.util;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author yhy
 */
public class PrintScoreExcelTable2 {
     public static void printScoreContent(JTable scoreTable,File file) {
        //获得表格模型,按照数据库的顺序，获得表列名

        DefaultTableModel dtm = (DefaultTableModel) scoreTable.getModel();
        String supid = (String) dtm.getColumnName(0);//学号
        String supname =  dtm.getColumnName(1);//姓名
        String proname =  dtm.getColumnName(2);//课程名
        String procount = (String) dtm.getColumnName(3);//成绩
         String allmoney = (String) dtm.getColumnName(4);
        //dtm.getValueAt(row, column)
        try {
            //File file = new File("学生选课信息表.xls"); //创建Excel表格
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 20);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 20);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 20);


            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页

            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标

            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //设置第一行为列名,并添加列名

            Label labelID = new Label(0, 0, supid, format); //写入字符串，确定内容、位置和格式

            Label labelsName = new Label(1, 0, supname, format);
            Label labelcName = new Label(2, 0,proname, format);
            Label labelScore= new Label(3, 0, procount, format);
             Label labelScore1= new Label(4, 0, allmoney, format);
            //添加列名
            sheet1.addCell(labelID); //将设置好的字符串加入页
            sheet1.addCell(labelsName);
            sheet1.addCell(labelcName);
            sheet1.addCell(labelScore);
             sheet1.addCell(labelScore1);
            //取出table的内容，放到Excel中
            int row = dtm.getRowCount();
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label sid1 = new Label(0, i+1, scoreTable.getValueAt(i, 0).toString(), format1);
                Label sname1 = new Label(1, i+1, scoreTable.getValueAt(i, 1).toString(), format1);
                Label cname1 = new Label(2, i+1, scoreTable.getValueAt(i, 2).toString(), format1);
                Label sscore1 = new Label(3, i+1, scoreTable.getValueAt(i, 3).toString(), format1);
                Label sscore2 = new Label(4, i+1, scoreTable.getValueAt(i, 4).toString(), format1);
               
                // Label satedate=new Label(1,1,ppf.getPrintProductTable().getValueAt(0, 1).toString(),format1);

                //添加每一行内容
                sheet1.addCell(sid1);
                sheet1.addCell(sname1);
                sheet1.addCell(cname1);
                sheet1.addCell(sscore1);
                sheet1.addCell(sscore2);
            }
            //保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
