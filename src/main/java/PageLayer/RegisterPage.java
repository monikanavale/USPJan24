package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	
	//Create OR  with help of @FindBy annotations
	
	@FindBy(name="givenName")
	private WebElement GivenName ;
	
	@FindBy(name="sn")
	private WebElement LastName ;
	
	@FindBy(name="gender")
	private WebElement Gender ;
	
	@FindBy(name="mail")
	private WebElement email ;
	
	@FindBy(name="password1")
	private WebElement Pass ;
	
	@FindBy(name="password2")
	private WebElement Pass2 ;
	
	@FindBy(name="o")
	private WebElement Company ;
	
	@FindBy(name="title")
	private WebElement JobTitle ;
	
	@FindBy(name="postalAddress")
	private WebElement Address ;
	
	@FindBy(name="l")
	private WebElement City ;
	
	@FindBy(name="st")
	private WebElement State ;
	
	@FindBy(name="ct")
	private  WebElement Country ;
	
	@FindBy(name="postalCode")
	private WebElement Pincode ;
	
	@FindBy(name="regularPhone")
	private WebElement Phone;
	
	@FindBy(name="rl")
	private WebElement Role;
	
	@FindBy(name="industry")
	private WebElement Industry;
	
	
	@FindBy(name="lc")
	private WebElement SKey;
	
	@FindBy(name="optoutCheckbox")
	private WebElement CheckBox;
	

	//Initializa OR with PageFactory.initElements()
	
	public RegisterPage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	// create associated method for OR
	
	public void createAccount(String Name, String lname,String gender, String Email, String pass ,String pass2, String company,String job,
			         String add, String city, String state,String country,String pin,String phone,String role,
			            String industry,String skey)
	{
		GivenName.sendKeys(Name);
		LastName.sendKeys(lname);
		
	Select sel = new Select(Gender);
	sel.selectByVisibleText(gender);
		
	email.sendKeys(Email);
	Pass.sendKeys(pass);
	Pass2.sendKeys(pass2);
	Company.sendKeys(company);
	JobTitle.sendKeys(job);
	Address.sendKeys(add);
	City.sendKeys(city);
	State.sendKeys(state);
	
	Select sel1 = new Select( Country);
	sel1.selectByVisibleText(country);
	
	Pincode.sendKeys(pin);
	Phone.sendKeys(phone);
	
	Select sel2 = new Select(Role);
	sel2.selectByVisibleText(role);
	
	Select sel3 = new Select(Industry);
	sel3.selectByVisibleText(industry);
	
	SKey.sendKeys(skey);
	
	CheckBox.click();
	
	
	
	
	
	
	
		
	}
	
	
	
}



