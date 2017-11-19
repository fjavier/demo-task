package com.fbriceno.task;

import com.fbriceno.task.entity.Task;
import com.fbriceno.task.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
	    return args -> {
	        taskService.save(new Task(1L, "SLEEP", LocalDate.now(), true));
            taskService.save(new Task(2L, "AWAKE", LocalDate.now(), false));
            taskService.save(new Task(3L, "EAT", LocalDate.now(), false));
        };
    }
}
