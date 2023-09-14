package com.SecureTodo.app.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PostImageDTO {
    private int imageId;
    private int postId;
    private String imageUrl;
}
