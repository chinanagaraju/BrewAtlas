package org.brewery.Brewery;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.brewery.Repo")

@ComponentScan(basePackages = {"org.brewery.DTO","org.brewery.Brewery","org.brewery.Service","org.brewery.Service.UserIMPL","org.brewery.UserController"})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println("run");
    }
}
