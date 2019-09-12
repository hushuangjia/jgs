package cn.kgc.mybatis.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created with IDEA
 * author:bdqn kgc zhou qi chao
 * Date:2019/8/28
 * Time:14:47
 */
@Data
public class User {
    private Integer id;
    private String userCode;
    private String userName;
    private String userPassword;
    private Integer gender;
    private Date birthday;
    private String phone;
    private String address;
    private Integer userRole;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String idPicPath;
    private String workPicPath;




}
