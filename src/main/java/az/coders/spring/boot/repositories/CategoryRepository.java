package az.coders.spring.boot.repositories;

import az.coders.spring.boot.domains.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    List<Category> findByName(String name);
}
