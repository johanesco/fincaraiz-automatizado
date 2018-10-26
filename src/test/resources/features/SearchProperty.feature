#Author: johanescobar1@gmail.com
@search
Feature: Search a property
  As a web user
  I want to enter in the fincaraiz.com.co page
  to search a property in offer into Colombia

  Scenario Outline: Search a property
    Given that Pedro open the browser in the fincaraiz.com.co page to search a property
    When he sees the Colombian map and press click on the departament <Department>
    And he press click on the map from <Zone>
    And he select the filter order of the property in <order>
    And Pedro select the property in the position <Position> and see the Photos
    Then he should see the Description <Location>

    Examples: 
      | Department   | Zone         | order      | Position | Location |
      | Antioquia    | Envigado     | Price desc |        1 | ver mapa |
      | Cundinamarca | La Calera    | Price asc  |        3 | ver mapa |
      | Vichada      | Vichada      | Price asc  |        4 | ver mapa |
      | Colombia     | Copacabana   | Price desc |        2 | ver mapa |
      | Antioquia    | NorOccidente | Price desc |       44 | ver mapa |
