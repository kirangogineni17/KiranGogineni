Feature: Login

  Scenario Outline: Open Automation practice website and create user
  When user opens Automation practice website
   And user click on Signin
   And enter email address to create account
   And click on Create account button
   And user enters <FirstName> and <lastName>
   And I can select state <state>
   And I can verify title
  # And I can close the browser 
Examples:
   |FirstName	|lastName|state|
   |Kiran    |Kumar| Texas|