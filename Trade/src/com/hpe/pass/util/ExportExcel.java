/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pass.util;


import com.hpe.pss.vo.View_Custrade;
import com.hpe.pss.vo.View_Purchase_pro;
import com.hpe.pss.vo.View_Purchase_sup;
import com.hpe.work.po.Sell;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * 将指定的集合导入到指定的excel文件
 * @author yhy
 */
public class ExportExcel {
     public static void printPurchase(List<View_Purchase_pro> purlist,File file){
       //1 ============设定表列名
        String pname = "商品编号";
        String firstmonth = "商品名称";
        String secondmonth = "采购总量";
        String thirdmonth = "采购总金额";
            try {
                
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
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
 
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中
            WritableCellFormat format1 = new WritableCellFormat(font1);         
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定
            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
            Label labelPname= new Label(0, 0, pname, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelFirstmonth = new Label(1, 0, firstmonth, format);
            Label labelSecondmonth = new Label(2, 0,secondmonth, format);
            Label labelThirdmonth= new Label(3, 0, thirdmonth, format);
            //添加列名
            sheet1.addCell(labelPname); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelFirstmonth);
            sheet1.addCell(labelSecondmonth);
            sheet1.addCell(labelThirdmonth);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = purlist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label pname1 = new Label(0, i+1, purlist.get(i).getProid()+"", format1);
                Label firstmonth1 = new Label(1, i+1, purlist.get(i).getProname(), format1);
                Label secondmonth1 = new Label(2, i+1, purlist.get(i).getPurtotamount()+"", format1);
                Label thirdmonth1 = new Label(3, i+1, purlist.get(i).getPurtotmoney()+"", format1);
                //添加每一行内容
                sheet1.addCell(pname1);
                sheet1.addCell(firstmonth1);
                sheet1.addCell(secondmonth1);
                sheet1.addCell(thirdmonth1);
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    
    }

     
     
    public static void printPurchaseS(List<View_Purchase_sup> purlist, File file) {
         //1 ============设定表列名
        String pname = "供应商名称";
        String firstmonth = "商品名称";
        String secondmonth = "采购总量";
        String thirdmonth = "采购总金额";
            try {
                //2==============创建excel文件并设置数据显示格式
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
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
            Label labelPname= new Label(0, 0, pname, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelFirstmonth = new Label(1, 0, firstmonth, format);
            Label labelSecondmonth = new Label(2, 0,secondmonth, format);
            Label labelThirdmonth= new Label(3, 0, thirdmonth, format);
            //添加列名
            sheet1.addCell(labelPname); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelFirstmonth);
            sheet1.addCell(labelSecondmonth);
            sheet1.addCell(labelThirdmonth);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = purlist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label pname1 = new Label(0, i+1, purlist.get(i).getSupname()+"", format1);
                Label firstmonth1 = new Label(1, i+1, purlist.get(i).getProname(), format1);
                Label secondmonth1 = new Label(2, i+1, purlist.get(i).getPurtotamount()+"", format1);
                Label thirdmonth1 = new Label(3, i+1, purlist.get(i).getPurtotmoney()+"", format1);
                //添加每一行内容
                sheet1.addCell(pname1);
                sheet1.addCell(firstmonth1);
                sheet1.addCell(secondmonth1);
                sheet1.addCell(thirdmonth1);
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }

    public static void printCustrade(List<View_Custrade> sellList, File file) {
           //1 ============设定表列名
        String selid = "顾客编号";
        String proid = "顾客简称";
        String proname = "交易金额";
            try {
                //2==============创建excel文件并设置数据显示格式
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
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
     
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
          
            Label labelSelid = new Label(0, 0,selid, format);
            Label labelProid= new Label(1, 0, proid, format);
            Label labelProname = new Label(2,0,proname,format);

            sheet1.addCell(labelSelid); 
            sheet1.addCell(labelProid); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelProname); 

            int row = sellList.size();
            for (int i = 0; i < row; i++) {
                Label Selid = new Label(0, i+1, sellList.get(i).getCusid().toString(),format1);
                Label Proid = new Label(1, i+1, sellList.get(i).getCusname().toString(),format1);
                Label Proname = new Label(2, i+1, sellList.get(i).getSellmon().toString(),format1);
                sheet1.addCell(Selid);
                sheet1.addCell(Proid);
                sheet1.addCell(Proname);
            }
    
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }  
    
      
      
    public static void printSell(List<Sell> sellList, File file) {
           //1 ============设定表列名
        String selid = "销售编号";
        String proid = "商品编号";
        String proname = "商品名称";
        String seldate = "销售时间";
        String selcount = "销售数量";
        String selprice = "销售价格";
        String totals = "销售总额";
        String cusname = "顾客姓名";
            try {
                //2==============创建excel文件并设置数据显示格式
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
            sheet1.setColumnView(4, 20);
            sheet1.setColumnView(5, 20);
            sheet1.setColumnView(6, 20);
            sheet1.setColumnView(7, 20);
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
            //Label labelProid= new Label(0, 0, proid, format); //写入字符串，确定位置（列，行）、内容和格式
          
            Label labelSelid = new Label(0, 0,selid, format);
            Label labelProid= new Label(1, 0, proid, format);
            Label labelProname = new Label(2,0,proname,format);
            Label labelSeldate = new Label(3,0,seldate,format);
            Label labelSelcount = new Label(4,0,selcount,format);
            Label labelSelprice = new Label(5,0,selprice,format);
            Label labelTotals = new Label(6,0,totals,format);
            Label labelCusname = new Label(7,0,cusname,format);
          
            //添加列名
            sheet1.addCell(labelSelid); 
            sheet1.addCell(labelProid); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelProname); 
            sheet1.addCell(labelSeldate); 
            sheet1.addCell(labelSelcount);
            sheet1.addCell(labelSelprice); 
            sheet1.addCell(labelTotals);
            sheet1.addCell(labelCusname);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = sellList.size();
          
            //获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                Label Selid = new Label(0, i+1, sellList.get(i).getSelid().toString(),format1);
                Label Proid = new Label(1, i+1, sellList.get(i).getProid().toString(),format1);
                Label Proname = new Label(2, i+1, sellList.get(i).getProname(),format1);
                Label Seldate = new Label(3, i+1, sellList.get(i).getSeldate().toString(), format1);
                Label Selcount = new Label(4, i+1, sellList.get(i).getSelcount()+"", format1);
                Label Selprice = new Label(5, i+1, sellList.get(i).getSelprice().toString(),format1);
                Label Totals = new Label(6, i+1, sellList.get(i).getTotals().toString(),format1);
                Label Cusname = new Label(7, i+1, sellList.get(i).getCusname().toString(),format1);
                
                //添加每一行内容
                sheet1.addCell(Selid);
                sheet1.addCell(Proid);
                sheet1.addCell(Proname);
                sheet1.addCell(Seldate);
                sheet1.addCell(Selcount);
                sheet1.addCell(Selprice);
                sheet1.addCell(Totals);
                sheet1.addCell(Cusname);
            
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    public static void printScoreContent(JTable scoreTable,File file) {
        //获得表格模型,按照数据库的顺序，获得表列名

        DefaultTableModel dtm = (DefaultTableModel) scoreTable.getModel();
        String sid = (String) dtm.getColumnName(0);//学号
        String sname = (String) dtm.getColumnName(1);//姓名
        String cname = (String) dtm.getColumnName(2);//课程名
        String sscore = (String) dtm.getColumnName(3);//成绩
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

            Label labelID = new Label(0, 0, sid, format); //写入字符串，确定内容、位置和格式

            Label labelsName = new Label(1, 0, sname, format);
            Label labelcName = new Label(2, 0,cname, format);
            Label labelScore= new Label(3, 0, sscore, format);
            //添加列名
            sheet1.addCell(labelID); //将设置好的字符串加入页
            sheet1.addCell(labelsName);
            sheet1.addCell(labelcName);
            sheet1.addCell(labelScore);
            //取出table的内容，放到Excel中
            int row = dtm.getRowCount();
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label sid1 = new Label(0, i+1, scoreTable.getValueAt(i, 0).toString(), format1);
                Label sname1 = new Label(1, i+1, scoreTable.getValueAt(i, 1).toString(), format1);
                Label cname1 = new Label(2, i+1, scoreTable.getValueAt(i, 2).toString(), format1);
                Label sscore1 = new Label(3, i+1, scoreTable.getValueAt(i, 3).toString(), format1);
               
                // Label satedate=new Label(1,1,ppf.getPrintProductTable().getValueAt(0, 1).toString(),format1);

                //添加每一行内容
                sheet1.addCell(sid1);
                sheet1.addCell(sname1);
                sheet1.addCell(cname1);
                sheet1.addCell(sscore1);
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
