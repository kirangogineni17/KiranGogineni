$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Cucumber_Selenium/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Open Automation practice website and create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens Automation practice website",
  "keyword": "When "
});
formatter.step({
  "name": "user click on Signin",
  "keyword": "And "
});
formatter.step({
  "name": "enter email address to create account",
  "keyword": "And "
});
formatter.step({
  "name": "click on Create account button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cFirstName\u003e and \u003clastName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I can select state \u003cstate\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I can verify title",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "lastName",
        "state"
      ]
    },
    {
      "cells": [
        "Kiran",
        "Kumar",
        "Texas"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Open Automation practice website and create user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens Automation practice website",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_OpensWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Signin",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_clickSignIn()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitionsTest.LoginStepDefinition.user_clickSignIn(LoginStepDefinition.java:67)\r\n\tat ✽.user click on Signin(E:/Selenium/Cucumber_Selenium/Features/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "enter email address to create account",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.enter_EmailAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Create account button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_clickCreateAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters Kiran and Kumar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_enterDetails(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I can select state Texas",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_seletState(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I can verify title",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.verify_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});