package com.sentenial.rest.client.api.directdebit.dto;

public enum PaymentStatus {

    READY_FOR_EXPORT,
    EXPORTING,
    REVOKED,
    EXPORTED,
    ACCEPTED,
    REVERSED,
    REFUSED,
    REJECTED,
    RETURNED,
    REFUNDED,
    CANCELLED,
    PENDING,
    INVALID,
    REPRESENTED,
    RECALLED;

}