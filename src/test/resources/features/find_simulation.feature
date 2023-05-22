#Autor:Anderson
  #languege:en

  Feature: navegacion en la pagina de bancolombia
    Como usuario, quiero dirigirme a la sección donde pueda hacer una simulación
    de un crédito de libre inversión en la página de inicio de Bancolombia.

    Scenario: Acceder a la simulación de crédito de libre inversión en la página de inicio de Bancolombia
      Given dado que estoy en la homepage de Bancolombia
      When navego por la página en busca de opciones
      Then encuentro la sección de simulación de crédito de libre inversión
