package com.yus.service;
import com.yus.entity.Person;
import com.yus.service.impl.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.yus.container.*;
@Slf4j
public class IocTests {

    // 容器
    private Container container;
    private Person xiaoming;
    private String name = "xiaoming";

    // 准备好容器，将bean生成出来，交给容器管理
    @BeforeEach
    public void init() {
        container = new Container();
        xiaoming = new Person();
        xiaoming.setName(name);
        container.put(Bike.class,new Bike());
        container.put(Car.class,new Car());
        container.put(Train.class,new Train());
        container.put(AirPlane.class,new AirPlane());
        container.put(Ship.class,new Ship());

        log.info("测试开始： {} 要出去浪：", name);
    }

    // 测试时，从容器中取出相应的bean组件来使用
    // 小明对车有依赖，但车是从容器中获取的，之前，只new了容器
    @Test
    public void test1() {
        Drivable bike = container.getBean(Bike.class);
        xiaoming.setDrivable(bike);
        xiaoming.hangOut();
    }

    @Test
    public void test2() {
        Drivable car = container.getBean(Car.class);
        xiaoming.setDrivable(car);
        xiaoming.hangOut();
    }
    @Test
    public void test3() {
        Drivable train = container.getBean(Train.class);
        xiaoming.setDrivable(train);
        xiaoming.hangOut();
    }
    @Test
    public void test4() {
        Drivable airPlane = container.getBean(AirPlane.class);
        xiaoming.setDrivable(airPlane);
        xiaoming.hangOut();
    }
    @Test
    public void test5() {
        Drivable ship = container.getBean(Ship.class);
        xiaoming.setDrivable(ship);
        xiaoming.hangOut();
    }
}