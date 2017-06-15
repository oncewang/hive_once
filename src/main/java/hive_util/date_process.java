package hive_util;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class date_process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String get_lastday(String da){
		  
	}
	public class NextDay extends UDF {
	    public String evaluate(int i) {
	        Date date=new Date();//取时间
	        Calendar calendar = new GregorianCalendar();
	        calendar.setTime(date);
	        calendar.add(calendar.DATE,i);//把日期往后增加一天.整数往后推,负数往前移动，0代表今天的时间
	        date=calendar.getTime();      //这个时间就是日期往后推一天的结果
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	        String dateString = formatter.format(date);
	        return dateString;
	    }
	}
}
