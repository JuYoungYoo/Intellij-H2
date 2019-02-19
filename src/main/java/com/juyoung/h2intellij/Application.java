package com.juyoung.h2intellij;

import com.juyoung.h2intellij.domain.Item;
import com.juyoung.h2intellij.domain.Shop;
import com.juyoung.h2intellij.repository.ItemRepository;
import com.juyoung.h2intellij.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private ShopRepository shopRepository;
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception{
		shopRepository.save(new Shop("jojoldu", "jojoldu.tistory.com"));
		itemRepository.save(new Item("jojoldu's Github", 1000));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
