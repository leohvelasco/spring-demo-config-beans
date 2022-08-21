package decodejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Utility 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:config.beans.xml");
		Tennis tennisBean = context.getBean("TennisBean", Tennis.class);
		tennisBean.getMessage();
	}
}