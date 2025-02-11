package az.coders.spring.boot.services.impl;

import az.coders.spring.boot.domains.Category;
import az.coders.spring.boot.repositories.CategoryRepository;
import az.coders.spring.boot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }
}
