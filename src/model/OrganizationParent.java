package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name= "OrganizationParent")
public class OrganizationParent {
    @Id
    @SequenceGenerator(name="OrganizationParentID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="OrganizationParentID")
    @Column(name = "OrganizationParentID")
    private Long InsuredParentID;
    @Column(name = "Name")
    private Long Name;
    @Column(name = "Description")
    private String Description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public OrganizationParent(){

    }

    public OrganizationParent(Long name, String description, Users createUserID, String createDate, String createTime) {
        Name = name;
        Description = description;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getInsuredParentID() {
        return InsuredParentID;
    }

    public void setInsuredParentID(Long insuredParentID) {
        InsuredParentID = insuredParentID;
    }

    public Long getName() {
        return Name;
    }

    public void setName(Long name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Users getCreateUserID() {
        return CreateUserID;
    }

    public void setCreateUserID(Users createUserID) {
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
