package com.example.onlineShop.repositories;

import com.example.onlineShop.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image,Long> {
}
