$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/Login.feature");
formatter.feature({
  "name": "Check Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginTest.open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"acurus3\" and \"acurus\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginTest.enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Role",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTest.select_Role()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on sign on button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginTest.click_on_sign_on_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});