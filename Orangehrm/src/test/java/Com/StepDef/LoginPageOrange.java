package Com.StepDef;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrange {
WebDriver driver;

@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
private WebElement username;


public WebElement getUsername() {
	return username;
}

public void setUsername(WebElement username) {
	this.username = username;
}

@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
private WebElement password;


public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

@FindBy(how = How.XPATH, using = "//*[@name='Submit']")
private WebElement signInBtn;


public WebElement getSignInBtn() {
	return signInBtn;
}

public void setSignInBtn(WebElement signInBtn) {
	this.signInBtn = signInBtn;
}

@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
private WebElement LogOutBtn;


public WebElement getLogOutBtn() {
	return LogOutBtn;
}

public void setLogOutBtn(WebElement logOutBtn) {
	LogOutBtn = logOutBtn;
}




}

