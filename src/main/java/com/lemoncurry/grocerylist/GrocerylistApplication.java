package com.lemoncurry.grocerylist;

import com.lemoncurry.grocerylist.model.Item;
import com.lemoncurry.grocerylist.service.ItemService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrocerylistApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrocerylistApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ItemService itemService) {
        return args -> {
            itemService.save(new Item(1L, "Gurke", 3.00));
            itemService.save(new Item(2L, "Apfel", 0.50));
            itemService.save(new Item(3L, "Banane", 0.60));
        };
    }

}
