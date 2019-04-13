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
            itemService.save(new Item("Gurke", "Grocery"));
            itemService.save(new Item("Apfel", "Grovery"));
            itemService.save(new Item("Banane", "Grocery"));
        };
    }

}
