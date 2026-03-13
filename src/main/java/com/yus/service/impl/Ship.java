package com.yus.service.impl;
import org.springframework.stereotype.Component;

import com.yus.service.Drivable;
import lombok.extern.slf4j.Slf4j;
@Component("Ship")
@Slf4j
public class Ship implements Drivable{
    @Override
    public void drive() {
        log.info("坐船出去浪里个浪~");
    }
}