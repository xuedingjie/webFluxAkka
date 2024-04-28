package com.xuedingjie.webflux.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Table("oc_user")
public class User implements Serializable {

    private static final long serialVersionUID = -3877420202186831385L;
    /**
     * -- GETTER --
     *
     * @return id
     */
    @Id
    private Integer id;

    /**
     * 用户名
     * -- GETTER --
     * 获取用户名
     *
     * @return username - 用户名
     */
    private String username;

    /**
     * 前端框架用户专用
     */
    private String uuid;

    /**
     * -- GETTER --
     *
     * @return password
     */
    private String password;

    /**
     * 姓名
     * -- GETTER --
     * 获取姓名
     *
     * @return name - 姓名
     */
    private String name;

    /**
     * 显示名称
     * -- GETTER --
     * 获取显示名称
     *
     * @return display_name - 显示名称
     */
    @Column(value = "display_name")
    private String displayName;

    private String jobName;

    private String jobLevel;
    private String manageLevel;

    private String jobNo;

    private String supDisplayName;

    private Integer supUserId;

    private String supsDisplayName;

    private Integer supsUserId;
    /**
     * 邮箱
     * -- GETTER --
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    private String email;

    /**
     * -- GETTER --
     *
     * @return is_active
     */
    private Boolean isActive;

    private LocalDateTime lastLogin;

    /**
     * -- GETTER --
     *
     * @return wechat
     */
    private String wechat;

    /**
     * 手机
     * -- GETTER --
     * 获取手机
     *
     * @return phone - 手机
     */
    private String phone;

    /**
     * -- GETTER --
     *
     * @return created_by
     */
    private String createdBy;

    private LocalDateTime entryTime;
    /**
     * 数据源
     * -- GETTER --
     * 获取数据源
     *
     * @return source - 数据源
     */
    private String source;

    /**
     * 创建时间
     * -- GETTER --
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     * -- GETTER --
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    private LocalDateTime updateTime;


    /**
     * -- GETTER --
     *
     * @return comment
     */
    private String comment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getManageLevel() {
        return manageLevel;
    }

    public void setManageLevel(String manageLevel) {
        this.manageLevel = manageLevel;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getSupDisplayName() {
        return supDisplayName;
    }

    public void setSupDisplayName(String supDisplayName) {
        this.supDisplayName = supDisplayName;
    }

    public Integer getSupUserId() {
        return supUserId;
    }

    public void setSupUserId(Integer supUserId) {
        this.supUserId = supUserId;
    }

    public String getSupsDisplayName() {
        return supsDisplayName;
    }

    public void setSupsDisplayName(String supsDisplayName) {
        this.supsDisplayName = supsDisplayName;
    }

    public Integer getSupsUserId() {
        return supsUserId;
    }

    public void setSupsUserId(Integer supsUserId) {
        this.supsUserId = supsUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}