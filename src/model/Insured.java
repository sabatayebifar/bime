package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="Insured")
public class Insured {

    @Id
    @SequenceGenerator(name="InsuredID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="InsuredID")
    @Column(name = "InsuredID")
    private Long InsuredID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PersonID")
    private Person PersonID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationID")
    private Long OrganizationID;
    @Column(name = "InsuredType")
    private int InsuredType;
    @Column(name = "AddressID")
    private Long AddressID;
    @Column(name = "ContactID")
    private Long ContactID;
    @Column(name = "Description")
    private String Description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public  Insured(){

    }

    public Insured(Person personID, Long organizationID, int insuredType, Long addressID, Long contactID, String description,
                   Users createUserID, String createDate, String createTime) {
        PersonID = personID;
        OrganizationID = organizationID;
        InsuredType = insuredType;
        AddressID = addressID;
        ContactID = contactID;
        Description = description;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getInsuredID() {
        return InsuredID;
    }

    public void setInsuredID(Long insuredID) {
        InsuredID = insuredID;
    }

    public Person getPersonID() {
        return PersonID;
    }

    public void setPersonID(Person personID) {
        PersonID = personID;
    }

    public Long getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Long organizationID) {
        OrganizationID = organizationID;
    }

    public int getInsuredType() {
        return InsuredType;
    }

    public void setInsuredType(int insuredType) {
        InsuredType = insuredType;
    }

    public Long getAddressID() {
        return AddressID;
    }

    public void setAddressID(Long addressID) {
        AddressID = addressID;
    }

    public Long getContactID() {
        return ContactID;
    }

    public void setContactID(Long contactID) {
        ContactID = contactID;
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
