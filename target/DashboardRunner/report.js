$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/manageAccess.feature");
formatter.feature({
  "name": "Manage Access",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify admin can add new users",
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
formatter.write("2021-02-28 14:41:33 PASS: Successfully navigated to the url");
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
formatter.write("2021-02-28 14:41:36 PASS: Login page is displayed");
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
formatter.write("2021-02-28 14:41:38 PASS: admin@yahoo.com was entered in Enter Username input box successfully");
formatter.embedding("image/png", "embedded1.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"adminUserPassword\" in the \"Enter Password\" input box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputBox(String,String)"
});
formatter.write("2021-02-28 14:41:41 PASS: adminuser123 was entered in Enter Password input box successfully");
formatter.embedding("image/png", "embedded2.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("2021-02-28 14:41:44 PASS: Login button was successfully clicked ");
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
formatter.write("2021-02-28 14:41:48 PASS: Home page is displayed");
formatter.embedding("image/png", "embedded4.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Manage Access\" link",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAccessSteps.iClickLink(String)"
});
formatter.write("2021-02-28 14:41:52 PASS: Manage Access was successfully clicked ");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following values in the following fields",
  "rows": [
    {
      "cells": [
        "First Name",
        "Will"
      ]
    },
    {
      "cells": [
        "Last Name",
        "Smith"
      ]
    },
    {
      "cells": [
        "E-mail",
        "will.smith@gmail.com"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageAccessSteps.iEnterTheFollowingValuesInTheFollowingFields(String,String\u003e)"
});
formatter.write("2021-02-28 14:41:53 PASS: Will was entered in First Name input box successfully");
formatter.embedding("image/png", "embedded5.png", null);
formatter.write("2021-02-28 14:41:54 PASS: Smith was entered in Last Name input box successfully");
formatter.embedding("image/png", "embedded6.png", null);
formatter.write("2021-02-28 14:41:55 PASS: will.smith@gmail.com was entered in E-mail input box successfully");
formatter.embedding("image/png", "embedded7.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose \"Instructor\" from dropdown \"Role\"",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAccessSteps.iChooseFromDropdown(String,String)"
});
formatter.write("2021-02-28 14:41:57 PASS: Instructor was successfully selected from dropdown Role");
formatter.embedding("image/png", "embedded8.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose \"10\" from dropdown \"Batch\"",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAccessSteps.iChooseFromDropdown(String,String)"
});
formatter.write("2021-02-28 14:41:59 PASS: 10 was successfully selected from dropdown Batch");
formatter.embedding("image/png", "embedded9.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Add User\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("2021-02-28 14:42:01 PASS: Add User button was successfully clicked ");
formatter.embedding("image/png", "embedded10.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the following user exists in the table",
  "rows": [
    {
      "cells": [
        "First Name",
        "admin"
      ]
    },
    {
      "cells": [
        "Last Name",
        "admin"
      ]
    },
    {
      "cells": [
        "E-mail",
        "admin@yahoo.com"
      ]
    },
    {
      "cells": [
        "Role",
        "Mentor"
      ]
    },
    {
      "cells": [
        "Batch",
        "N/A"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageAccessSteps.verifyTheFollowingUserExistsInTheTable(String,String\u003e)"
});
formatter.write("2021-02-28 14:42:13 PASS: The user exists in row 3");
formatter.write("2021-02-28 14:42:13 PASS: The user exists");
formatter.embedding("image/png", "embedded11.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Action\" button of user \"will.smith@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAccessSteps.iClickButtonOfUser(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//td[contains(text(),\u0027will.smith@gmail.com\u0027)]/parent::tr//button[text()\u003d\u0027Action\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.104)\n  (Driver info: chromedriver\u003d88.0.4324.96 (68dba2d8a0b149a1d3afac56fa74648032bcf46b-refs/branch-heads/4324@{#1784}),platform\u003dWindows NT 10.0.10586 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-8IOSFHN5\u0027, ip: \u002710.0.0.159\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49745}, handlesAlerts: true, hasMetadata: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 88.0.4324.104, webStorageEnabled: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true, webdriver.remote.sessionid: 66f5e3b8acf2432cadf60759a70...}\nSession ID: 66f5e3b8acf2432cadf60759a709df6d\n*** Element info: {Using\u003dxpath, value\u003d//td[contains(text(),\u0027will.smith@gmail.com\u0027)]/parent::tr//button[text()\u003d\u0027Action\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat impls.ManageAccessImpl.clickAction(ManageAccessImpl.java:103)\r\n\tat steps.ManageAccessSteps.iClickButtonOfUser(ManageAccessSteps.java:49)\r\n\tat ✽.I click \"Action\" button of user \"will.smith@gmail.com\"(file:src/main/resources/features/manageAccess.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click \"Edit\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I edit the user with following",
  "rows": [
    {
      "cells": [
        "Email",
        "will.smith.new@gmail.com"
      ]
    },
    {
      "cells": [
        "Role",
        "Mentor"
      ]
    },
    {
      "cells": [
        "Batch",
        "N/A"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageAccessSteps.iEditTheUserWithFollowing(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Update User\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the following user exists in the table",
  "rows": [
    {
      "cells": [
        "First Name",
        "Will"
      ]
    },
    {
      "cells": [
        "Last Name",
        "Smith"
      ]
    },
    {
      "cells": [
        "E-mail",
        "will.smith.new@gmail.com"
      ]
    },
    {
      "cells": [
        "Role",
        "Mentor"
      ]
    },
    {
      "cells": [
        "Batch",
        "N/A"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageAccessSteps.verifyTheFollowingUserExistsInTheTable(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Action\" button of user \"will.smith.new@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAccessSteps.iClickButtonOfUser(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Delete\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"Delete\" button in \"User Delete Window\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iClickButtonIn(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the following user does NOT exist in the table",
  "rows": [
    {
      "cells": [
        "First Name",
        "John"
      ]
    },
    {
      "cells": [
        "Last Name",
        "Smith"
      ]
    },
    {
      "cells": [
        "E-mail",
        "john.smith@gmail.com"
      ]
    },
    {
      "cells": [
        "Role",
        "Instructor"
      ]
    },
    {
      "cells": [
        "Batch",
        "4"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageAccessSteps.verifyTheFollowingUserDoesNOTExistInTheTable(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});