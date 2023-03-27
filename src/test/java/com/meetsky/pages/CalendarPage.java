package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {


    public CalendarPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id="app-dashboard")
    public WebElement dashboard;


   @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]")
    public WebElement calendarButton;


   @FindBy(xpath = "//div[@class='action-item']")
   public WebElement threeDotsButton;

   //@FindBy(xpath = "//span[contains(@class,action-button__text)] [contains(text(),'Day')]")
    //public WebElement dayButton;

    @FindBy(xpath = "//li[@class='action active']//button//span[1]")
    public WebElement dayButton;


    @FindBy(id="app-content-vue")
    public WebElement calendarDailyView;

   //@FindBy(xpath = "//li[@class='action active']//button//span[2]")
   // @FindBy(xpath="//*[@id=\"menu-xfjds\"]/li[2]/button/span[2]")

    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button/span")
    public WebElement weekButton;

    @FindBy(id="app-content-vue")
    public WebElement calendarWeeklyView;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button/span\n")
    public WebElement monthButton;



    @FindBy(id="app-content-vue")
    public WebElement calendarMonthlyView;


    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/ul/div[1]/li[1]/a/span")
    public WebElement personalButton;

    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/header/div[2]/button[1]")
    public WebElement newEventButton;


   // @FindBy(xpath = "//div[@class='property-title__input']")

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;


   // @FindBy (xpath="//*[@id=\"popover_81pwjbrqa9\"]/div/div[1]/div[1]/div[4]/div[1]")

   @FindBy (xpath= "//input[@placeholder='Pick a date and a time']")
    public WebElement localDateAndTime;

    //*[@id="popover_81pwjbrqa9"]/div/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/button

    @FindBy(xpath="//*[@id=\"popover_pjorue1k2g\"]/div/div[1]/div[1]/div[7]/button[2]")
    public WebElement saveButton;

    @FindBy(name = "date")
    public WebElement fromButton;
    @FindBy(xpath = "//*[@id=\"popover_cx2y5rdu6x\"]/div/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/ul/li[3]")
    public WebElement selectDate;

    //*[@id="popover_0ukk6z0sfe"]/div/div[1]/div[1]/div[7]

    //*[@id="popover_0ukk6z0sfe"]/div/div[1]/div[1]/div[7]/button[2]

//*[@id="popover_33pwsf6701"]/div/div[1]/div[1]/div[7]/button[2]

    //*[@id="popover_33pwsf6701"]/div/div[1]/div[1]/div[7]/button[2]


}
