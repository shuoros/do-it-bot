package io.github.shuoros.doitbot.dao.repository;

import io.github.shuoros.doitbot.dao.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
