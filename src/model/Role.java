package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "Role")

public class Role {
    @Id
    @SequenceGenerator(name="RoleID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="RoleID")
    @Column(name = "RoleID")
    private Long RoleID;
    @Column(name = "RoleName")
    private String RoleName;
    @Column(name = "RoleAccessID")
    private int RoleAccessID;
    @Column(name = "LatinName")
    private String LatinName;
    @Column(name = "SubSystemID")
    private int SubSystemID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Role(){
    }

    public Role(
            Long RoleID   ,String RoleName   ,  int RoleAccessID    ,   String LatinName  ,
            int SubsystemID,  Users CreateUSerID , String CreateDate , String CreateTime
    ){

        this.RoleID                 = RoleID;
        this.RoleName               = RoleName;
        this.RoleAccessID           = RoleAccessID;
        this.LatinName              = LatinName;
        this.SubSystemID            = SubsystemID;
        this.CreateUserID           = CreateUSerID;
        this.CreateDate             = CreateDate;
        this.CreateTime             = CreateTime;

    }

    public Long getRoleID() {
        return RoleID;
    }

    public int getRoleAccessID() {
        return RoleAccessID;
    }

    public String getLatinName() {
        return LatinName;
    }

    public int getSubSystemID() {
        return SubSystemID;
    }

    public Users getCreateUserID() {
        return CreateUserID;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public void setRoleAccessID(int roleAccessID) {
        RoleAccessID = roleAccessID;
    }

    public void setLatinName(String latinName) {
        LatinName = latinName;
    }

    public void setSubSystemID(int subSystemID) {
        SubSystemID = subSystemID;
    }

    public void setCreateUserID(Users createUserID) {
        CreateUserID = createUserID;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
