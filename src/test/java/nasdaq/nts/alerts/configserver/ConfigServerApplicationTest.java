package nasdaq.nts.alerts.configserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = ConfigServerApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Slf4j
public class ConfigServerApplicationTest {

  @LocalServerPort
  private int port;

  @Test
  public void contextLoads() {
    log.info("Spring boot test started on port [{}]", port);
  }

}
