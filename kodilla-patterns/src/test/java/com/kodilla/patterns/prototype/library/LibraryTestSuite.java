package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka pierwsza");
        Set<Book> theList = library.getBooks();

        Book book1 = new Book("Tytul 1", "Author 1", LocalDate.of(2015, 4, 29));
        Book book2 = new Book("Tytul 2", "Author 2", LocalDate.of(2001, 10, 1));
        Book book3 = new Book("Tytul 3", "Author 3", LocalDate.of(1999, 5, 14));

        theList.add(book1);
        theList.add(book2);
        theList.add(book3);

        Library clonedLbrary = null;
        try {
            clonedLbrary = library.shallowCopy();
            clonedLbrary.setName("Biblioteka druga");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka trzecia");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book book4 = new Book("Tytul 4", "Author 4", LocalDate.of(1956, 12, 10));
        theList.add(book4);

        //Then
        Assert.assertEquals(4, theList.size());
        Assert.assertEquals(4, clonedLbrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(theList, clonedLbrary.getBooks());
        Assert.assertNotEquals(clonedLbrary.getBooks(), deepClonedLibrary.getBooks());
    }
}