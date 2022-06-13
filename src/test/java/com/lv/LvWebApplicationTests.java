package com.lv;

import com.lv.controller.LvUserController;
import com.lv.entity.LvUser;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
class LvWebApplicationTests {

    Logger logger = Logger.getLogger(LvWebApplicationTests.class);

    @Autowired
    LvUserController userController;

    @Test
    void contextLoads() {

        userController.add(new LvUser(1, "123456"));
        logger.info("测试日志");
    }

}
