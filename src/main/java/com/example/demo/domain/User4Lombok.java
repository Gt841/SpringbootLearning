package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class User4Lombok {
     @Getter
     @Setter
    private String userName;
     @Getter
     @Setter
    private Integer age;

    @Override
    public String toString() {
        return "UserEntity [userName=" + userName + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        User4Lombok user4Lombok = new User4Lombok();
        user4Lombok.setUserName("zhangsan");
        user4Lombok.setAge(20);
        System.out.println(user4Lombok.toString());
        log.info("####我是日志####");
    }
}
