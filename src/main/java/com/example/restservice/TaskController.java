package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@GetMapping("/tasks")
	public void getAllTasks(TaskFilter filter){
		System.out.println("From TaskController. TaskFilter created : " + filter);
	}


}
