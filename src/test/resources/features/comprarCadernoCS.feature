Feature: Comprar Caderno CS
  Scenario: Pesquisar Caderno e Incluir no Carrinho
    Given que acesso o site da Kalunga
    When  Pesquiso por "caderno caligrafia"
    And  clico na Lupa
    Then  vejo a lista de resultados para a pesquisa "caderno caligrafia"
    And clico no item desejado
    When clico em Comprar
    Then  confirmo o nome do produto como "caderno caligrafia" e o preco de "R$ 6,90"