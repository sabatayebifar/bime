package model;
import javax.persistence.*;
/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 9/13/15
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Person")

public class Person {

    @Id
    @SequenceGenerator(name="PersonID", initialValue=1, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PersonID")
    @Column(name = "PersonID")
    private Long PersonID;
    @Column(name = "NationalID")
    private Long NationalID;
    @Column(name = "Nationality")
    private int Nationality;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Family")
    private String Family;
    @Column(name = "FatherName")
    private String FatherName;
    @Column(name = "LatinName")
    private String LatinName;
    @Column(name = "JobID")
    private int JobID;
    @Column(name = "Gender")
    private int Gender;
    @Column(name = "BirthCityID")
    private int BirthCityID;
    @Column(name = "PersianBirthDate")
    private int PersianBirthDate;
    @Column(name = "GregorianBirthDate")
    private int GregorianBirthDate;
    @Column(name = "IDNo")
    private int IDNo;
    @Column(name = "Degree")
    private int Degree;
    @Column(name = "UserID")
    private int UserID;
    @Column(name = "AddressID")
    private Long AddressID;
    @Column(name = "ContactID")
    private Long ContactID;
    @Column(name = "Sheba")
    private String Sheba;
    @Column(name = "CreateDate")
    private String CreateDate;
    @Column(name = "CreateTime")
    private String CreateTime;

    public Person(){
    }

    public Person(
            Long PersonID   ,Long NationalID   ,  int Nationality    ,   String Name  ,
            String Family,  String FatherName ,  String LatinName  ,  int JobID, int Gender
            ,int BirthCityID ,int PersianBirthDate , int GregorianBirthDate ,
            int IDNo , int Degree ,  int UserID ,long AddressID , long ContactID , String Sheba
            , String CreateDate , String CreateTime
    ){

        this.PersonID               = PersonID;
        this.NationalID             = NationalID;
        this.Nationality            = Nationality;
        this.Name                   = Name;
        this.Family                 = Family;
        this.FatherName             = FatherName;
        this.LatinName              = LatinName;
        this.JobID                  = JobID;
        this.Gender                 = Gender;
        this.BirthCityID            = BirthCityID;
        this.PersianBirthDate       = PersianBirthDate;
        this.GregorianBirthDate     = GregorianBirthDate;
        this.IDNo                   = IDNo;
        this.Degree                 = Degree;
        this.UserID                 = UserID;
        this.AddressID              = AddressID;
        this.ContactID              = ContactID;
        this.Sheba                  = Sheba;
        this.CreateDate             = CreateDate;
        this.CreateTime             = CreateTime;

    }

    public Long getPersonID() {
        return PersonID;
    }

    public void setPersonID(Long PersonID) {
        this.PersonID = PersonID;
    }

    public Long getNationalID() {
        return NationalID;
    }

    public void setNationalID(Long NationalID) {
        this.NationalID = NationalID;
    }

    public int getNationality() {
        return Nationality;
    }

    public void setNationality(int Nationality) {
        this.Nationality = Nationality;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String Family) {
        this.Family = Family;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }

    public String getLatinName() {
        return LatinName;
    }

    public void setLatinName(String LatinName) {
        this.LatinName = LatinName;
    }

    public int getJobID() {
        return JobID;
    }

    public void setJobID(int JobID) {
        this.JobID = JobID;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public int getBirthCityID() {
        return BirthCityID;
    }

    public void setBirthCityID(int BirthCityID) {
        this.BirthCityID = BirthCityID;
    }

    public int getPersianBirthDate() {
        return PersianBirthDate;
    }

    public void setPersianBirthDate(int PersianBirthDate) {
        this.PersianBirthDate = PersianBirthDate;
    }

    public int getGregorianBirthDate() {
        return GregorianBirthDate;
    }

    public void setGregorianBirthDate(int GregorianBirthDate) {
        this.GregorianBirthDate = GregorianBirthDate;
    }

    public int getIDNo() {
        return IDNo;
    }

    public void setIDNo(int IDNo) {
        this.IDNo = IDNo;
    }

    public int getDegree() {
        return Degree;
    }


    public void setDegree(int Degree) {
        this.Degree = Degree;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
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
        this.ContactID = ContactID;
    }

    public String getSheba() {
        return Sheba;
    }

    public void setSheba(String Sheba) {
        this.Sheba = Sheba;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

}
