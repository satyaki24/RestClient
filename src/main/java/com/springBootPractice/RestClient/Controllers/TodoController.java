package com.springBootPractice.RestClient.Controllers;

import com.springBootPractice.RestClient.Model.Todo;
import com.springBootPractice.RestClient.Services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoServices todoServices;

    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id){
        return this.todoServices.getTodo(id);
    }

    @GetMapping("/")
    public List<Todo> getAllTodo(){
        return this.todoServices.getAllTodo();
    }

    @PostMapping("/")
    public Todo createTodo(@RequestBody Todo todo){
        return this.todoServices.createTodo(todo);
    }
}
