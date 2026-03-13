package com.yus.service.impl;
import org.springframework.stereotype.Component;
import com.yus.service.Drivable;
import lombok.extern.slf4j.Slf4j;
@Component("Bike")
@Slf4j
public class Bike implements Drivable{
    @Override
    public void drive() {

        log.info("骑着自行车出去浪~");
    }
}