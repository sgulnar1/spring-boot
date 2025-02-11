package az.coders.spring.boot.controllers;

import az.coders.spring.boot.domains.Category;
import az.coders.spring.boot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Iterable<Category> getCategories() {
        return categoryService.getAll();
    }
}
