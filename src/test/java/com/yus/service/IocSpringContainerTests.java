package com.yus.service;

import com.yus.entity.Person;
import com.yus.service.impl.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class IocSpringContainerTests {

    @Autowired private Person person;
    @Autowired private Car car;

    @Test
    public void test() {
        person.setName("小明").setDrivable(car).hangOut();
        log.info("测试结束：{} 浪完了~", person.getName());
    }
}