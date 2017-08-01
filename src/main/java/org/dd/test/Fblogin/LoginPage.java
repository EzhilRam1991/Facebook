package org.dd.test.Fblogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class LoginPage extends Base {
static WebDriver driver;
@FindBy(id="email")
private WebElement txtUserName;
@FindBy(id="pass")
private WebElement txtUserPassword;
@FindBy(id="u_0_r")
private WebElement btnLoginButton;
@FindBy(xpath=".//*[@class='fb_logo img sp_sh983SE11WH sx_84be92']")
private WebElement imgFbLogo;
public LoginPage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver, this);
}

public WebElement getImgFbLogo() {
return imgFbLogo;
}
public void setImgFbLogo(WebElement imgFbLogo) {
this.imgFbLogo = imgFbLogo;
}
public WebElement getTxtUserName() {
return txtUserName;
}
public void setTxtUserName(WebElement txtUserName) {
this.txtUserName=txtUserName;
}
public WebElement getTxtUserPassword() {
return txtUserPassword;
}
public void setTxtUserPassword(WebElement txtUserPassword) {
this.txtUserPassword=txtUserPassword;
}
public WebElement getBtnLoginButton() {
return btnLoginButton;
}
public void setBtnLoginButton(WebElement btnLoginButton) {
this.btnLoginButton = btnLoginButton;
}
}


