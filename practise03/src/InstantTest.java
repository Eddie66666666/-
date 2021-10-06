import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author LiuJun
 * @create 2021-10-06-23:22
 */
public class InstantTest {
    @Test
    public void test5(){
        //获取本初子午线时间
        Instant instant=Instant.now();
        System.out.println(instant);

        //设置时间偏移量
        OffsetDateTime offsetDateTime=instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }


}

