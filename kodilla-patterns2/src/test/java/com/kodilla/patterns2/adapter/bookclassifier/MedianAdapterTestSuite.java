package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Book book1 = new Book("Kamil Kowalski", "Kolorowy Sen", 2000, "1234567890");
        Book book2 = new Book("Barbara Zarzewna", "Pieczony Kalafior", 2005, "1234567891");
        Book book3 = new Book("Justyna Rzadziwiłówna", "Stojąca chusteczka", 2003,"1234567892");
        Book book4 = new Book("Jan Tupający", "Tańczący zwierzyniec", 2002, "1234567893");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        MedianAdapter mediandapter = new MedianAdapter();

        //When
        int median = mediandapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2003, median);
    }
}
