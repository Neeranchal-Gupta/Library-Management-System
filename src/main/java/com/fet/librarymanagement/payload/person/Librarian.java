package com.fet.librarymanagement.payload.person;

import com.fet.librarymanagement.payload.book.BookItem;
import com.fet.librarymanagement.payload.account.Account;

public class Librarian extends Account {

    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

    public boolean blockMember(Member member) {
        return false;
    }

    public boolean unBlockMember(Member member) {
        return false;
    }

}
