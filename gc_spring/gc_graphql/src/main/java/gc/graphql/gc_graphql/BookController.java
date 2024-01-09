package gc.graphql.gc_graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

/*
 * Spring for GraphQL provides an annotation-based programming model. 
 * With controller annotated methods, we can declare how to fetch the data 
 * for specific GraphQL fields.
 * By defining a method named bookById annotated with @QuerMapping, 
 * this controller declares how to fetch a Book as defined under the Query type. 
 * The query field is determined from the method name, but can also be declared on the annotation itself.
 */
@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
}