package com.yus.service.impl;
import org.springframework.stereotype.Component;

import com.yus.service.Drivable;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component("AirPlane")
public class AirPlane implements Drivable{
    @Override
    public void drive() {
        log.info("坐灰机出去浪~biu~~~");
    }
}