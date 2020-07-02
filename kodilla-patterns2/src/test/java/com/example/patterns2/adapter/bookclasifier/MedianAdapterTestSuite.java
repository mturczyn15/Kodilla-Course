package com.example.patterns2.adapter.bookclasifier;

import com.example.patterns2.adapter.bookclasifier.librarya.Book;
import com.example.patterns2.adapter.company.SalaryAdapter;
import com.example.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Kamil Zawada", "book1", 1990, "1232345");
        Book book2 = new Book("Kamil Zawada", "book2", 1996, "12346545");
        Book book3 = new Book("Kamil Zawada", "book3", 1955, "1233445");
        Book book4 = new Book("Kamil Zawada", "book4", 1999, "1234545");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(median, 1996);
    }
}
