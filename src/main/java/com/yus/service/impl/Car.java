package com.yus.service.impl;
import com.yus.service.Drivable;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
@Component("Car")
@Slf4j
public class Car implements Drivable{
    @Override
    public void drive() {
        log.info("开着车出去浪~");
    }
}