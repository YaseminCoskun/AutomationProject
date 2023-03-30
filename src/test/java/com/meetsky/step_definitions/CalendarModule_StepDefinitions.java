package com.meetsky.step_definitions;

import com.meetsky.pages.CalendarPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.CONTROL;

public class CalendarModule_StepDefinitions extends CalendarPage{

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        CalendarPage calendarPage = new CalendarPage();

        @Given("user is on the login page")
        public void user_is_on_the_login_page () {

            Driver.getDriver().get("https://qa.meetsky.net/index.php/login");

        }

        @When("user enter with valid credentials")
        public void user_enter_with_valid_credentials () {

                calendarPage.usernameInput.sendKeys("Employee81");
                calendarPage.passwordInput.sendKeys("Employee123");

            //calendarPage.usernameInput.sendKeys(ConfigurationReader.getProperty("user"));
            //calendarPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
            calendarPage.loginButton.click();


        }

        @When("user is on the dashboard page")
        public void user_is_on_the_dashboard_page () {
                //BrowserUtils.waitForVisibility(calendarPage.calendarModule,5);
                Assert.assertTrue(calendarPage.dashboard.isDisplayed());
                BrowserUtils.waitFor(2);

        }
        @When("the user click on Calendar Module")
        public void the_user_click_on_calendar_module () {
                calendarPage.calendarButton.click();
                BrowserUtils.sleep(2);
        }
        @When("the user clicks three dot icon")
        public void the_user_clicks_three_dot_icon () {

                calendarPage.threeDotsButton.click();
                BrowserUtils.sleep(2);
                //BrowserUtils.clickWithJS(calendarPage.threeDotsButton);
                //BrowserUtils.waitFor(2);
        }
       /* @When("user see options on the dropdown")
        public void user_see_options_on_the_dropdown () {

                //calendarPage.threeDotsButton.click();
                BrowserUtils.sleep(2);

               /*public static void clickWithJS(WebElement threeDotsButton) {
                        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", threeDotsButton);
                        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", threeDotsButton);
                }

                */


                //calendarPage.threeDotsButton.click();
                //calendarPage.clickWithJS(calendarPage.threeDotsButton);

               // WebElement dropdown= driver.findElement(By.id("dropdown"));
                //Select select= new Select(dropdown);
                //select.selectByIndex(0);
                //dropdown.selectByVisibleText("Day");




        @When("the user select on the {string} option")
        public void the_user_select_on_the_option (String string){

                BrowserUtils.waitFor(2);

                String dayButton = calendarPage.dayButton.getText();
                //calendarPage.dayButton.sendKeys(string);
                calendarPage.dayButton.click();



        }
        @Then("the user should display the Daily Calender view")
        public void the_user_should_display_the_daily_calender_view () {

              BrowserUtils.waitFor(2);
              Assert.assertTrue(calendarPage.calendarDailyView.isDisplayed());


        }
        @When("the user click three dot icon")
        public void the_user_click_three_dot_icon () {

                calendarPage.threeDotsButton.click();
                //BrowserUtils.sleep(2);

        }
        @And("the user select on the Week option")
        public void theUserSelectOnTheWeekOption() {

                BrowserUtils.waitFor(5);
                calendarPage.weekButton.click();
                BrowserUtils.waitFor(5);
        }
        @Then("the user should display Weekly Calender view")
        public void the_user_should_display_weekly_calender_view () {

                Assert.assertTrue(calendarPage.calendarWeeklyView.isDisplayed());
                BrowserUtils.waitFor(2);


        }
        @When("user clicks three dot icon")
        public void user_clicks_three_dot_icon () {

                calendarPage.threeDotsButton.click();

        }

        @And("user select on the Month option")
        public void userSelectOnTheMonthOption() {

                BrowserUtils.waitFor(2);
                calendarPage.monthButton.click();
                BrowserUtils.waitFor(10);
        }
        @Then("user should display Monthly Calender view")
        public void user_should_display_monthly_calender_view () {

                Assert.assertTrue(calendarPage.calendarMonthlyView.isDisplayed());
        }

