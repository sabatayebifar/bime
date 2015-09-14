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
    @Column(name = "ParentID")
    private long ParentID;
    @Column(name = "CreateUserID")
    private int CreateUserID;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;


    public  Organization(){

    }
    public Organization(
            Long OrganizationID   ,Long EconomicCode   ,  String OrgName    ,   int OrgType  ,
            int RegisterNo,  String Sheba ,  long AddressID  ,  long ContactID  , long ParentID  ,
            int CreateUserID , String CreateDate ,  String CreateTime ){

        this.OrganizationID       = OrganizationID;
        this.EconomicCode         = EconomicCode;
        this.OrgName              = OrgName;
        this.OrgType              = OrgType;
        this.RegisterNo           = RegisterNo;
        this.Sheba                = Sheba;
        this.AddressID            = AddressID;
        this.ContactID            = ContactID;
        this.ParentID             = ParentID;
        this.CreateUserID         = CreateUserID;
        this.CreateDate           = CreateDate;
        this.CreateTime           = CreateTime;

    }

    public Long getId() {
        return OrganizationID;
    }

    public void setId(Long id) {
        this.OrganizationID = id;
    }

    public long getEconomicCode(){
        return EconomicCode;
    }
    public void setEconomicCode(long EconomicCode){
        this.EconomicCode = EconomicCode;
    }
    public String getOrgName(){
        return OrgName;
    }
    public void setOrgName(String OrgName){
        this.OrgName = OrgName;
    }
    public int getOrgType(){
        return OrgType;
    }
    public void setOrgType(int OrgType){
        this.OrgType = OrgType;
    }
    public int getRegisterNo(){
        return RegisterNo;
    }
    public void setRegisterNo(int RegisterNo){
        this.RegisterNo = RegisterNo;
    }
    public String getSheba(){
        return Sheba;
    }
    public void setSheba(String Sheba){
        this.Sheba = Sheba;
    }
    public Long getAddressID() {
        return AddressID;
    }

    public void setAddressID(Long AddressID) {
        this.AddressID = AddressID;
    }
    public Long getContactID() {
        return ContactID;
    }

    public void setContactID(Long ContactID) {
        this.AddressID = ContactID;
    }
    public Long getParentID() {
        return ParentID;
    }

    public void setParentID(Long ParentID) {
        this.ParentID = ParentID;
    }
    public int getCreateUserID(){
        return CreateUserID;
    }
    public void setCreateUserID(int CreateUserID){
        this.CreateUserID = CreateUserID;
    }

    public String getCreateDate(){
        return CreateDate;
    }
    public void setCreateDate(String CreateDate){
        this.CreateDate = CreateDate;
    }

    public String getCreateTime(){
        return CreateTime;
    }
    public void setCreateTime(String CreateTime){
        this.CreateTime = CreateTime;
    }

}
