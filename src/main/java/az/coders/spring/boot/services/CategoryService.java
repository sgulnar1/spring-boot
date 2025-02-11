package az.coders.spring.boot.services;

import az.coders.spring.boot.domains.Category;

public interface CategoryService {
    Iterable<Category> getAll();
}
