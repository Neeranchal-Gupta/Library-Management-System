package com.fet.librarymanagement.controller;

import com.fet.librarymanagement.entities.book.BookItem;
import com.fet.librarymanagement.entities.person.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class LibraryAdminController {

    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

    public boolean blockMember(Member member) {
        return false;
    }

    public boolean unBlockMember(Member member) {
        return false;
    }

    @RequestMapping("/removeBook/{id}")
    public String removeBookItem(Model model, @PathVariable(value = "id") Integer id) {
        bookService.removeBookById(id);
        return "redirect:/";
    }

    @RequestMapping("issueBook")
    public String issueBook(@RequestParam(name = "userId") Integer userId, @RequestParam(name = "cardId") Integer cardId, @RequestParam(name = "bidId") Integer bidId) {
        User user = userService.getUserById(userId);
        BookCard bookCard = bookCardService.getBookCard(cardId);
        bookCard.setUser(user);
        bookCardService.saveBookCard(bookCard);
        bidService.removeBid(bidId);
        return "redirect:/admin/viewBids";
    }

    @RequestMapping("searchbook")
    public String searchBook(){

        return "redirect:/admin/viewBids";
    }

    @RequestMapping("/reservebook")
    public String reserveBook(){

        return "redirect:/admin/viewBids";
    }

@RequestMapping("/registeruser") //issue library card
    public String registerMember(){
        return null;
}

    // remove book items
    //search book
    //issue book
    // reserve book

}
