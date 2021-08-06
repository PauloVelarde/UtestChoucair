#Autor : Paulo Velarde

  @stories
  Feature: Choucair Utest
    As a user, I want to register a new user profile in Utest
  @scenario1
  Scenario: Register a new user
    Given than paul wants create an new user
    |strFirstName|strLastName|strEmail|strMonth|strDay|strYear|strLanguasges|
    |youFirstName|youLastName|youEmail|youMonth|youDay|youYear|youLanguasges|
    When he enter on the Utest platform
    |strCity|strPostal|strCountry|strComputer|strVersion|strLanguage|strMobile|strModel|strOperatingSystem|strCreatePassword|strPassword|
    |youCity|youPostal|youCountry|youComputer|youVersion|youLanguage|youMobile|youModel|youOperatingSystem|youCreatePassword|youPassword|
    Then he register an new user
    |strEmail|strPassword|
    |youEmail|youPassword|