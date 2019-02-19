package com.juyoung.h2intellij.repository;

import com.juyoung.h2intellij.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
