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
    @SequenceGenerator(name="InteractivePersonID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="InteractivePersonID")
    @Column(name = "InteractivePersonID")
    private Long InteractivePersonID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PersonID")
    @Column(name = "PersonID")
    private Person PersonID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrganizationID")
    @Column(name = "OrganizationID")
    private Organization OrganizationID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SecondaryID")
    @Column(name = "SecondaryID")
    private long SecondaryID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public InteractivePerson() {
    }

    public InteractivePerson(Long interactivePersonID, Person personID, Organization organizationID, long secondaryID, Users createUserID, String createDate, String createTime) {
        InteractivePersonID = interactivePersonID;
        PersonID = personID;
        OrganizationID = organizationID;
        SecondaryID = secondaryID;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public Long getInteractivePersonID() {
        return InteractivePersonID;
    }

    public void setInteractivePersonID(Long interactivePersonID) {
        InteractivePersonID = interactivePersonID;
    }

    public Person getPersonID() {
        return PersonID;
    }

    public void setPersonID(Person personID) {
        PersonID = personID;
    }

    public Organization getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(Organization organizationID) {
        OrganizationID = organizationID;
    }

    public long getSecondaryID() {
        return SecondaryID;
    }

    public void setSecondaryID(long secondaryID) {
        SecondaryID = secondaryID;
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
