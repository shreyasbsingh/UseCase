package com.example.UseCase.Customer;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_sequence",sequenceName = "customer_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customer_sequence")
    private long customerID;
    private String namePrefix;
    private String firstName;
    private String lastName;
    private String employerName;
    private Integer annualIncome;
    private String customerAddressLine_1;
    private String customerAddressLine_2;
    private String customerZip;
    private String customerCity;
    private String customerState;
    private String country;
    private String customerAddressType;
    private String customerPhoneType;
    private Integer customerPhoneNumber;
    private String customerEmailType;
    private  String customerEmail;

    public Customer(long customerID, String namePrefix, String firstName, String lastName, String employerName, Integer annualIncome, String customerAddressLine_1, String customerAddressLine_2, String customerZip, String customerCity, String customerState, String country, String customerAddressType, String customerPhoneType, Integer customerPhoneNumber, String customerEmailType, String customerEmail) {
        this.customerID = customerID;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employerName = employerName;
        this.annualIncome = annualIncome;
        this.customerAddressLine_1 = customerAddressLine_1;
        this.customerAddressLine_2 = customerAddressLine_2;
        this.customerZip = customerZip;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.country = country;
        this.customerAddressType = customerAddressType;
        this.customerPhoneType = customerPhoneType;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailType = customerEmailType;
        this.customerEmail = customerEmail;
    }

    public Customer(String namePrefix, String firstName, String lastName, String employerName, Integer annualIncome, String customerAddressLine_1, String customerAddressLine_2, String customerZip, String customerCity, String customerState, String country, String customerAddressType, String customerPhoneType, Integer customerPhoneNumber, String customerEmailType, String customerEmail) {
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employerName = employerName;
        this.annualIncome = annualIncome;
        this.customerAddressLine_1 = customerAddressLine_1;
        this.customerAddressLine_2 = customerAddressLine_2;
        this.customerZip = customerZip;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.country = country;
        this.customerAddressType = customerAddressType;
        this.customerPhoneType = customerPhoneType;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailType = customerEmailType;
        this.customerEmail = customerEmail;
    }

    public Customer() {
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public Integer getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Integer annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getCustomerAddressLine_1() {
        return customerAddressLine_1;
    }

    public void setCustomerAddressLine_1(String customerAddressLine_1) {
        this.customerAddressLine_1 = customerAddressLine_1;
    }

    public String getCustomerAddressLine_2() {
        return customerAddressLine_2;
    }

    public void setCustomerAddressLine_2(String customerAddressLine_2) {
        this.customerAddressLine_2 = customerAddressLine_2;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerAddressType() {
        return customerAddressType;
    }

    public void setCustomerAddressType(String customerAddressType) {
        this.customerAddressType = customerAddressType;
    }

    public String getCustomerPhoneType() {
        return customerPhoneType;
    }

    public void setCustomerPhoneType(String customerPhoneType) {
        this.customerPhoneType = customerPhoneType;
    }

    public Integer getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(Integer customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailType() {
        return customerEmailType;
    }

    public void setCustomerEmailType(String customerEmailType) {
        this.customerEmailType = customerEmailType;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", namePrefix='" + namePrefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employerName='" + employerName + '\'' +
                ", annualIncome=" + annualIncome +
                ", customerAddressLine_1='" + customerAddressLine_1 + '\'' +
                ", customerAddressLine_2='" + customerAddressLine_2 + '\'' +
                ", customerZip='" + customerZip + '\'' +
                ", customerCity='" + customerCity + '\'' +
                ", customerState='" + customerState + '\'' +
                ", country='" + country + '\'' +
                ", customerAddressType='" + customerAddressType + '\'' +
                ", customerPhoneType='" + customerPhoneType + '\'' +
                ", customerPhoneNumber=" + customerPhoneNumber +
                ", customerEmailType='" + customerEmailType + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
