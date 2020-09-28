package com.demoreactive.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {

    private Integer id;
    private LocalDateTime time;
    private String name;
}
