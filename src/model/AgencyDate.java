package model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/14/15
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "AgencyDate")
public class AgencyDate {

    @Id
    @SequenceGenerator(name="AgencyDateID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="AgencyDateID")
    @Column(name = "AgencyDateID")
    private  Long AgencyDateID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AgencyID")
    private Long  AgencyID ;
    @Column(name = "State")
    private int State;
    @Column(name = "Description")
    private String Description;
    @Column(name = "ChangeDate")
    private int ChangeDate;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public AgencyDate(Long agencyID, int state, String description, int changeDate, int createUserID, String createDate, String createTime) {
        AgencyID = agencyID;
        State = state;
        Description = description;
        ChangeDate = changeDate;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
    }

    public AgencyDate() {
    }

    public Long getAgencyDateID() {
        return AgencyDateID;
    }

    public void setAgencyDateID(Long agencyDateID) {
        AgencyDateID = agencyDateID;
    }

    public Long getAgencyID() {
        return AgencyID;
    }

    public void setAgencyID(Long agencyID) {
        AgencyID = agencyID;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getChangeDate() {
        return ChangeDate;
    }

    public void setChangeDate(int changeDate) {
        ChangeDate = changeDate;
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
