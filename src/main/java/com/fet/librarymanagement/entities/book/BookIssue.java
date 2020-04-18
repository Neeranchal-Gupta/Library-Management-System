package com.fet.librarymanagement.entities.book;

import java.util.Date;

public class BookIssue {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;

    public static void issueBook(String barcode, String memberId) {

    }

    public static BookIssue fetchLendingDetails(String barcode) {
        return null;
    }
}


