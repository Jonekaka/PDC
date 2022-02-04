package util;

import org.junit.Test;
import java.io.FileReader;

/**
 * @ClassName ReadTxt
 * Description TODO
 **/
public class ReadTxt {
    public String getFileContent() {
//    @Test
//    public void getFileContent() {
        String filePath = "C:\\Users\\Administrator.DESKTOP-KMH7HN6\\Desktop\\ip_info.txt";
        String myIp=null;
        FileReader fr = null;
        int len=0;
        char[] ch = new char[1024];
        try {
            fr = new FileReader(filePath);
            while ((len = fr.read(ch)) != -1) {
                myIp = new String(ch,0, len);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(myIp);
        return myIp;
    }

}
