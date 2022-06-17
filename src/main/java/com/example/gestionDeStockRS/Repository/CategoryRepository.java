package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
