@Debug
Feature: F-001 Open app

  Scenario Outline: S-001 Open app
    Given Device: Open application on device <DEVICE>

    Examples:
      | DEVICE |
      | SAMSUNG_GALAXY_A5  |
      | SAMSUNG_GALAXY_S9+ |
