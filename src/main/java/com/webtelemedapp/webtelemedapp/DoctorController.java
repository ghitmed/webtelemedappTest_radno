package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorController {

    @Controller
    public class TodoController {

        List<User> todoList = new ArrayList<>();



        @GetMapping("/todos")
        public String showTodos(Model model) {
            model.addAttribute(todoList);
            return "employee_todo_list_user.html";
        }


        @GetMapping("/addNewTodo")
        public String addNewTodo(String title) {
            todoList.add(new Todo(title));

            return "redirect:/todos";

        }

        @GetMapping("/delete")
        public String delete(String title) {
            for(Todo todo : todoList) {
                if(todo.getTitle().equals(title)) {
                    todoList.remove(todo);
                    break;
                }
            }

            return "redirect:/todos";

        }
}
