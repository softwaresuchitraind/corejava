package com.sukla;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController
{
	@PostMapping("/User")
	public String saveUser(@RequestBody User p)
	{
		//logic to persist
		System.out.println(p);
		return "User Saved";
	}
	@GetMapping("/User/{pid}")
	public User getUser(@PathVariable Integer pid)
	{
		User p = null;
		if(pid==100)
		{
			 p = new User(101,"Mouse",500.0);
		}
		else if(pid ==101)
		{
			 p = new User(101,"HD",3500.00);
		}
		return p;
	}
	@GetMapping("/Users")
	public List<User> getUsers()
	{
		User p1 = new User(100,"Mouse",500.0);
		User p2 = new User(100,"HD",3500.00);
		List<User> Users = Arrays.asList(p1,p2);
		return Users;
	}
}
