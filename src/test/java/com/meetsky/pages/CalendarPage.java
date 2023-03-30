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


    //@FindBy(xpath="//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button/span")
   // @FindBy(xpath="//*[@id=\"menu-bvljo\"]/li[2]")
   // @FindBy(xpath="//*[@id=\"menu-bvljo\"]/li[2]/button")
   @FindBy(xpath="//div[@id='popover_lfxfmqplgk']/div/div/div/div/ul/li[2]/button\n")
    public WebElement weekButton;

    @FindBy(id="app-content-vue")
    public WebElement calendarWeeklyView;

    //@FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button/span\n")
    //@FindBy(xpath="//*[@id=\"menu-bvljo\"]/li[3]/button")
    @FindBy(xpath="/div[@id='popover_lfxfmqplgk']/div/div/div/div/ul/li[3]/button")
    public WebElement monthButton;


    @FindBy(id="app-content-vue")
    //@FindBy(xpath="//*[@id=\"app-content-vue\"]/div")
    public WebElement calendarMonthlyView;
    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/ul/div[1]/li[1]/a/span")
    public WebElement personalButton;

    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/header/div[2]/button[1]")
    public WebElement newEventButton;


   // @FindBy(xpath = "//div[@class='property-title__input']")

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;


  // @FindBy (xpath= "//input[@placeholder='Pick a date and a time']")
    @FindBy(xpath="//div[@class='property-title-time-picker']/div/div[1]/div/input")
    public WebElement inputFromDateAndTime;

    //*[@id="popover_gbeno8f329"]/div/div[1]/div[1]/div[4]

   // @FindBy (xpath= "//div[@class='property-title-time-picker']/div/div[2]")
    @FindBy(xpath="//div[@class='property-title-time-picker']/div/div[2]/div/input")
    public WebElement inputToDateAndTime;


   // @FindBy(xpath="//*[@id=\"popover_0l1isgd5bv\"]/div/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/button[2]")
    //public WebElement okButton;

    //div[@class='property-title-time-picker']/div/div[2]

    //*[@id="popover_81pwjbrqa9"]/div/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/button

    //@FindBy(xpath="//*[@id=\"popover_pjorue1k2g\"]/div/div[1]/div[1]/div[7]/button[2]")

   // @FindBy(xpath="//*[@id=\"popover_0l1isgd5bv\"]/div/div[1]/div[1]/div[7]/button[2]")
   // @FindBy(xpath="//li[@class='event-popover__buttons']//button//span[2]")

    @FindBy(xpath="//div[@class='event-popover__buttons']/button[2]")
    public WebElement saveButton;

    //@FindBy(xpath = "//button[contains(text(), 'Copy to')]\n")


    @FindBy(name = "date")
    public WebElement fromButton;
    @FindBy(xpath = "//*[@id=\"popover_cx2y5rdu6x\"]/div/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/ul/li[3]")
    public WebElement selectDate;

    //*[@id="popover_0ukk6z0sfe"]/div/div[1]/div[1]/div[7]

    //*[@id="popover_0ukk6z0sfe"]/div/div[1]/div[1]/div[7]/button[2]

//*[@id="popover_33pwsf6701"]/div/div[1]/div[1]/div[7]/button[2]

    //*[@id="popover_33pwsf6701"]/div/div[1]/div[1]/div[7]/button[2]

    @FindBy(xpath="//*[@id=\"menu-bvljo\"]/li[3]")
    public WebElement getMonthButton;

//*[@id="app-navigation-vue"]/header/div[2]/div

    @FindBy(xpath="//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[5]/td[5]/div/div[2]/div[1]/a/div[1]")
    public WebElement getEvent;


    @FindBy(xpath="//*[@id=\"popover_lopzicbt9p\"]/div/div[1]/div[1]/div[7]/button[1]")
    public WebElement moreButton;


    @FindBy(xpath="//*[@id=\"app-navigation-vue\"]/header/div[2]/div")
    public WebElement actionButton;


    @FindBy(xpath="//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[5]/td[6]/div/div[2]/div[1]/a/div[3]")
    public WebElement savedEvent;

   // @FindBy(xpath="//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[5]/td[6]/div/div[2]/div[1]/a/div[3]")

    @FindBy(xpath="//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div/div/div/div/div")
    public WebElement threeDots;

}
