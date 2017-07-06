package pe.edu.upc.payday.models;

import java.util.Date;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class UserEntity {
    private UserType userType;
    private String username;
    private String password;
    private String fullname;
    private DocumentType documentType;
    private String documentNumber;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private Date memberSince;

    public UserEntity() {
    }

    public UserEntity(UserType userType, String username, String password, String fullname, DocumentType documentType, String documentNumber, String address, String emailAddress, String phoneNumber, Date memberSince) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.memberSince = memberSince;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }
}
