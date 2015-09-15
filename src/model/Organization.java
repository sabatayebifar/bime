package model;

import javax.persistence.*;
/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 9/13/15
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @SequenceGenerator(name="OrganizationID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OrganizationID")
    @Column(name = "OrganizationID")
    private Long OrganizationID;
    @Column(name = "EconomicCode")
    private Long EconomicCode;
    @Column(name = "OrgName")
    private String OrgName;
    @Column(name = "OrgType")
    private int OrgType;
    @Column(name = "RegisterNo")
    private int RegisterNo;
    @Column(name = "Sheba")
    private String Sheba;
    @Column(name = "AddressID")
    private long AddressID;
    @Column(name = "ContactID")
    private long ContactID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationParentID")
    @Column(name = "ParentID")
    private OrganizationParent ParentID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;


    public  Organization(){

    }

    public Organization(Long economicCode, String orgName, int orgType, int registerNo, String sheba, long addressID, long contactID, OrganizationParent parentID, Users createUserID, String createDate, String createTime) {
        EconomicCode = economicCode;
        OrgName = orgName;
        OrgType = orgType;
        RegisterNo = registerNo;
        Sheba = sheba;
        AddressID = addressID;
        ContactID = contactID;
        ParentID = parentID;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Long organizationID) {
        OrganizationID = organizationID;
    }

    public Long getEconomicCode() {
        return EconomicCode;
    }

    public void setEconomicCode(Long economicCode) {
        EconomicCode = economicCode;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public int getOrgType() {
        return OrgType;
    }

    public void setOrgType(int orgType) {
        OrgType = orgType;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getSheba() {
        return Sheba;
    }

    public void setSheba(String sheba) {
        Sheba = sheba;
    }

    public long getAddressID() {
        return AddressID;
    }

    public void setAddressID(long addressID) {
        AddressID = addressID;
    }

    public long getContactID() {
        return ContactID;
    }

    public void setContactID(long contactID) {
        ContactID = contactID;
    }

    public OrganizationParent getParentID() {
        return ParentID;
    }

    public void setParentID(OrganizationParent parentID) {
        ParentID = parentID;
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
