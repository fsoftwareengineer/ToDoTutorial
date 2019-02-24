package com.fsoftwareengineer.MySpringApp.ToDoItem;

import com.fsoftwareengineer.MySpringApp.ApiResponse.ApiResponse;
import lombok.Builder;
import java.util.List;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        this.setData(toDoItem);
        this.setErrors(errors);
    }
}