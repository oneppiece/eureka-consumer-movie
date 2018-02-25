package com.example.eurekaconsumermovie;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * liyan-下午6:15
 **/

@Getter
@Setter
@Component
public class User {
    private Long id;
    private String userName;
    private int age;
    private String name;
    private BigDecimal balance;
}