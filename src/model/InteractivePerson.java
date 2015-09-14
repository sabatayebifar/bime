package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 9/14/15
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "InteractivePerson")
public class InteractivePerson {
    @Id
    @SequenceGenerator(name="NationalID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NationalID")
    @Column(name = "NationalID")
    private Long NationalID;
    @Column(name = "OrganizationID")
    private long OrganizationID;
    @Column(name = "SecondaryID")
    private long SecondaryID;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public InteractivePerson(long organizationID, long secondaryID, int createUserID, String createDate, String createTime) {
        OrganizationID = organizationID;
        SecondaryID = secondaryID;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getNationalID() {
        return NationalID;
    }

    public void setNationalID(Long nationalID) {
        NationalID = nationalID;
    }

    public long getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(long organizationID) {
        OrganizationID = organizationID;
    }

    public long getSecondaryID() {
        return SecondaryID;
    }

    public void setSecondaryID(long secondaryID) {
        SecondaryID = secondaryID;
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
