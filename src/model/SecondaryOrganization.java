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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationID")
    private Organization OrganizationID;
    @Column(name = "SecondaryName")
    private String SecondaryName;
    @Column(name = "Description")
    private String Description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public SecondaryOrganization(){}

    public SecondaryOrganization(Organization organizationID, String secondaryName, String description, Users createUserID, String createDate, String createTime) {
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

    public Organization getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Organization organizationID) {
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
