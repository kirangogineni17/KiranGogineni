$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Cucumber_Selenium/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open Automation practice website and create user",
  "description": "",
  "keyword": "Scenario"
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
  "status": "passed"
});
});