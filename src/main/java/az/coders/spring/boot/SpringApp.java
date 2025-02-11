package az.coders.spring.boot;

import az.coders.spring.boot.domains.Category;
import az.coders.spring.boot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext application = SpringApplication.run(SpringApp.class, args);
        CategoryRepository categoryRepository = application.getBean("categoryRepository", CategoryRepository.class);
        System.out.println("find all before");
        categoryRepository.findAll().forEach(System.out::println);
        System.out.println("find all after");

        categoryRepository.save(new Category(7, "name " + 7, "desc" + 7));
        categoryRepository.findAll().forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("find by name");
        categoryRepository.findByName("name " + 7).forEach(System.out::println);
    }
}
