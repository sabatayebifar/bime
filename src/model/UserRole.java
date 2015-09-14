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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RoleID")
    private Long RoleID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UserID")
    private int UserID;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public UserRole(){}
    public UserRole(Long userRoleID, int userID, int createUserID, String createDate, String createTime) {
        UserRoleID      = userRoleID;
        UserID          = userID;
        CreateUserID    = createUserID;
        CreateDate      = createDate;
        CreateTime      = createTime;
    }

    public Long getRoleID() {
        return RoleID;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public Long getUserRoleID() {
        return UserRoleID;
    }

    public void setUserRoleID(Long userRoleID) {
        UserRoleID = userRoleID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
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
