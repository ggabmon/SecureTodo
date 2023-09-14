package com.SecureTodo.app.board.dto;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PostDTO {
	private int postId;
    private int memberId;
    private String title;
    private String content;
    private LocalDateTime postTime;
    private String category;
    private boolean isDeleted;
}
