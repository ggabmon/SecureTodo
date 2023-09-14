package com.SecureTodo.app.todo.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class todoDTO {
	private int listId;
    private int memberId;
    private String task;
    private Date dueDate;
    private String priority;
    private boolean isCompleted;
    private Date completionDate;
}
