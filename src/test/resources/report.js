$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AirCanada.feature");
formatter.feature({
  "line": 2,
  "name": "User book flight ticket in aircanada website",
  "description": "",
  "id": "user-book-flight-ticket-in-aircanada-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User select trip details in home page",
  "description": "",
  "id": "user-book-flight-ticket-in-aircanada-website;user-select-trip-details-in-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@homepage"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User select edition \"\u003cedition\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User select the trip option, source, destination and date \"\u003ctrip\u003e\", \"\u003csource\u003e\", \"\u003cdestination\u003e\" and \"\u003ctraveldate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User select passenger count \"\u003cadt\u003e\", \"\u003cadtcnt\u003e\", \"\u003cyth\u003e\", \"\u003cythcnt\u003e\", \"\u003cchd\u003e\", \"\u003cchdcnt\u003e\", \"\u003cinf\u003e\" and \"\u003cinfcnt\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "user-book-flight-ticket-in-aircanada-website;user-select-trip-details-in-home-page;",
  "rows": [
    {
      "cells": [
        "edition",
        "trip",
        "source",
        "destination",
        "traveldate",
        "adt",
        "adtcnt",
        "yth",
        "ythcnt",
        "chd",
        "chdcnt",
        "inf",
        "infcnt"
      ],
      "line": 15,
      "id": "user-book-flight-ticket-in-aircanada-website;user-select-trip-details-in-home-page;;1"
    },
    {
      "cells": [
        "CA-English",
        "Oneway",
        "YYY",
        "YYZ",
        "27-11-2019",
        "yes",
        "1",
        "yes",
        "1",
        "no",
        "0",
        "no",
        "0"
      ],
      "line": 16,
      "id": "user-book-flight-ticket-in-aircanada-website;user-select-trip-details-in-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16983212800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User select edition",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User verify the url and title",
  "keyword": "Given "
});
formatter.match({
  "location": "AirCanadaStep.user_verify_the_url_and_title()"
});
formatter.result({
  "duration": 436222000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User select trip details in home page",
  "description": "",
  "id": "user-book-flight-ticket-in-aircanada-website;user-select-trip-details-in-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@homepage"
    },
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User select edition \"CA-English\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User select the trip option, source, destination and date \"Oneway\", \"YYY\", \"YYZ\" and \"27-11-2019\"",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User select passenger count \"yes\", \"1\", \"yes\", \"1\", \"no\", \"0\", \"no\" and \"0\"",
  "matchedColumns": [
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CA-English",
      "offset": 21
    }
  ],
  "location": "AirCanadaStep.user_select_edition(String)"
});
formatter.result({
  "duration": 897477000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oneway",
      "offset": 59
    },
    {
      "val": "YYY",
      "offset": 69
    },
    {
      "val": "YYZ",
      "offset": 76
    },
    {
      "val": "27-11-2019",
      "offset": 86
    }
  ],
  "location": "AirCanadaStep.user_select_the_trip_option_source_destination_and_date_and(String,String,String,String)"
});
formatter.result({
  "duration": 2999900400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 36
    },
    {
      "val": "yes",
      "offset": 41
    },
    {
      "val": "1",
      "offset": 48
    },
    {
      "val": "no",
      "offset": 53
    },
    {
      "val": "0",
      "offset": 59
    },
    {
      "val": "no",
      "offset": 64
    },
    {
      "val": "0",
      "offset": 73
    }
  ],
  "location": "AirCanadaStep.user_select_passenger_count_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 438651400,
  "status": "passed"
});
formatter.match({
  "location": "AirCanadaStep.user_click_submit_button()"
});
formatter.result({
  "duration": 10887436500,
  "status": "passed"
});
formatter.after({
  "duration": 777794900,
  "status": "passed"
});
});