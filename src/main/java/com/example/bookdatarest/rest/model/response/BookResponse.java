package com.example.bookdatarest.rest.model.response;

import com.example.bookdatarest.rest.model.dto.BookDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private List<BookDto> bookDtoResponseList;
}
