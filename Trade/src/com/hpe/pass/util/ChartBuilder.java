/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pass.util;

import com.hpe.pss.vo.View_Purchase_pro;
import com.hpe.pss.vo.View_Purchase_sup;
import com.hpe.work.po.ProductSale;
import java.awt.Font;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Steve
 */
public class ChartBuilder extends ApplicationFrame {
    String title;
    static List list;//数据集合
    public ChartBuilder(String title,List list,String type) {
        super(title);
        this.title = title;
        this.list = list;
        switch(type){
            case "ProductSale":this.setContentPane(createPanelPS());break;
            case "PurchaseSup":this.setContentPane(createPanelSU());break;
            case "PurchasePro":this.setContentPane(createPanel());break;
            default:break;
        }

    }
    public static JPanel createPanel() {
        JFreeChart chart = createJFreeChart(createDataSet());
        return new ChartPanel(chart);
    }
    private static CategoryDataset createDataSet() {
        List<View_Purchase_pro>list1=list;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          for(View_Purchase_pro ps : list1){
              dataset.addValue(ps.getPurtotamount(), ps.getProname(),"采购总量");
              dataset.addValue(ps.getPurtotmoney(), ps.getProname(),"采购总额");
          }
        return dataset;
    }

    private static JFreeChart createJFreeChart(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图表
        JFreeChart jfreeChart = ChartFactory.createBarChart3D("商品采购统计",
                "图例", "采购总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
        /**
         * 设置JFreeChart的属性
         */
        jfreeChart.setTitle(new TextTitle("商品采购统计", new Font("宋体", Font.BOLD
                + Font.ITALIC, 20)));
        CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
        CategoryAxis categoryAxis = plot.getDomainAxis();
        categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));

        return jfreeChart;
    }
    public static JPanel createPanelSU() {
        JFreeChart chart = createJFreeChartSU(createDataSetSU());
        return new ChartPanel(chart);
    }
    private static CategoryDataset createDataSetSU() {
        List<View_Purchase_sup>list1=list;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          for(View_Purchase_sup ps : list1){
              dataset.addValue(ps.getPurtotamount(), ps.getProname(),"采购总量");
              dataset.addValue(ps.getPurtotmoney(), ps.getProname(),"采购总额");
          }
        return dataset;
    }

    private static JFreeChart createJFreeChartSU(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图表
        JFreeChart jfreeChart = ChartFactory.createBarChart3D("商品采购统计",
                "图例", "采购总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
        /**
         * 设置JFreeChart的属性
         */
        jfreeChart.setTitle(new TextTitle("商品采购统计", new Font("宋体", Font.BOLD
                + Font.ITALIC, 20)));
        CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
        CategoryAxis categoryAxis = plot.getDomainAxis();
        categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));

        return jfreeChart;
    }

    public static JPanel createPanelPS() {
        JFreeChart chart = createJFreeChartPS(createDataSetPS());
        return new ChartPanel(chart);
    }
    private static JFreeChart createJFreeChartPS(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图
        JFreeChart jfreeChart = ChartFactory.createBarChart3D("商品销售统计",
                "图例", "销售总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
        /**
         * 设置JFreeChart的属性
         */
        jfreeChart.setTitle(new TextTitle("商品销售统计", new Font("宋体", Font.BOLD
                + Font.ITALIC, 20)));
        CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
        CategoryAxis categoryAxis = plot.getDomainAxis();
        categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 15));

        return jfreeChart;
    }    
    private static CategoryDataset createDataSetPS() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<ProductSale>list1 =list;
        for(ProductSale ps: list1){
            dataset .addValue(ps.getTotalprice(),ps.getProname(),ps.getProname());
            dataset .addValue(ps.getTotalprice(),ps.getProname(),ps.getProname());
            dataset .addValue(ps.getTotalcount(),ps.getProname(),ps.getProname());
            dataset .addValue(ps.getTotalcount(),ps.getProname(),ps.getProname());
        }
        return dataset;
    }

}

