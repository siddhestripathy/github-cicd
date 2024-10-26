package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to CICD";
	}
//	echo "# github-action" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/siddhestripathy/github-action.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
