@Regression
Feature: F-002 Write note

  Scenario Outline: S-001 Write text note
    Given Device: Open application on device <DEVICE>
    When Welcome screen: tap ADD_NOTE button
    And Add note: tap TEXT_NOTE button
    And Text note: fill field NOTE_INPUT with value test
    And Text note: tap CONFIRM button
    And Text note: tap BACK button
    Then Welcome screen: field NOTE equals value test

    @SAMSUNG_GALAXY_S9+
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_S9+ |

    @SAMSUNG_GALAXY_A5
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_A5  |

  Scenario Outline: S-002 Write checklist note
    Given Device: Open application on device <DEVICE>
    When Welcome screen: tap ADD_NOTE button
    And Add note: tap CHECKLIST_NOTE button
    And Checklist note: tap ADD_ITEM button
    And Checklist note: fill field CHECKLIST_NOTE_INPUT with value test
    And Checklist note: tap OK button
    Then Checklist note: field WRITTEN_CHECKLIST_NOTE equals value test
    When Checklist note: tap CONFIRM button
    And Checklist note: tap BACK button
    Then Welcome screen: field CHECKLIST_ICON is displayed

    @SAMSUNG_GALAXY_S9+
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_S9+ |

    @SAMSUNG_GALAXY_A5
    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_A5  |