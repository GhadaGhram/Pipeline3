$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/jumia.feature");
formatter.feature({
  "name": "the user logs into his account, searches for a product, filters his search and adds the product to the cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Naviguer"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enter his email \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters his password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user is on home page",
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
        "password"
      ]
    },
    {
      "cells": [
        "ghadaa.ghram@gmail.com",
        "Gh11046090"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@Naviguer"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter his email ghadaa.ghram@gmail.com",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters his password Gh11046090",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verify that the user can add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Ajouter"
    }
  ]
});
formatter.step({
  "name": "user is looking for a product \u003cproduct\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "user filters his search by brand \u003cmarque\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enter lower price limit  \u003cmin\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enter upper price limit  \u003cmax\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enter click ok",
  "keyword": "And "
});
formatter.step({
  "name": "user select the product",
  "keyword": "When "
});
formatter.step({
  "name": "user add the product to the cart",
  "keyword": "And "
});
formatter.step({
  "name": "the product is on the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "user sign out",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "marque",
        "min",
        "max"
      ]
    },
    {
      "cells": [
        "ecran solaire",
        "SVR",
        "20",
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that the user can add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@Ajouter"
    }
  ]
});
formatter.step({
  "name": "user is looking for a product ecran solaire",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user filters his search by brand SVR",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter lower price limit  20",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter upper price limit  100",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter click ok",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user select the product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user add the product to the cart",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the product is on the cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user sign out",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});