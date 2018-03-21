package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shinya"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    public String getGreeting() {
        return "Hello World!";
    }
}