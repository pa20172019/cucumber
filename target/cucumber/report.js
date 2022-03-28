$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios login page functionality validation",
  "description": "",
  "id": "techfios-login-page-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 4832734500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User in on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechfiosStepDefinition.user_in_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1128669000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login with valid credentials",
  "description": "",
  "id": "techfios-login-page-functionality-validation;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 127667500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 75943400,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 2345210700,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 304837400,
  "status": "passed"
});
formatter.after({
  "duration": 855138600,
  "status": "passed"
});
});