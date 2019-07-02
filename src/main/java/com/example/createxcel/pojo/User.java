package com.example.createxcel.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = -4661496152017985763L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private String sex;


}
