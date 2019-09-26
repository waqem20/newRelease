package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class DashBoardPage extends BaseClass{
	
	@FindBy(css="a[id='welcome']")
	public WebElement welcome;
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

}
