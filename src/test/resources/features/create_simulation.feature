  #Autor:Joan
  #languege:es

  Feature: Crear simulacion de seleccion de productos y añadirlos al carrito de compras
  Como usuario, quiero poder simular la seleccion de productos y anadirlos al carrito de compras
  en la pagina de Amazon.

  Scenario: Simular seleccion de productos al carrito de compras
    Given dado que estoy en la pagina de Amazon
    When escribo "LG Tv" en la barra de busqueda
    And seleciono el primer tv
    And seleciono el segundo tv
    Then se muestra correctamente la seleccion de productos en el carrito de compras
