package model;

import java.io.Serializable;

public class RolePermModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_perm.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_perm.perm_id
     *
     * @mbggenerated
     */
    private Integer permId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_perm
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_perm.role_id
     *
     * @return the value of role_perm.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_perm.role_id
     *
     * @param roleId the value for role_perm.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_perm.perm_id
     *
     * @return the value of role_perm.perm_id
     *
     * @mbggenerated
     */
    public Integer getPermId() {
        return permId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_perm.perm_id
     *
     * @param permId the value for role_perm.perm_id
     *
     * @mbggenerated
     */
    public void setPermId(Integer permId) {
        this.permId = permId;
    }
}