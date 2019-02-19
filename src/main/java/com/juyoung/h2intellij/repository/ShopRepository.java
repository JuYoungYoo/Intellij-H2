package com.juyoung.h2intellij.repository;


import com.juyoung.h2intellij.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {

}
