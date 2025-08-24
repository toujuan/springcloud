package org.example.scabrandms.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@TableName("t_student")
public class Student {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private LocalDate birthday;
    private String phone;
}
