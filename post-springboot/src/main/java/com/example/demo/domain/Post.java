package com.example.demo.domain;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post extends RepresentationModel<Post> {

    @Min(value = 1, message = "Id should be bigger than 0")
    long id;

    @NotNull(message = "title is required not null")
    @NotEmpty(message = "title is required not empty")
    @NotBlank(message = "title is required not blank")
    String title;

    @NotNull(message = "content is required not null")
    @NotEmpty(message = "content is required not empty")
    @NotBlank(message = "content is required not blank")
    String content;

    @NotNull(message = "author is required not null")
    @NotEmpty(message = "author is required not empty")
    @NotBlank(message = "author is required not blank")
    String author;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
