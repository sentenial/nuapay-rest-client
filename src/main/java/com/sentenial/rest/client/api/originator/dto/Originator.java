package com.sentenial.rest.client.api.originator.dto;

public class Originator {
    private OriginatorDetails originatorDetails;
    private Address address;
    private PrimaryContact primaryContact;

    public OriginatorDetails getOriginatorDetails() {
        return originatorDetails;
    }

    public void setOriginatorDetails(OriginatorDetails originatorDetails) {
        this.originatorDetails = originatorDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PrimaryContact getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(PrimaryContact primaryContact) {
        this.primaryContact = primaryContact;
    }

}
