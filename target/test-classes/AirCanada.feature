@tag
Feature: User book flight ticket in aircanada website

  Background: User select edition
    Given User verify the url and title

  @homepage
  Scenario Outline: User select trip details in home page
    Given User select edition "<edition>"
    And User select the trip option, source, destination and date "<trip>", "<source>", "<destination>" and "<traveldate>"
    When User select passenger count "<adt>", "<adtcnt>", "<yth>", "<ythcnt>", "<chd>", "<chdcnt>", "<inf>" and "<infcnt>"
    Then User click submit button

    Examples: 
      | edition    | trip   | source | destination | traveldate | adt | adtcnt | yth | ythcnt | chd | chdcnt | inf | infcnt |
      | CA-English | Oneway | YYY    | YYZ         | 27-11-2019 | yes |      1 | yes |      1 | no  |      0 | no  |      0 |
