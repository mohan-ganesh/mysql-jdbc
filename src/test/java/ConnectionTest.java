

import com.mkyong.jdbc.JDBCExample;
import com.mkyong.jdbc.JDBCExample2;

import org.junit.jupiter.api.Test;

public class ConnectionTest {

    @Test
    public void testConnection() {
        System.out.println("start");

        try {
        JDBCExample example = new JDBCExample();
        example.main();
        }catch(Exception e) {
            e.getMessage();
        }

        try {
            JDBCExample2 example2 = new JDBCExample2();
            example2.main();
            }catch(Exception e) {
                e.getMessage();
            }

            System.out.println("end");
    }
    
}
