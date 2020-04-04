package com.fet.librarymanagement.payload.account;

import com.fet.librarymanagement.enumerations.AccountStatus;
import com.fet.librarymanagement.payload.person.Person;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

}
