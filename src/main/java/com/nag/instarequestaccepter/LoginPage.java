package com.nag.instarequestaccepter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;




public class LoginPage {

	private WebDriver driver = new ChromeDriver();
	private String exeline = "loginpage";
	
	
	public LoginPage()
	{
		
		stream();
	}
	
	private void stream()
	{
		driver.navigate().to("https://www.instagram.com/");

		
		while (true){
			
			try {
				
				switch (exeline) {
				
				case "loginpage":
					
					//code for login page
					loginpage();
					
					exeline = "homepage";
					
				case "homepage":
					
					//code for home page
					homepage();
					exeline = "clicknotf";
					
					
				case "checkreq":
					
					//click accept request
					requestChecker();					
					
			
				}
				
				
			} 
			catch (Exception e) 
			{
				System.out.println("error occured "+ e);
				
			}
		
		}
		
		}
	
	//login page
	private void loginpage()
	{
		//login
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[2]/div/label/input"))
		.sendKeys("urs_lovely_nag");
		
		//password
		driver.findElement(
				By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[3]/div/label/input"))
				.sendKeys(",k/n?%2A3%mW=Kd");
		
		//submit
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[4]/button/div")).click();
		
		exeline = "homepage";
	}
	
	//home page
	private void homepage()
	{
		
		//turn off the notification
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[2]")).click();
		
		
		
	}
	
	
	
	private void requestChecker()
	{
	
		//click on the heart button for request checking 
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[4]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//check for the request 
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[3]/div")).click();
		
		
		//accepter
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div[3]/div/div[1]/button")).click();
		
		exeline = "checkreq";
	
	
	}
	
	
	
}
