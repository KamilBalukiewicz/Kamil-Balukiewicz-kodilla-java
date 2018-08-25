package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Kurt Vonnegut",
                "Slaughterhouse-Five",
                1969,
                "1"));
        books.add(new Book("Aldous Huxley",
                "Brave New World",
                1932,
                "2"));
        books.add(new Book("George Orwell",
                "Nineteen Eighty-Four",
                1949,
                "3"));
        books.add(new Book("Terry Pratchett",
                "Dodger",
                2012,
                "4"));
        books.add(new Book("J.R.R. Tolkien",
                "The Hobbit",
                1937,
                "5"));
        books.add(new Book("Bernard Cornwell",
                "The Last Kingdom",
                2004,
                "6"));
        books.add(new Book("Marion Zimmer Bradley",
                "The Mists of Avalon",
                1983,
                "7"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        System.out.println(median);
        assertEquals(median, 1969, 0);
    }
}