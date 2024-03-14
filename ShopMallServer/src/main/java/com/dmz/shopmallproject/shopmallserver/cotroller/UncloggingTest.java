package com.dmz.shopmallproject.shopmallserver.cotroller;/**
 * 连通性测试类
 *
 * @author Dmz Email:  * @since 2024/03/14 20:30
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dmz xxx@163.com
 * @version 2024/3/14 20:30
 * @since JDK17
 */
@RestController
public class UncloggingTest {
    @RequestMapping("hello")
    public String unClogTest(){
        System.out.println("连通性测试");
        return "hello World~~~~hahahaha!!!!!";
    }
}

