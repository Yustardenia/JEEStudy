package com.yus.service.impl;

import org.springframework.stereotype.Component;

import com.yus.service.Drivable;
import lombok.extern.slf4j.Slf4j;
@Component("Train")
@Slf4j
public class Train implements Drivable{
    @Override
    public void drive() {
        log.info("坐火车出去浪~哐当哐当~呜~~~");
    }
}