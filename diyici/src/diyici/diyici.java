package diyici;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class diyici {

	public static WebDriver driver;
	public static String url;
	@BeforeClass
	public  void setUpBeforeClass() {
		System.setProperty("webdriver.chrome.driver","./lianxi/chromedriver.exe");//打开路径
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";//定义网址
}
	@Test
	public void denglu() throws InterruptedException
	{
		driver.get(url);//进入登录页面
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td/input")).sendKeys("hujianming");//输入用户名
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");//输入密码
		WebElement b=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
		Select s=new Select(b);
	    s.selectByIndex(2);//选择登录界面
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//点击确定按钮
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}
}
