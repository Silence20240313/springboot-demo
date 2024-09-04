package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest  // 整合单元测试的注解
class SpringbootWebQuickstartApplicationTests {
    @Autowired
	private UserMapper userMapper;

    @Test
	public void testListUser(){
		List<User2> user1List = userMapper.list();
		user1List.stream().forEach(user -> {
			System.out.println(user);
		});
	}
}
