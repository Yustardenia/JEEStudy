package com.yus.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yus.service.Drivable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Component
public class Person {
    private String name;
    private Drivable drivable;

    public void hangOut() {
        drivable.drive();
    }
}