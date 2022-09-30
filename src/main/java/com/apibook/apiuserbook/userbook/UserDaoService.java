package com.apibook.apiuserbook.userbook;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,1,"Adam","Golf"));
		users.add(new User(2,2,"Mahboob","Asraf"));
		users.add(new User(3,3,"Riyaz","Ahmad"));
		users.add(new User(4,4,"Nitish","kumar"));
		users.add(new User(5,5,"jagmohan","panda"));
		users.add(new User(6,6,"Sibtain","Ahmad"));
		users.add(new User(7,7,"Irshad","khan"));
		users.add(new User(8,8,"Manoj","Gum"));
		users.add(new User(9,9,"Ranjeet","kumar"));
		users.add(new User(10,10,"Mrinal","fouzdar"));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		 return users.stream().filter(predicate).findFirst().get();
	}

}
