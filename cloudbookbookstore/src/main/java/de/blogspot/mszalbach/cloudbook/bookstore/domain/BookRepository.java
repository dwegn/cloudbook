package de.blogspot.mszalbach.cloudbook.bookstore.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookRepository {

    private final Logger log = LoggerFactory.getLogger( this.getClass());


    @GetMapping( path = "books" )
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add( new Book( "hallo buch", "ms" ) );
        books.add( new Book( "title", "author" ) );

        log.info( "Called" );
        return books;
    }

}
