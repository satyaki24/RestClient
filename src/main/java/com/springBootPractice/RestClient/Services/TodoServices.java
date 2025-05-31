package com.springBootPractice.RestClient.Services;

import com.springBootPractice.RestClient.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TodoServices {
    @Autowired
    private RestClient restClient;

    public Todo getTodo(int id){
        Todo body=restClient.get()
                .uri("/todos/{id}",id)
                .retrieve()
                .body(Todo.class);

        return body;
    }

    public List<Todo> getAllTodo(){
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }

    public Todo createTodo(Todo todo){
        return restClient.post()
                .uri("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }
}
