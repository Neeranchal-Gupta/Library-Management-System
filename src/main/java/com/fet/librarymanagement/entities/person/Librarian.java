package com.fet.librarymanagement.entities.person;

import com.fet.librarymanagement.entities.book.BookItem;
import com.fet.librarymanagement.entities.account.Account;
import org.springframework.data.mongodb.core.mapping.Document;


//need to extend person or we have to add as a obejct or extend account is better
@Document(collection = "library_admin")
public class Librarian extends Account{




}
