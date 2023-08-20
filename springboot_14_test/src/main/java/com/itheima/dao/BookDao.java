package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BookDao
 * Package: com.itheima.dao
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 21:35
 * @Version 1.0
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
