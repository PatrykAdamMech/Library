package com.patryk.library.demo;

import java.time.LocalDate;
public class Rental {
    private Book book;
    private LocalDate returnDate;
    Rental(Book book) {
        this.book = book;
        this.returnDate = setReturnDate();
    }

    private LocalDate setReturnDate() {
        LocalDate returnDate = LocalDate.now();
        return returnDate.plusDays(14);
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
