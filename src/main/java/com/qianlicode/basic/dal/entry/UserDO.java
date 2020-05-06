package com.qianlicode.basic.dal.entry;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class UserDO implements Serializable {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 用户uuid
     */
    @Column(name = "user_uuid")
    private String userUuid;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户uuid
     *
     * @return user_uuid - 用户uuid
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * 设置用户uuid
     *
     * @param userUuid 用户uuid
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更改时间
     *
     * @return gmt_modify - 更改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置更改时间
     *
     * @param gmtModify 更改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}