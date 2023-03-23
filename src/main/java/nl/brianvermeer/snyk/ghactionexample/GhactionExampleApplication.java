package nl.brianvermeer.snyk.ghactionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final String password = "DefaultLoginPasswordDoNotChange!";
    public static final String newKey = "mISydD0En55Fq8FXbUfX720K8Vc6/aQYtkFmkp7ntsM=";
}

@SpringBootApplication
public class GhactionExampleApplication {

    public static void main(String[] args) {
        private String apiKey = "P6wa1NepBwp5wssOz9sXj7rfL3sPOvGDBdOC022CyrH5U9UtjmrDuS"; // test for secrets detection
        SpringApplication.run(GhactionExampleApplication.class, args);
    }

}
