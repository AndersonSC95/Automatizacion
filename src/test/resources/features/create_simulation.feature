#Autor:Anderson
  #languege:en

Feature: Crear simulación de préstamo de libre inversión
  Como usuario, quiero poder simular un crédito de libre inversión
  en la página de Bancolombia.

  Scenario: Simular un crédito de libre inversión en la página de Bancolombia
    Given dado que estoy en la sección de simulación de crédito de libre inversión
    When ingreso la información requerida
    And selecciono "Simular"
    Then se muestra una simulación del préstamo de libre inversión con los resultados correspondientes.