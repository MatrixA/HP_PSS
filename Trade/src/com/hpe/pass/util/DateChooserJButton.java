/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pass.util;

/**
 *
 * @author lenovo
 */

/**
 * <code>DataChooserJButton</code>类用于提供一个自定义的日期选择器控件
 * <p>
 * @author
 * @version 1.0, 2005-6-7
 */
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException ;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSpinner ;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingConstants ;
import javax.swing.event.ChangeListener ;
import javax.swing.event.ChangeEvent ;
import javax.swing.border.LineBorder ;



public class DateChooserJButton extends JButton {   
    private DateChooser dateChooser =null;    
    private String preLabel ="" ;    
    
    public DateChooserJButton() {
        this(getNowDate()) ;
    }    
    
    public DateChooserJButton(SimpleDateFormat df , String dateString) {
        this() ;
        setText(df,dateString);
    }
        
    public DateChooserJButton(Date date) {
        this("",date);
    }
    
    public DateChooserJButton(String preLabel,Date date) {
        if (preLabel!=null) this.preLabel = preLabel ;
        setDate(date) ;
        setBorder(null) ;
        setCursor(new Cursor(Cursor.HAND_CURSOR)) ;
        super.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dateChooser==null) dateChooser = new DateChooser();
                Point p = getLocationOnScreen() ;
                p.y = p.y+30 ;
                dateChooser.showDateChooser(p) ;
            }
        }) ;
    }    
    
    private static Date getNowDate() {
        return Calendar.getInstance().getTime() ;
    }
    
    private static SimpleDateFormat getDefaultDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd") ;
    }
    
    @Override
    public void setText(String s) {
        Date date ;
        try {
            date = getDefaultDateFormat().parse(s) ;
        }catch (ParseException e) {
            date = getNowDate() ;
        }
        setDate(date) ;
    }
        
    public void setText(SimpleDateFormat df , String s) {
        Date date ;
        try {
            date = df.parse(s) ;
        }catch (ParseException e) {
            date = getNowDate() ;
        }
        setDate(date) ;
    }
            
    public void setDate(Date date) {
        super.setText(preLabel+getDefaultDateFormat().format(date));
    }
    
    public Date getDate() {
        String dateString = getText().substring(preLabel.length());
        try {
            return getDefaultDateFormat().parse(dateString);
        } catch (ParseException e) {
            return getNowDate() ;
        }
        
    }
    
    @Override
    public void addActionListener(ActionListener listener ) {
    }
    
    private class DateChooser extends JPanel implements ActionListener ,ChangeListener {
         
        int startYear = Calendar.getInstance().get(Calendar.YEAR) - 10; //�
        int lastYear = Calendar.getInstance().get(Calendar.YEAR); //��
        int width = 200; //������
        int height = 200; //����        
        Color backGroundColor = Color.gray; //
        //��������ɫ----------------//
        Color palletTableColor = Color.white; //�
        Color todayBackColor = Color.orange; //�
        Color weekFontColor = Color.blue; //�������
        Color dateFontColor = Color.black; //�������
        Color weekendFontColor = Color.red; //�
        
        //��������ɫ------------------//
        Color controlLineColor = Color.pink; //�
        Color controlTextColor = Color.white; //
        
        
        Color rbFontColor = Color.white; //RoundBox�
        Color rbBorderColor = Color.red; //RoundBox�
        Color rbButtonColor = Color.pink; //RoundBox�
        Color rbBtFontColor = Color.red; //RoundBox        
        JDialog dialog ;
        JSpinner yearSpin ;
        JSpinner monthSpin ;
        JSpinner hourSpin ;
        JButton[][] daysButton = new JButton[6][7] ;        
        DateChooser() {
            setLayout(new BorderLayout());
            setBorder(new LineBorder(backGroundColor, 2));
            setBackground(backGroundColor);
            
            JPanel topYearAndMonth = createYearAndMonthPanal();
            add(topYearAndMonth,BorderLayout.NORTH);
            JPanel centerWeekAndDay = createWeekAndDayPanal();
            add(centerWeekAndDay,BorderLayout.CENTER);
        }
        
        private JPanel createYearAndMonthPanal(){
            Calendar c = getCalendar() ;
            int currentYear =c.get(Calendar.YEAR);
            int currentMonth =c.get(Calendar.MONTH)+1;
//            int currentHour =c.get(Calendar.HOUR_OF_DAY);
            
            JPanel result = new JPanel();
            result.setLayout(new FlowLayout());
            result.setBackground(controlLineColor);
            
            yearSpin = new JSpinner(new SpinnerNumberModel(currentYear,
                    startYear,lastYear,1));
            yearSpin.setPreferredSize(new Dimension(58,22)) ;
            yearSpin.setName("Year") ;
            yearSpin.setEditor(new JSpinner.NumberEditor(yearSpin, "####")) ;
            yearSpin.addChangeListener(this) ;
            result.add(yearSpin) ;            
            JLabel yearLabel = new JLabel("年");
            yearLabel.setForeground(controlTextColor);
            result.add(yearLabel);            
            monthSpin = new JSpinner(new SpinnerNumberModel(currentMonth,1,12,1));
            monthSpin.setPreferredSize(new Dimension(40,22)) ;
            monthSpin.setName("Month") ;
            monthSpin.addChangeListener(this) ;
            result.add(monthSpin) ;            
            JLabel monthLabel = new JLabel("月");
            monthLabel.setForeground(controlTextColor);
            result.add(monthLabel);
            
            //hourSpin = new JSpinner(new SpinnerNumberModel(currentHour,0,23,1));
            //hourSpin.setPreferredSize(new Dimension(35,20)) ;
            //hourSpin.setName("Hour") ;
            //hourSpin.addChangeListener(this) ;
            //result.add(hourSpin) ;
            
            //JLabel hourLabel = new JLabel("��");
            // hourLabel.setForeground(controlTextColor);
            //result.add(hourLabel);            
            return result ;
        }
        
        
        
        private JPanel createWeekAndDayPanal() {
            String colname[] = {"日","一","二","三","四","五","六"};
            JPanel result = new JPanel();
            result.setFont(new Font("宋体", Font.PLAIN, 12));
            result.setLayout(new GridLayout(7,7));
            result.setBackground(Color.white);
            JLabel cell ;
            
            for(int i=0;i<7;i++) {
                cell = new JLabel(colname[i]);
                cell.setHorizontalAlignment(JLabel.RIGHT);
                if (i==0 || i==6) cell.setForeground(weekendFontColor) ;
                else cell.setForeground(weekFontColor) ;
                result.add(cell) ;
            }
            
            int actionCommandId = 0 ;
            for(int i = 0; i < 6; i++)
                for(int j = 0; j < 7; j++) {
                JButton numberButton = new JButton();
                numberButton.setBorder(null) ;
                numberButton.setHorizontalAlignment(SwingConstants.RIGHT);
                numberButton.setActionCommand(String.valueOf(actionCommandId)) ;
                numberButton.addActionListener(this) ;
                numberButton.setBackground(palletTableColor);
                numberButton.setForeground(dateFontColor) ;
                if (j==0 || j==6) numberButton.setForeground(weekendFontColor) ;
                else numberButton.setForeground(dateFontColor) ;
                daysButton[i][j] = numberButton;
                result.add(numberButton) ;
                actionCommandId ++ ;
                }
            return result;
        }   
        
        private JDialog createDialog(Frame owner ) {
            JDialog result = new JDialog(owner,"日期选择",true) ;
            result.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            result.getContentPane().add(this,BorderLayout.CENTER) ;
            result.pack() ;
            result.setSize(width, height);
            return result ;
        }
        
        protected void showDateChooser(Point position) {
            Frame owner =(Frame)SwingUtilities.getWindowAncestor(
                    DateChooserJButton.this) ;
            if (dialog==null || dialog.getOwner()!= owner) 
                dialog = createDialog(owner ) ;
            dialog.setLocation(getAppropriateLocation(owner ,position ) ) ;
            flushWeekAndDay() ;
            dialog.setVisible(true);
        }
        
        
        protected Point getAppropriateLocation(Frame owner ,
                Point position ) {
            Point result = new Point(position) ;
            Point p = owner.getLocation() ;
            int offsetX = (position.x+width) - (p.x + owner.getWidth() ) ;
            int offsetY = (position.y+height) - (p.y + owner.getHeight() ) ;            
            if (offsetX >0 ) {
                result.x -= offsetX ;
            }            
            if (offsetY >0 ) {
                result.y -= offsetY ;
            }            
            return result ;
            
        } 
        
        private Calendar getCalendar() {
            Calendar result = Calendar.getInstance();
            result.setTime(getDate()) ;
            return result ;
        }       
        
        private int getSelectedYear() {
            return ((Integer)yearSpin.getValue()).intValue() ;
        }        
        private int getSelectedMonth() {
            return ((Integer)monthSpin.getValue()).intValue() ;
        }        
//        private int getSelectedHour() {
//            return ((Integer)hourSpin.getValue()).intValue() ;
//        }        
        private void dayColorUpdate(boolean isOldDay) {
            Calendar c = getCalendar() ;
            int day = c.get(Calendar.DAY_OF_MONTH);
            c.set(Calendar.DAY_OF_MONTH,1);
            int actionCommandId =day-2+c.get(Calendar.DAY_OF_WEEK) ;
            int i = actionCommandId/7;
            int j = actionCommandId%7;
            if (isOldDay) daysButton[i][j].setForeground(dateFontColor) ;
            else daysButton[i][j].setForeground(todayBackColor) ;
        }        
        private void flushWeekAndDay() {
            Calendar c = getCalendar() ;
            c.set(Calendar.DAY_OF_MONTH,1);
            int maxDayNo = c.getActualMaximum(Calendar.DAY_OF_MONTH);
            int dayNo = 2 - c.get(Calendar.DAY_OF_WEEK) ;
            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < 7; j++) {
                    String s="" ;
                    if (dayNo>=1 && dayNo<=maxDayNo ) s = String.valueOf(dayNo) ;
                    daysButton[i][j].setText(s) ;
                    dayNo ++ ;
                }
            }
            dayColorUpdate(false) ;
        }       
        public void stateChanged(ChangeEvent e) {
            JSpinner source =(JSpinner)e.getSource() ;
            Calendar c = getCalendar() ;
//            if (source.getName().equals("Hour")) {
//                c.set(Calendar.HOUR_OF_DAY, getSelectedHour());
//                setDate(c.getTime());
//                return ;
//            }            
            dayColorUpdate(true) ;            
            if (source.getName().equals("Year"))
                c.set(Calendar.YEAR, getSelectedYear());
            else if(source.getName().equals("Month"))
                c.set(Calendar.MONTH, getSelectedMonth()-1);
            setDate(c.getTime());
            flushWeekAndDay() ;
        }       
        public void actionPerformed(ActionEvent e) {
            JButton source =(JButton)e.getSource() ;
            if (source.getText().length()==0) return ;
            dayColorUpdate(true) ;
            source.setForeground(todayBackColor) ;
            int newDay = Integer.parseInt(source.getText());
            Calendar c = getCalendar() ;
            c.set(Calendar.DAY_OF_MONTH,newDay);
            setDate(c.getTime());
        }        
    }    
}


