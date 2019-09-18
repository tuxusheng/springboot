package com.xs.springboot2.pojo;

import java.io.Serializable;

/**
 * (SysEmployee)实体类
 *
 * @author makejava
 * @since 2019-09-09 15:32:47
 */

public class SysEmployee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int sn;

    private Integer positionId;

    private Integer departmentId;

    private String name;

    private String password;

    private String status;


    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysEmployee{" +
                "sn='" + sn + '\'' +
                ", positionId=" + positionId +
                ", departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}