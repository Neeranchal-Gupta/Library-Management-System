package com.fet.librarymanagement.entities.account;

import com.fet.librarymanagement.enumerations.AccountStatus;
import com.fet.librarymanagement.entities.person.Person;

//how to relate with DB as we are extending the Account
public class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

}
