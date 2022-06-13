package projectStartTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class projectStartTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(projectStartTestApplication.class,args);
        log.info("项目启动成功...");
        log.info("项目启动成功...");
    }
}
