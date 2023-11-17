package s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Start running CLI for S3 Application ...");
        String data = executeGET("http://localhost:5900/s3-upload-download");

        log.info(" --------> GET data: " + data);

        log.info(" >> We will stop the JavaApp now. Bye bye ...");
        System.exit(0);
    }

    private String executeGET(String url) {
        RestTemplate rest = new RestTemplate();
        return rest.getForObject(url, String.class);
    }

}
