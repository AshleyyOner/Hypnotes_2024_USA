@UI @Appointment

  Feature: Continue Appointment
    Background:
      Given user goes to the homepage
      And User clicks on the login button
      Then User enters valid email and password
      And user clicks on the schedule an appointment button

      Scenario:
        Given User clicks on Next button
        Then User scroll down the page
        And User clicks the boxes
        And User clicks Submit button
        Then User assert the green ikon