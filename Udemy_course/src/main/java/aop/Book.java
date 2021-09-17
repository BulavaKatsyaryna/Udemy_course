package aop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Book {

    @Value("Harry Potter and the Philosopher's Stone")
    private String name;

    @Value("J. K. Rowling")
    private String author;

    @Value("1997")
    private int yearsOfPublication;
}
