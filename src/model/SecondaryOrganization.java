package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "SecondaryOrganization")
public class SecondaryOrganization {

    @Id
    @SequenceGenerator(name="SecondaryID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SecondaryID")
    @Column(name = "SecondaryID")
    private Long SecondaryID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OrganizationID")
    private Long OrganizationID;
    @Column(name = "SecondaryName")
    private String SecondaryName;
    @Column(name = "Description")
    private String Description;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public SecondaryOrganization(){}

    public SecondaryOrganization(Long organizationID, String secondaryName, String description, int createUserID, String createDate, String createTime) {
        OrganizationID = organizationID;
        SecondaryName = secondaryName;
        Description = description;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getSecondaryID() {
        return SecondaryID;
    }

    public void setSecondaryID(Long secondaryID) {
        SecondaryID = secondaryID;
    }

    public Long getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Long organizationID) {
        OrganizationID = organizationID;
    }

    public String getSecondaryName() {
        return SecondaryName;
    }

    public void setSecondaryName(String secondaryName) {
        SecondaryName = secondaryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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
