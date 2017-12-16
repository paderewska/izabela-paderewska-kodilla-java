package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 0; n < booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test

    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf0Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Tadeusz", "Gwiazdkowy", "80122406622");
        List<Book> user1Books = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(user1Books);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, theListOfBooks.size());
    }
    @Test
    public void testListBooksInHandsOf1Book(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Tadeusz", "Gwiazdkowy", "80122406622");
        List<Book> user1Books = new ArrayList<Book>();
        Book book1 = new Book("Pierwsza", "Autor1", 2016);
        user1Books.add(book1);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(user1Books);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(1, theListOfBooks.size());
    }
    @Test
    public void testListBooksInHandsOf5Books(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Tadeusz", "Gwiazdkowy", "80122406622");
        List<Book> user1Books = new ArrayList<Book>();
        Book book1 = new Book("Pierwsza", "Autor1", 2016);
        Book book2 = new Book("Druga", "Autor2", 2010);
        Book book3 = new Book("Trzecia", "Autor3", 2009);
        Book book4 = new Book("Czwarta", "Autor4", 2015);
        Book book5 = new Book("Piata", "Autor5", 2013);
        user1Books.add(book1);
        user1Books.add(book2);
        user1Books.add(book3);
        user1Books.add(book4);
        user1Books.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(user1Books);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(5, theListOfBooks.size());
    }
}
