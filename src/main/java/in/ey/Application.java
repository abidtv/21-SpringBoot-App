package in.ey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
		//changes for HIS-134
		run.close();
		int i=10;
	}
	//HIS-200 Related changes
	public void doProcess(){
		//logic goes here
	
	}
}
