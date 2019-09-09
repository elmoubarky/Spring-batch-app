package org.spring.batch.springBatchexample.batch;

import java.util.List;
import org.spring.batch.springBatchexample.model.User;
import org.spring.batch.springBatchexample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBWriter implements ItemWriter<User>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		
		System.out.println("Data Saved for Users :  "+users);
		for(int i = 0; i<users.size(); i++) {
			User u = new User();
			u = users.get(i);
			System.out.println("User number : "+i+" =  "+u);
			userRepository.save(u);
		}
	
		
	}

}
