package org.prgrms.voucherapp.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WrongInputException extends RuntimeException {

    private String message;

    @Override
    public String toString() {
        return message;
    }
}
