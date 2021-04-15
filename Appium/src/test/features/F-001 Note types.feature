@Regression
Feature: F-001 Note types

  Scenario Outline: S-001 Check available types of notes
    Given Device: Open application on device <DEVICE>
    When Welcome screen: tap ADD_NOTE button
    Then Add note: field TEXT_NOTE is displayed
    And Add note: field CHECKLIST_NOTE is displayed

    @SAMSUNG_GALAXY_S9+
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_S9+ |

    @SAMSUNG_GALAXY_A5
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_A5  |