        @And("user clicks Personal option")
        public void userClicksPersonalOption() {
                calendarPage.personalButton.click();
                BrowserUtils.waitFor(2);
        }
        @When("user click on the +New event button")
        public void user_click_on_the_new_event_button () {

                calendarPage.newEventButton.click();


        }
        @When("user can enter event title")
        public void user_can_enter_event_title () {

                BrowserUtils.waitFor(7);
                calendarPage.eventTitle.sendKeys("Demo meeting");
        }


        @When("user enter start a date and a time of the event")
        public void userEnterStartADateAndATimeOfTheEvent() {

               // BrowserUtils.waitForVisibility(CalendarPage.localDateAndTime,3);
               // Assert.assertTrue(CalendarPage.localDateAndTime.isDisplayed());

                inputFromDateAndTime.sendKeys(Keys.chord(CONTROL,"a")+Keys.CLEAR);
                BrowserUtils.waitFor(5);
                calendarPage.inputFromDateAndTime.sendKeys("from 03/31/2023 at 5:00 PM");
                BrowserUtils.waitFor(5);

//                BrowserUtils.clickWithJS(fromButton);
//                BrowserUtils.clickWithJS(selectDate);
        }
        @And("user enter end a date and a time of the event")
        public void userEnterEndADateAndATimeOfTheEvent() {

                inputToDateAndTime.sendKeys(Keys.chord(CONTROL,"a")+Keys.CLEAR);
                BrowserUtils.waitFor(5);
                calendarPage.inputToDateAndTime.sendKeys("to 03/31/2023 at 7:00 PM");
                BrowserUtils.waitFor(5);

                calendarPage.eventTitle.click();

        }

        @When("the user click on the save button")
        public void the_user_click_on_the_save_button () {

                BrowserUtils.waitFor(5);
                calendarPage.saveButton.click();
                BrowserUtils.waitFor(5);
        }
        @When("user create a new event successfully")
        public void user_create_a_new_event_successfully () {


        }
        @Then("The user should see the new event created in the Monthly Calendar view")
        public void the_user_should_see_the_new_event_created_in_the_monthly_calendar_view () {

                calendarPage.personalButton.click();
                BrowserUtils.waitFor(3);
                calendarPage.actionButton.click();
                BrowserUtils.waitFor(3);
                calendarPage.monthButton.click();
                BrowserUtils.waitFor(3);

                Assert.assertTrue(calendarPage.calendarMonthlyView.isDisplayed());




        }
        @When("user clicks the three dot icon")
        public void user_clicks_the_three_dot_icon () {

                calendarPage.threeDotsButton.click();
                BrowserUtils.waitFor(3);



        }
        @When("user select on the {string} option")
        public void user_select_on_the_option (String string){

                calendarPage.personalButton.click();
                BrowserUtils.waitFor(3);


        }
        @When("user click on the saved event")
        public void user_click_on_the_saved_event () {

                calendarPage.savedEvent.click();
                BrowserUtils.waitFor(3);

        }
       // @When("user see the saved event on the pop up page")
        //public void user_see_the_saved_event_on_the_pop_up_page () {}

        @And("user click more opion button on the pop up page")
        public void userClickMoreOpionButtonOnThePopUpPage() {

                calendarPage.moreButton.click();
                BrowserUtils.waitFor(3);
        }

        @When("user click on the three dot icon top on the left")
        public void user_click_on_the_three_dot_icon_top_on_the_left () {

                calendarPage.threeDots.click();

                BrowserUtils.waitFor(3);

        }
        @When("user should view more options on the dropdown")
        public void user_should_view_more_options_on_the_dropdown () {

        }
        @When("user select on the delete option")
        public void user_select_on_the_delete_option () {

        }
        @Then("user delete the event successfully")
        public void user_delete_the_event_successfully () {


    }



}