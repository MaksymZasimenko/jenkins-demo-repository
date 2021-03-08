package dbTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.DBUtility;
import utils.Database;
import java.util.List;
import java.util.Map;
public class dbValidation {
    @Before
    public void setUP(){
        DBUtility.establishConnection(Database.POSTGRESQL);
    }
    @After
    public void closeDB(){
        DBUtility.closeConnections();
    }
    @Test
    public void assertDB(){
        List<Map<String, Object>> departments =  DBUtility.getQueryResults("select * from departments");
        Assert.assertEquals(departments.get(0).get("dept_name"),"Marketing");
    }
}