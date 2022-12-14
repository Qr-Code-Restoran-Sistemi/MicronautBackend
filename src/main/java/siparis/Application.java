package siparis;

import io.micronaut.runtime.Micronaut;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        log.info("Application Cannected");
    }
}
