package com.wjy.dbutil;

import com.wjy.dbutil.config.ShardingUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DbutilApplicationTests {

	@Autowired
	private ShardingUtil shardingUtil;

	@Test
	public void test_initTables(){
		shardingUtil.initTables("/sql/init.sql");
	}

}
