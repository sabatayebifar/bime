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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AgencyDateID")
    private  Long AgencyDateID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AgencyID")
    private Long  AgencyID ;
    @Column(name = "State")
    private Long State;
    @Column(name = "Description")
    private Long Description;
    @Column(name = "ChangeDate")
    private Long ChangeDate;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public AgencyDate(Long agencyID, Long state, Long description, Long changeDate, int createUserID, String createDate, String createTime) {
        AgencyID = agencyID;
        State = state;
        Description = description;
        ChangeDate = changeDate;
        CreateUserID = createUserID;
        CreateDate = createDate;
        CreateTime = createTime;
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

    public Long getState() {
        return State;
    }

    public void setState(Long state) {
        State = state;
    }

    public Long getDescription() {
        return Description;
    }

    public void setDescription(Long description) {
        Description = description;
    }

    public Long getChangeDate() {
        return ChangeDate;
    }

    public void setChangeDate(Long changeDate) {
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
