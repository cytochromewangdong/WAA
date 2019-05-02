package edu.mum.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TestDataImpl implements DataFacade {

	private static final Database data = new Database();
 
	// Private constructor. Prevents instantiation from other classes.
	private TestDataImpl() {
		
	}

	// eager init'ed singleton...
	public final static TestDataImpl INSTANCE = new TestDataImpl();

	public String findPassword (String name ) {
 		String expectedPassword = data.getPassword(name);
		return expectedPassword;
	}
	public List<String> getAdvice(String roast) { 
		return data.getAdvice(roast);
	}
}



