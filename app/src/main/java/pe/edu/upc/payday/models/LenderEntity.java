package pe.edu.upc.payday.models;

import java.util.Date;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class LenderEntity {
    private LenderType lenderType;
    private String name;
    private String address;
    private String contactNumber;
    private String emailAddress;
    private Date memberSince;

    public LenderEntity() {
    }

    public LenderEntity(LenderType lenderType, String name, String address, String contactNumber, String emailAddress, Date memberSince) {
        this.lenderType = lenderType;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.memberSince = memberSince;
    }

    public LenderType getLenderType() {
        return lenderType;
    }

    public void setLenderType(LenderType lenderType) {
        this.lenderType = lenderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }
}
