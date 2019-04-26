$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resourse/skeleton/login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid User Scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \u003cusername\u003e as username",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \u003cpassword\u003e as password",
  "keyword": "And "
});
formatter.step({
  "name": "user in  \u003cpage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "page"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123",
        "Home"
      ]
    },
    {
      "cells": [
        "admin",
        "Password456",
        "Admin Home"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid User Scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.match({
  "location": "LogStepDefs.the_URL_of_TestMe_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Lalitha as username",
  "keyword": "When "
});
formatter.match({
  "location": "LogStepDefs.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "LogStepDefs.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in  Home",
  "keyword": "Then "
});
formatter.match({
  "location": "LogStepDefs.user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid User Scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.match({
  "location": "LogStepDefs.the_URL_of_TestMe_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters admin as username",
  "keyword": "When "
});
formatter.match({
  "location": "LogStepDefs.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password456 as password",
  "keyword": "And "
});
formatter.match({
  "location": "LogStepDefs.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in  Admin Home",
  "keyword": "Then "
});
formatter.match({
  "location": "LogStepDefs.user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "invalid scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.match({
  "location": "LogStepDefs.the_URL_of_TestMe_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid data",
  "rows": [
    {
      "cells": [
        "abcxyz",
        "Password123"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "abcxyz"
      ]
    },
    {
      "cells": [
        "abcxyz",
        "abcxyz"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LogStepDefs.user_enters_invalid_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "rows": [
    {
      "cells": [
        "bdc"
      ]
    },
    {
      "cells": [
        "abg"
      ]
    },
    {
      "cells": [
        "ghj"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LogStepDefs.user_is_in_login_page(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});