Feature: tfl

  Scenario Outline: tfl journey options
    Given I entered url
    And   I entered journey from "<From>"
    And   I entered journey to "<To>"
    When  I clicked plan my journey button
    Then  I should see expected result "<Expected>"
    And   I should see header text journey from "<ResultFrom>"
    And   I should see header text journey to "<ResultTo>"
    And   I should see header text Travel preferences & accessibility:
    And   I clicked edit journey hyperlink
    And   I should switch journey plan
    And   I clicked Edit preferences and accessibility
    And   I should select option Step-free to platform only
    And   I should see the current url

    Examples:
      | From                 | To               | Expected        | ResultFrom           | ResultTo         |
      | London Bridge        | Watford Junction | JOURNEY RESULTS | London Bridge        | Watford Junction |
    #  | Watford Junctfortion | Wembley Central  | JOURNEY RESULTS | Watford Junctfortion | Wembley Central  |
   #|Wembley Central     |Staines Rail Station |JOURNEY RESULTS|Wembley Central     |Staines Rail Station |




