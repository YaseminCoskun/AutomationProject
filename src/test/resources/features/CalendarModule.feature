Feature: Calendar Module

  Background:
    Given user is on the login page
    When user enter with valid credentials
    And user is on the dashboard page


  Scenario: Daily calender view
    When the user click on Calendar Module
    And the user clicks three dot icon
    When the user select on the "Day" option
    Then the user should display the Daily Calender view

@wip
  Scenario: Weekly calender view
    When the user click on Calendar Module
    And the user click three dot icon
    And the user select on the Week option
    Then the user should display Weekly Calender view


    Scenario: Monthly calender view
      When the user click on Calendar Module
      And user clicks three dot icon
      And user select on the Month option
      Then user should display Monthly Calender view



      Scenario: Displayed create a new event under the Calendar module and
      see it on the related day through the Monthly Calendar view
        When the user click on Calendar Module
        And user clicks Personal option
        And user click on the +New event button
        And user can enter event title
        When user enter start a date and a time of the event
        And user enter end a date and a time of the event
        When the user click on the save button
        And user create a new event successfully
        Then The user should see the new event created in the Monthly Calendar view



        Scenario: Delete any event through the Monthly Calendar view
        by clicking on the event and then using “more” option
          When the user click on Calendar Module
          And user clicks Personal option
          And user clicks the three dot icon
          And user select on the Month option
          When user click on the saved event
          And user click more opion button on the pop up page
          And user click on the three dot icon top on the left
          And user should view more options on the dropdown
          And user select on the delete option
          Then user delete the event successfully
