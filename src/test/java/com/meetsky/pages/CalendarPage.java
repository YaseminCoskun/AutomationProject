package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {


    public CalendarPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id = "app-dashboard")
    public WebElement dashboard;


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]")
    public WebElement calendarButton;


    @FindBy(xpath = "//div[@class='action-item']")
    public WebElement threeDotsButton;

    @FindBy(xpath = "//ul[starts-with(@id, 'menu')]/li[1]/button")
    public WebElement dayButton;


    @FindBy(id = "app-content-vue")
    public WebElement calendarDailyView;

    @FindBy(xpath = "//ul[starts-with(@id, 'menu')]/li[2]/button")
    public WebElement weekButton;

    @FindBy(id = "app-content-vue")
    public WebElement calendarWeeklyView;

    @FindBy(xpath = "//ul[starts-with(@id, 'menu')]/li[3]/button")
    public WebElement monthButton;


    @FindBy(id = "app-content-vue")
    //@FindBy(xpath="//*[@id=\"app-content-vue\"]/div")
    public WebElement calendarMonthlyView;
    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/div[1]/li[1]/a/span")
    public WebElement personalButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/button[1]")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "//div[@class='property-title-time-picker']/div/div[1]/div/input")
    public WebElement inputFromDateAndTime;

    @FindBy(xpath = "//div[@class='property-title-time-picker']/div/div[2]/div/input")
    public WebElement inputToDateAndTime;


    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[2]")
    public WebElement saveButton;


    @FindBy(xpath = "//*[@id=\"menu-bvljo\"]/li[3]")
    public WebElement getMonthButton;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[5]/td[5]/div/div[2]/div[1]/a/div[1]")
    public WebElement getEvent;

    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div")
    public WebElement actionButton;

    @FindBy(xpath = "//div[.='Demo meeting']")
    public WebElement savedEvent;


    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div/div/div/div/div")
    public WebElement threeDots;


    @FindBy(xpath = "//ul[starts-with(@id, 'menu')]/li[2]/button")
    public WebElement deleteButton;


}


