package com.example.demo4.POJO;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SysUser {

  private long id;
  private String userName;
  private String nickName;
  private String password;
  private String status;
  private String email;
  private String phonenumber;
  private String sex;
  private String avatar;
  private String userType;
  private long createBy;
  private java.sql.Timestamp createTime;
  private long updateBy;
  private java.sql.Timestamp updateTime;
  private long delFlag;

}
