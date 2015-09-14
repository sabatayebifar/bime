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
    @SequenceGenerator(name="UserID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UserID")
    @Column(name = "UserID")
    private Long UserID;
    @Column(name = "UserName")
    private String UserName;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Type")
    private int Type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AgencyID")
    private long AgencyID;
    @Column(name = "State")
    private int State;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PlaceID")
    private long PlaceID;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Users(
            Long UserID   ,String UserName   ,  String Password    ,   int Type  ,
            long AgencyID,  int State ,  long PlaceID  ,
            int CreateUserID , String CreateDate ,  String CreateTime ){

        this.UserID       = UserID;
        this.UserName     = UserName;
        this.Password     = Password;
        this.Type         = Type;
        this.AgencyID     = AgencyID;
        this.State        = State;
        this.PlaceID      = PlaceID;
        this.CreateUserID = CreateUserID;
        this.CreateDate   = CreateDate;
        this.CreateTime   = CreateTime;

    }

    public Long getUserID() {
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

    public long getAgencyID() {
        return AgencyID;
    }

    public int getState() {
        return State;
    }

    public long getPlaceID() {
        return PlaceID;
    }

    public int getCreateUserID() {
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

    public void setCreateUserID(int createUserID) {
        CreateUserID = createUserID;
    }

    public void setPlaceID(long placeID) {
        PlaceID = placeID;
    }

    public void setState(int state) {
        State = state;
    }

    public void setAgencyID(long agencyID) {
        AgencyID = agencyID;
    }

    public void setType(int type) {
        Type = type;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
