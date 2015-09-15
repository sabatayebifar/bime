package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 9/14/15
 * Time: 9:21 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "UserID")
    private int UserID;
    @Column(name = "UserName")
    private String UserName;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Type")
    private int Type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgencyID")
    private Agency AgencyID;
    @Column(name = "State")
    private int State;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgencyID")
    private long PlaceID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreateUserID")
    private Users CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Users(int userID, String userName, String password, int type, Agency agencyID, int state, long placeID, Users createUserID, String createDate, String createTime) {
        UserID = userID;
        UserName = userName;
        Password = password;
        Type = type;
        AgencyID = agencyID;
        State = state;
        PlaceID = placeID;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public int getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public int getType() {
        return Type;
    }

    public Agency getAgencyID() {
        return AgencyID;
    }

    public int getState() {
        return State;
    }

    public long getPlaceID() {
        return PlaceID;
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

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public void setCreateUserID(Users createUserID) {
        CreateUserID = createUserID;
    }

    public void setPlaceID(long placeID) {
        PlaceID = placeID;
    }

    public void setState(int state) {
        State = state;
    }

    public void setAgencyID(Agency agencyID) {
        AgencyID = agencyID;
    }

    public void setType(int type) {
        Type = type;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
