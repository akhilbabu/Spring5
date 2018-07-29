package guru.springframework.spring5Webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication*/
public class Spring5WebappApplication {

	public static void main(String[] args) {
		
		
		Object ob1=new Object();
		Object ob2=new Object();
		ob1=ob2;
		System.out.println(ob2.equals(ob1
				));
		
		//System.out.println(k);
		/*SpringApplication.run(Spring5WebappApplication.class, args);*/
	}
	public static void test(int k)
	{
		
		k=1;
		
		
	}
			
}
