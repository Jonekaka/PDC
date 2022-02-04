package util;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateChange
 * Description TODO
 **/
public class DateChange {
    Date dt = new Date();

    String myDate=null;
    @Test
    public void a() {
        System.out.println(dt);
        String myDate = DateFormat.getDateInstance().format(dt);
        System.out.println(myDate);//2022-2-3
    }
    @Test
    public void a1() {
        String myDate = DateFormat.getDateInstance(DateFormat.FULL).format(dt);
        System.out.println(myDate);//2022年2月3日 星期四
    }
    @Test
    public void a2() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms");
        String myDate = simpleDateFormat.format(dt);
        System.out.println(myDate);//2022-02-03 11:08:37:837   24小时
    }
    @Test
    public void a3() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:ms");
        String myDate = simpleDateFormat.format(dt);
        System.out.println(myDate);//2022-02-03 11:08:37:837  12小时
    }
    @Test
    public void a4() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssms");
        String myDate = simpleDateFormat.format(dt);
        System.out.println(myDate);//20220203111804184   去掉分隔符
    }
    @Test
    public void a5() {
        long dtTime = dt.getTime();
        System.out.println(dtTime);//1643858540448   date转时间戳
    }
    @Test
//    时间戳转date
    public void a6() {
        long lTime = 1643858540448L*100;
        Date date = new Date(lTime);
        System.out.println(date);//Thu Mar 08 09:14:04 CST 7179
    }
//    String 转date
    @Test
    public void a7() throws ParseException {
        String strD = "2022-02-03 11:08:37:837";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms");
        Date date1 = simpleDateFormat.parse(strD);
        System.out.println(date1);//Thu Feb 03 11:08:37 CST 2022

        String strD1 = "2022年02月03日 11时08分37秒837毫秒";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒ms毫秒");
        Date date11 = simpleDateFormat.parse(strD);
        System.out.println(date11);//Thu Feb 03 11:08:37 CST 2022

    }

}
