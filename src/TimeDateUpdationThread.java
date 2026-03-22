
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class TimeDateUpdationThread extends Thread{
    java.util.Date date;
    javax.swing.JLabel l;
    int _date;String sDate;
    int month;String sMonth;
    int year;
    int minutes;String sMinutes;
    int hours;String sHours;
    int seconds;String sSeconds;
    String s;
    TimeDateUpdationThread(javax.swing.JLabel l)
    {
        this.l = l;
        l.setForeground(Color.red);
        l.setHorizontalAlignment(javax.swing.JLabel.LEFT);
        this.setPriority(MIN_PRIORITY);
        this.start();
    }
    
    
    public void run()
    {
        date = new java.util.Date();
         _date = date.getDate();
            if(_date<10)
            {
                sDate = "0"+_date;
            }
            else
            {
                sDate = ""+_date;
            }  
            month = date.getMonth()+1;
            sMonth = this.getMonthName(month);
            /*
                    if(month<10)
            {
                sMonth = "0"+month;
            }
            else
            {
                sMonth = ""+month;
            }
                    */
            year = 1900+date.getYear();
            
        while(true)
        {
            date = new java.util.Date();
            hours = date.getHours();
            if(hours>12)
            {
                s="PM";
                hours-=12;
            }
            else
            {
                s="AM";
            }
            if(hours<10)
            {
                sHours = "0"+hours;
            }
            else
            {
                sHours = ""+hours;
            }
            minutes = date.getMinutes();
            if(minutes<10)
            {
                sMinutes = "0"+minutes;
            }
            else
            {
                sMinutes = ""+minutes;
            }
            seconds = date.getSeconds();
            if(seconds<10)
            {
                sSeconds = "0"+seconds;
            }
            else
            {
                sSeconds = ""+seconds;
            }
            l.setText(sDate +" "+ sMonth +" "+ year+"    " + sHours+":"+sMinutes+":"+sSeconds+" "+s);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }
        
    }
    public String getMonthName(int month)
    {
        switch(month)
        {
            case 1:return "January";
            case 2: return "Febuary";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "October";
            case 10: return "September";
            case 11: return "November";
            case 12: return "December";
            
        }
        return "";
    }
    
}
