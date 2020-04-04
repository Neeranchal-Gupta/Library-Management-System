package com.fet.librarymanagement.payload.book;

import com.fet.librarymanagement.enumerations.BookFormat;
import com.fet.librarymanagement.enumerations.BookStatus;
import com.fet.librarymanagement.payload.location.Rack;

import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

    public boolean checkout(String memberId) {
        if(bookItem.getIsReferenceOnly()) {
            ShowError("This book is Reference only and can't be issued");
            return false;
        }
        if(!BookIssue.issueBook(this.getBarCode(), memberId)){
            return false;
        }
        this.updateBookItemStatus(BookStatus.LOANED);
        return true;
    }
}

}
