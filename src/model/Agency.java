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
    private int ActiveBeginDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Agency() {
    }

    public Agency(String name, long PID, long addressID, long contactID, int agencyType, int type, int state,
                  int fourDigitCode, int activeBeginDate, Users createUserID, String createDate, String createTime) {
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

    public int getActiveBeginDate() {
        return ActiveBeginDate;
    }

    public void setActiveBeginDate(int activeBeginDate) {
        ActiveBeginDate = activeBeginDate;
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
