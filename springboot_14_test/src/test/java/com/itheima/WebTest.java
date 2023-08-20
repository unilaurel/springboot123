package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * ClassName: WebTest
 * Package: com.itheima
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/10 20:31
 * @Version 1.0
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc  //开启虚拟MVC调用
public class WebTest {
    @Test
    public void testWeb(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        //执行对应的请求
        mvc.perform(builder);
    }

    @Test
    public void testStatus(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books1");
        //执行对应的请求
        ResultActions actions= mvc.perform(builder);
        //设置预期值，与真实值进行比较，成功测试通过，失败则测试不通过
        //定义本次调用的预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        //预计本次调用时成功的：状态200
        ResultMatcher ok = status.isOk();
        //添加预计值到本次调用过程中进行匹配
        actions.andExpect(ok);
    }

    @Test
    public void testBody(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        //执行对应的请求
        ResultActions actions= mvc.perform(builder);
        //设置预期值，与真实值进行比较，成功测试通过，失败则测试不通过
        //定义本次调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.string("springboot2");
        //添加预计值到本次调用过程中进行匹配
        actions.andExpect(result);
    }


    @Test
    public void testJson(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        //执行对应的请求
        ResultActions actions= mvc.perform(builder);
        //设置预期值，与真实值进行比较，成功测试通过，失败则测试不通过
        //定义本次调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.json("{\"id\":121,\"name\":\"MySQL\",\"type\":\"it\",\"description\":\"fafa  guolai\"}");
        //添加预计值到本次调用过程中进行匹配
        actions.andExpect(result);
    }

    @Test
    public void testContentType(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        //执行对应的请求
        ResultActions actions= mvc.perform(builder);
        //设置预期值，与真实值进行比较，成功测试通过，失败则测试不通过
        //定义本次调用的预期值
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher result = header.string("Content-Type", "application/json");
        //添加预计值到本次调用过程中进行匹配
        actions.andExpect(result);
    }


    @Test
    public void testById(@Autowired MockMvc mvc) throws Exception {
        //创建虚拟请求，当前访问/books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        //执行对应的请求
        ResultActions actions= mvc.perform(builder);
        //设置预期值，与真实值进行比较，成功测试通过，失败则测试不通过
        //定义本次调用的预期值


        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        actions.andExpect(ok);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.json("{\"id\":121,\"name\":\"MySQL\",\"type\":\"it\",\"description\":\"fafa  guolai\"}");
        actions.andExpect(result);

        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher result1 = header.string("Content-Type", "application/json");
        actions.andExpect(result1);
    }
}
