package com.SprSt.StudySpring.Chapter3.ExcludeWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**Тут Демонстрируется, что можно выключить какие-то зависимости
 * в классе аннотацией @EnableAutoConfiguration(exclude = *Название класса*.class)
 * То же самое доступно в @SpringBootApplication, т.к. он наследует
 * @EnableAutoConfiguration, @Configuration и @ComponentScan**/

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class App {

    @GetMapping("/")
    String greetings() {
        return "Spring Boot Rocks!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
