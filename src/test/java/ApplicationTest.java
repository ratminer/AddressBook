import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import webApp.GreetingController;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by robertfernandes on 2/9/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private GreetingController greetingController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(greetingController).isNotNull();
    }
}
