package com.core.LedgerSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class LedgerSystemApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(LedgerSystemApplication.class, args);
//	}

    //Identification Details
    String systemId; // Something that the system assigns the person, sort of internal ID
    String idType; // Any government approved ID
    String idValue;

    //Customer Details
    String firstName;
    String lastName;
    String DOB;

    //Account Details
    String IBAN;
    String accountNumber;
    AccountStatus accountStatus;


    public enum AccountStatus {
        ACTIVE,
        SUSPENDED,
        CLOSED
    }

    public void setIdDetails(String systemId, String idType, String idValue){
        this.systemId = systemId;
        this.idType = idType;
        this.idValue = idValue;
    }

    public void setCustomerDetails(String firstName, String lastName, String DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public void setAccountDetails(String IBAN, String accountNumber, AccountStatus accountStatus){
        this.IBAN = IBAN;
        this.accountNumber = accountNumber;
        this.accountStatus = accountStatus;
    }

    public void printIdDetails(){
        System.out.println("Identification Details:");
        System.out.println("System ID: " + systemId);
        System.out.println("ID Type: " + idType);
        System.out.println("ID Value: " + idValue);
        System.out.println();
    }
    
    public void printCustomerDetails(){
        System.out.println("Customer Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + DOB);
        System.out.println();
    }
    
    public void printAccountDetails(){
        System.out.println("Account Details:");
        System.out.println("IBAN: " + IBAN);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Status: " + accountStatus);
        System.out.println();
    }

    public static void main(String[] args) {
        LedgerSystemApplication ledgerSystem = new LedgerSystemApplication();

        ledgerSystem.setIdDetails("00001", "CNIC", "1111111111");
        ledgerSystem.setCustomerDetails("Ali", "Panjwani", "18/05/2001");
        ledgerSystem.setAccountDetails("PK123456789", "56789", AccountStatus.ACTIVE);

        System.out.println("Printing Customer Details");
        ledgerSystem.printIdDetails();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ledgerSystem.printCustomerDetails();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        ledgerSystem.printAccountDetails();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
