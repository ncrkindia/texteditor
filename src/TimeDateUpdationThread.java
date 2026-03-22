


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
    int day;String sDay;
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
        day  = date.getDay();
        sDay = this.getDayName(day);
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
            if(hours>=12)
            {
                s="PM";
            }
            else
            {
                s="AM";
            }
            
            if(hours>12)
            {
                hours-=12;
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
            l.setText( sDay+"  "+ sMonth +" "+sDate +", "+ year+"    " + sHours+":"+sMinutes+":"+sSeconds+" "+s);
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
            case 1:return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Oct";
            case 10: return "Sep";
            case 11: return "Nov";
            case 12: return "Dec";
        }
        return "";
    }
     public String getDayName(int day)
    {
        switch(day)
        {
            case 0:return "Sunday";
            case 1:return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "";
    }
}
