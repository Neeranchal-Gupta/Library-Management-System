package com.fet.librarymanagement.controller;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

public class LibraryUserController {

    @Field("Membership_Date")
    private Date dateOfMembership;
    @Field("totalBooksCheckedout")
    private int totalBooksCheckedout;
    @Field("fine")
    private double fine;


    @RequestMapping("issuebook")
    public String issueBookByUser(){
        return null;
    }

    @RequestMapping("returnbook")
    public String returnBookByUser(){
        return null;
    }

    @RequestMapping("reservebook")
    public String reserveBookByUser(){
        return null;
    }

    @RequestMapping("reissuebook")
    public String reissueBookByUser(){
        return null;
    }

    @RequestMapping("searchbook")
    public String searchBookByUser(){
        return null;
    }

    @RequestMapping("payfine")
    public String payFineByUser(){
        return null;
    }
    // Issue book
    //return book
    // reserve book
    //Search book
    //ReIssue book
    //pay fine
}
