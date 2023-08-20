package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class Springboot17MogodbApplicationTests {

	@Autowired
	private MongoTemplate mongoTemplate;
	@Test
	void contextLoads() {
		Book book = new Book();
		book.setName("fafa");
		book.setType("guolai");
		Book save = mongoTemplate.save(book);
		System.out.println(save);

		System.out.println(mongoTemplate.findAll(Book.class));


	}

}
