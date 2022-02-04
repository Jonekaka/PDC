package service.impl;
import dao.PsInfoDao;
import dao.impl.PsInfoDaoImpl;
import service.ThoughtService;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName ThoughtServiceImpl
 * Description TODO
 **/
public class ThoughtServiceImpl implements ThoughtService {
    @Override
    public void recorderThis(String txt) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms");
        String dateS = dateFormat.format(date);
        System.out.println(dateS);
        PsInfoDao psInfoDao = new PsInfoDaoImpl();
        psInfoDao.insert(txt,dateS);
    }
}
