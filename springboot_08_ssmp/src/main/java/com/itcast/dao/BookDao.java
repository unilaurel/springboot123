package com.itcast.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itcast.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BookDao
 * Package: com.itcast.dao
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/05 22:46
 * @Version 1.0
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
