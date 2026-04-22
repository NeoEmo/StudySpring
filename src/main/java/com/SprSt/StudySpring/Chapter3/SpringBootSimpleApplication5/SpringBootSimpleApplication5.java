package com.SprSt.StudySpring.Chapter3.SpringBootSimpleApplication5;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


@SpringBootApplication
public class SpringBootSimpleApplication5 {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                // Соединение с greetings
                .web(WebApplicationType.SERVLET)
                // Выключение Баннера
                .bannerMode(Banner.Mode.OFF)
                // Загрузка основного файла
                .sources(SpringBootSimpleApplication5.class)
                // Отключение журналирования (logging)
                .logStartupInfo(false)
                // Подключение профилей
                .profiles("prod","cloud")
                /* Подключение прослушивателей
                  (с использованием лямбды, вместо
                  Logger log = LoggerFactory.getLogger(springBootSimpleApplication.class) итд) */
                .listeners((ApplicationListener<ApplicationEvent>) event -> {
                    System.out.println("#### > " + event.getClass().getCanonicalName());
                })
                // Запуск
                .run(args);
    }


}
