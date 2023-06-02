$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SauceDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the product purchase functionality in Sauce demo Application",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Checking the login functionality",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"\u003cpass\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On Login Button and It Navigates To The Products Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "pass"
      ],
      "line": 13,
      "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "56787"
      ],
      "line": 14,
      "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;2"
    },
    {
      "cells": [
        "xyz",
        "34569"
      ],
      "line": 15,
      "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;3"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 16,
      "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 359800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_open_the_browser()"
});
formatter.result({
  "duration": 347115400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Checking the login functionality",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"abc\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"56787\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On Login Button and It Navigates To The Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 8506398900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 177020400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "56787",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 170090200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_and_It_Navigates_To_The_Products_Page()"
});
formatter.result({
  "duration": 157381400,
  "status": "passed"
});
formatter.after({
  "duration": 321600,
  "status": "passed"
});
formatter.before({
  "duration": 173600,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_open_the_browser()"
});
formatter.result({
  "duration": 98000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Checking the login functionality",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"xyz\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"34569\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On Login Button and It Navigates To The Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 5566453200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 197619300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "34569",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 142579800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_and_It_Navigates_To_The_Products_Page()"
});
formatter.result({
  "duration": 107798400,
  "status": "passed"
});
formatter.after({
  "duration": 95700,
  "status": "passed"
});
formatter.before({
  "duration": 80100,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_open_the_browser()"
});
formatter.result({
  "duration": 113500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Checking the login functionality",
  "description": "",
  "id": "checking-the-product-purchase-functionality-in-sauce-demo-application;checking-the-login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"standard_user\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"secret_sauce\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click On Login Button and It Navigates To The Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 4004750300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 273544000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 179455000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_Login_Button_and_It_Navigates_To_The_Products_Page()"
});
formatter.result({
  "duration": 261732900,
  "status": "passed"
});
formatter.after({
  "duration": 176100,
  "status": "passed"
});
});