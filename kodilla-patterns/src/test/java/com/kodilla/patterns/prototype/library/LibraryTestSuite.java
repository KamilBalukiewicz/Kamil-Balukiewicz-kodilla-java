package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library books = new Library("Test books");
        IntStream.iterate(1, n -> n + 1)
                .limit(8)
                .forEach(n -> books.getBooks().add(new Book("Title" + n, "Author" + n,
                        LocalDate.now().minusYears(n))));
        Book book = new Book("Brave New World", "Huxley",
                LocalDate.of(1931,1,1));
        books.getBooks().add(book);

        Library clonedLibrary = null;
        try {
            clonedLibrary = books.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = books.deepCopy();
            deepClonedLibrary.setName("Deep Cloned Library");
        } catch  (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //when
        books.getBooks().remove(book);
        //then
        System.out.println(books.getBooks() + "\n");
        System.out.println(clonedLibrary.getBooks() + "\n");
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(8, books.getBooks().size());
        Assert.assertEquals(8, clonedLibrary.getBooks().size());
        Assert.assertEquals(9, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), books.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), books.getBooks());

    }
}
