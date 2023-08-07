package com.itcast;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itcast.dao.BookDao;
import com.itcast.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SSMPApplicationTests {
	@Autowired
	BookDao bookDao;

	@Test
	void contextLoads() {
//		System.out.println(bookDao.selectById(1));
		bookDao.selectById(3);
	}

	@Test
	public void testPage(){

		IPage<Book> page=new Page<>(2,5);
		bookDao.selectPage(page, null);
		for (Book record : page.getRecords()) {
			System.out.println(record);

		}
	}

	@Test
	public void testGetBy(){

		LambdaQueryWrapper<Book> lwr = new LambdaQueryWrapper<>();
		lwr.like(Book::getName, "Spring");
		bookDao.selectList(lwr);
	}

	@Test
	public void testGetBy2(){

		String name=null;
		QueryWrapper<Book> wr = new QueryWrapper<>();
		wr.lambda().like(name!=null,Book::getName,name);
		bookDao.selectList(wr);
	}

}
