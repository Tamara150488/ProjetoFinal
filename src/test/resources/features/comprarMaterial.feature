Feature: Comprar Material
  Scenario Outline: : Pesquisar Material e Incluir no Carrinho
    Given que acesso o site da Kalunga
    When  Pesquiso por <material>
    And  clico na Lupa
    Then clico no item desejado
    When clico em Comprar
    Then  confirmo o nome do produto como <material> e o preco de <preco>
    Examples:
      | material                                                        | preco       |
      | "Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN" | "R$ 11,40"  |
      | "Estojo escolar plástico branco Waleu PT 1 UN"                  | "R$ 6,80"   |
