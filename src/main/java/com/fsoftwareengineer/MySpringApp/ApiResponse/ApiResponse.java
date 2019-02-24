package com.fsoftwareengineer.MySpringApp.ApiResponse;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public abstract class ApiResponse<T> {
    private T data;
    private List<String> errors;
}
