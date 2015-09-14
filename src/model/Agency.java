package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 9/14/15
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "Agency")

public class Agency {
    @Id
    @SequenceGenerator(name="AgencyID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AgencyID")
    @Column(name = "AgencyID")
    private Long AgencyID;
    @Column(name = "Name")
    private String Name;
    @Column(name = "PID")
    private long PID;
    @Column(name = "AddressID")
    private long AddressID;
    @Column(name = "ContactID")
    private long ContactID;
    @Column(name = "AgencyType")
    private int AgencyType;
    @Column(name = "Type")
    private int Type;
    @Column(name = "State")
    private int State;
    @Column(name = "FourDigitCode")
    private int FourDigitCode;
    @Column(name = "ActiveBeginDate")
    private String ActiveBeginDate;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Agency(String name, long PID, long addressID, long contactID, int agencyType, int type, int state,
                  int fourDigitCode, String activeBeginDate, int createUserID, String createDate, String createTime) {
        Name          = name;
        this.PID      = PID;
        AddressID     = addressID;
        ContactID     = contactID;
        AgencyType    = agencyType;
        Type          = type;
        State         = state;
        FourDigitCode = fourDigitCode;
        ActiveBeginDate = activeBeginDate;
        CreateUserID    = createUserID;
        CreateDate      = createDate;
        CreateTime      = createTime;
    }

    public Long getAgencyID() {
        return AgencyID;
    }

    public void setAgencyID(Long agencyID) {
        AgencyID = agencyID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPID() {
        return PID;
    }

    public void setPID(long PID) {
        this.PID = PID;
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

    public int getAgencyType() {
        return AgencyType;
    }

    public void setAgencyType(int agencyType) {
        AgencyType = agencyType;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public int getFourDigitCode() {
        return FourDigitCode;
    }

    public void setFourDigitCode(int fourDigitCode) {
        FourDigitCode = fourDigitCode;
    }

    public String getActiveBeginDate() {
        return ActiveBeginDate;
    }

    public void setActiveBeginDate(String activeBeginDate) {
        ActiveBeginDate = activeBeginDate;
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
