package org.spring.batch.springBatchexample.batch;

import java.util.HashMap;
import java.util.Map;

import org.spring.batch.springBatchexample.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User>{

	private static final  Map<String, String> DEPT_NAMES = new HashMap<>(); 
	
	public Processor() {
		DEPT_NAMES.put("001", "Technology");
		DEPT_NAMES.put("002", "Java");
		DEPT_NAMES.put("003", "Espagnol");
		DEPT_NAMES.put("004", "Chimie");
		DEPT_NAMES.put("005", "French");
		DEPT_NAMES.put("006", "English");
		DEPT_NAMES.put("007", "Foot");
		DEPT_NAMES.put("008", "Medical");
		DEPT_NAMES.put("009", "Physical");
		DEPT_NAMES.put("010", "Mathematical");
	}
	
	@Override
	public User process(User user) throws Exception {
		String deptCode  =user.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		user.setDept(dept);
		System.out.println(String.format("Convert from [%s] to [%s]", deptCode, dept));
		return user;
	}

}
