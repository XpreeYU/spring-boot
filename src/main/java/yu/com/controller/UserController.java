package yu.com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/{id}")  
	public User view(@PathVariable("id") String id){
		User user = new User();
		user.setId(id);
		user.setName("yujiasnong");
		
		return user;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  SpringApplication.run(UserController.class,args);
		//System.out.println("sss");
	}
	
}