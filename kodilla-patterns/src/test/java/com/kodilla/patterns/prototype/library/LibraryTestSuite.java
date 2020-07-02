package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Library nr 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.addBook(new Book("Book nr: " + n, "Author ", LocalDate.of(2005, 1, 21))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow cloned Library. ");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned Library. ");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.addBook(new Book("Example Book", "Author ", LocalDate.of(2012, 12, 21)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
