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
public class CommentDTO {
	private int commentId;
    private int memberId;
    private int postId;
    private String content;
    private LocalDateTime commentTime;
    private boolean isDeleted;
}
