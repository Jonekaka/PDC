package dao.impl;

import dao.PsInfoDao;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.Date;

/**
 * @ClassName PsInfoDaoImpl
 * Description TODO
 **/
public class PsInfoDaoImpl implements PsInfoDao{
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void insert(String txt, String date) {
        String sql = "INSERT INTO dayWriter (writeInfo,dayTime)VALUES(?,?)";
        template.update(sql,txt,date);
    }
}
