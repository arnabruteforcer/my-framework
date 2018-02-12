package com.arnab.framework.test.stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class stepDefs {


    WebDriver driver = new SafariDriver();

  @Given("The safari browser is launched.")
    public void launch_safari_browser() {
      System.out.print("Launching Safari Browser");
    driver.get("http://www.google.co.in");

  }

  @Then("The user types wipro in the search box.")
  public void type_in_search_box() {
      driver.findElement(By.name("q")).sendKeys("power");
      System.out.println("entering the values");


  }



}
