$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/dashboard.feature");
formatter.feature({
  "name": "Dashboards",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding new dashboard",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Interview Prep",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iNavigateToInterviewPrep()"
});
formatter.write("2021-02-21 14:12:05 PASS: Successfully navigated to the url");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the \"Login\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeThePage(String)"
});
formatter.write("2021-02-21 14:12:05 PASS: Login page is displayed");
formatter.embedding("image/png", "embedded0.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"admin@yahoo.com\" in the \"Enter Username\" input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputBox(String,String)"
});
formatter.write("2021-02-21 14:12:06 PASS: admin@yahoo.com was entered in Enter Username input box successfully");
formatter.embedding("image/png", "embedded1.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"adminuser123\" in the \"Enter Password\" input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputBox(String,String)"
});
formatter.write("2021-02-21 14:12:07 PASS: adminuser123 was entered in Enter Password input box successfully");
formatter.embedding("image/png", "embedded2.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Login\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("2021-02-21 14:12:11 PASS: Login button was successfully clicked ");
formatter.embedding("image/png", "embedded3.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the \"Home\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeThePage(String)"
});
formatter.write("2021-02-21 14:12:12 PASS: Home page is displayed");
formatter.embedding("image/png", "embedded4.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the following dashboards are displayed:",
  "rows": [
    {
      "cells": [
        "All Topics"
      ]
    },
    {
      "cells": [
        "Coding"
      ]
    },
    {
      "cells": [
        "Soft skills"
      ]
    },
    {
      "cells": [
        "Cucumber"
      ]
    },
    {
      "cells": [
        "Java"
      ]
    },
    {
      "cells": [
        "Jmeter"
      ]
    },
    {
      "cells": [
        "API"
      ]
    },
    {
      "cells": [
        "SQL"
      ]
    },
    {
      "cells": [
        "Github"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.iVerifyTheFollowingDashboardsAreDisplayed(String\u003e)"
});
formatter.write("2021-02-21 14:12:12 PASS: All Topics dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Coding dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Soft skills dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Cucumber dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Java dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Jmeter dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: API dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: SQL dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: Github dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:12 PASS: All the dashboards are displayed as expected: [All Topics, Coding, Soft skills, Cucumber, Java, Jmeter, API, SQL, Github]");
formatter.embedding("image/png", "embedded5.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Khali\" in the \"New dashboard\" input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputBox(String,String)"
});
formatter.write("2021-02-21 14:12:13 PASS: Khali was entered in New dashboard input box successfully");
formatter.embedding("image/png", "embedded6.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"+ Add\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("2021-02-21 14:12:16 PASS: + Add button was successfully clicked ");
formatter.embedding("image/png", "embedded7.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the following dashboards are displayed:",
  "rows": [
    {
      "cells": [
        "All Topics"
      ]
    },
    {
      "cells": [
        "Coding"
      ]
    },
    {
      "cells": [
        "Soft skills"
      ]
    },
    {
      "cells": [
        "Cucumber"
      ]
    },
    {
      "cells": [
        "Java"
      ]
    },
    {
      "cells": [
        "Jmeter"
      ]
    },
    {
      "cells": [
        "API"
      ]
    },
    {
      "cells": [
        "SQL"
      ]
    },
    {
      "cells": [
        "Github"
      ]
    },
    {
      "cells": [
        "Khali"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.iVerifyTheFollowingDashboardsAreDisplayed(String\u003e)"
});
formatter.write("2021-02-21 14:12:17 PASS: All Topics dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Coding dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Soft skills dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Cucumber dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Java dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Jmeter dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: API dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: SQL dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Github dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: Khali dashboard is displayed as expected");
formatter.write("2021-02-21 14:12:17 PASS: All the dashboards are displayed as expected: [All Topics, Coding, Soft skills, Cucumber, Java, Jmeter, API, SQL, Github, Khali]");
formatter.embedding("image/png", "embedded8.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Khali\" in the \"New dashboard\" input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputBox(String,String)"
});
formatter.write("2021-02-21 14:12:17 PASS: Khali was entered in New dashboard input box successfully");
formatter.embedding("image/png", "embedded9.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"+ Add\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("2021-02-21 14:12:21 PASS: + Add button was successfully clicked ");
formatter.embedding("image/png", "embedded10.png", null);
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});