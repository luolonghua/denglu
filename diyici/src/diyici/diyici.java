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
		System.setProperty("webdriver.chrome.driver","./lianxi/chromedriver.exe");//��·��
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";//������ַ
}
	@Test
	public void denglu() throws InterruptedException
	{
		driver.get(url);//�����¼ҳ��
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td/input")).sendKeys("hujianming");//�����û���
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");//��������
		WebElement b=driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"));
		Select s=new Select(b);
	    s.selectByIndex(2);//ѡ���¼����
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();//���ȷ����ť
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}
}
