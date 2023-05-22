#Autor:Anderson
  #languege:en

Feature: Consulta la pagina principal de Bancolombia
  como usuario, necesito buscar homepage de Bancolombia en
  google para ingresar al sitio oficial Bancolombia

  Scenario: Buscar la pagina oficial de Bancolmbia en el motor de busqueda de Google
    Given que me encuentro en la pagina principal de google
    When escriba la palabra Bancolombia
    Then puedo ver la pagina oficial

