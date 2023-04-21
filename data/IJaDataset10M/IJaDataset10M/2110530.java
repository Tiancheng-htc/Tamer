package com.kongur.network.erp.domain.system;

import java.util.Date;
import java.util.List;

public class SystemRole {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.ID
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.NAME
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.DESCRIPTION
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private String description;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.GMT_CREATE
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private Date gmtCreate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.GMT_MODIFY
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private Date gmtModify;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYSTEM_ROLE.OPERATOR
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    private String operator;

    private List<SystemFunction> systemFunctionList;

    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.ID
     *
     * @return the value of SYSTEM_ROLE.ID
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.ID
     *
     * @param id the value for SYSTEM_ROLE.ID
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.NAME
     *
     * @return the value of SYSTEM_ROLE.NAME
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.NAME
     *
     * @param name the value for SYSTEM_ROLE.NAME
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.DESCRIPTION
     *
     * @return the value of SYSTEM_ROLE.DESCRIPTION
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.DESCRIPTION
     *
     * @param description the value for SYSTEM_ROLE.DESCRIPTION
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.GMT_CREATE
     *
     * @return the value of SYSTEM_ROLE.GMT_CREATE
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.GMT_CREATE
     *
     * @param gmtCreate the value for SYSTEM_ROLE.GMT_CREATE
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.GMT_MODIFY
     *
     * @return the value of SYSTEM_ROLE.GMT_MODIFY
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.GMT_MODIFY
     *
     * @param gmtModify the value for SYSTEM_ROLE.GMT_MODIFY
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYSTEM_ROLE.OPERATOR
     *
     * @return the value of SYSTEM_ROLE.OPERATOR
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYSTEM_ROLE.OPERATOR
     *
     * @param operator the value for SYSTEM_ROLE.OPERATOR
     *
     * @ibatorgenerated Mon Apr 12 15:20:19 CST 2010
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<SystemFunction> getSystemFunctionList() {
        return systemFunctionList;
    }

    public void setSystemFunctionList(List<SystemFunction> systemFunctionList) {
        this.systemFunctionList = systemFunctionList;
    }
}