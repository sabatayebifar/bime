package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "UserRole")
public class UserRole {

    @Id
    @SequenceGenerator(name="UserRoleID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="UserRoleID")
    @Column(name = "UserRoleID")
    private Long UserRoleID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RoleID")
    private Role RoleID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private Users UserID;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public UserRole(){}

    public UserRole(Role roleID, Users userID, int createUserID, String createDate, String createTime) {
        RoleID = roleID;
        UserID = userID;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getUserRoleID() {
        return UserRoleID;
    }

    public void setUserRoleID(Long userRoleID) {
        UserRoleID = userRoleID;
    }

    public Role getRoleID() {
        return RoleID;
    }

    public void setRoleID(Role roleID) {
        RoleID = roleID;
    }

    public Users getUserID() {
        return UserID;
    }

    public void setUserID(Users userID) {
        UserID = userID;
    }

    public int getCreateUserID() {
        return CreateUserID;
    }

    public void setCreateUserID(int createUserID) {
        CreateUserID = createUserID;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
