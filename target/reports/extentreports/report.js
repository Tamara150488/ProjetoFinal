$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprarMaterial.feature");
formatter.feature({
  "line": 1,
  "name": "Comprar Material",
  "description": "",
  "id": "comprar-material",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": ": Pesquisar Material e Incluir no Carrinho",
  "description": "",
  "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site da Kalunga",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Pesquiso por \u003cmaterial\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clico na Lupa",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clico no item desejado",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clico em Comprar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "confirmo o nome do produto como \u003cmaterial\u003e e o preco de \u003cpreco\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;",
  "rows": [
    {
      "cells": [
        "material",
        "preco"
      ],
      "line": 10,
      "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;;1"
    },
    {
      "cells": [
        "\"Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN\"",
        "\"R$ 11,40\""
      ],
      "line": 11,
      "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;;2"
    },
    {
      "cells": [
        "\"Estojo escolar plástico branco Waleu PT 1 UN\"",
        "\"R$ 6,80\""
      ],
      "line": 12,
      "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7021605900,
  "status": "passed"
});
formatter.before({
  "duration": 355100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": ": Pesquisar Material e Incluir no Carrinho",
  "description": "",
  "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site da Kalunga",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Pesquiso por \"Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clico na Lupa",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clico no item desejado",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clico em Comprar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "confirmo o nome do produto como \"Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN\" e o preco de \"R$ 11,40\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "comprarMaterial.queAcessoOSiteDaKalunga()"
});
formatter.result({
  "duration": 4754244800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN",
      "offset": 14
    }
  ],
  "location": "comprarMaterial.pesquisoPor(String)"
});
formatter.result({
  "duration": 996431900,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoNaLupa()"
});
formatter.result({
  "duration": 2219675100,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoNoItemDesejado()"
});
formatter.result({
  "duration": 2845305900,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoEmComprar()"
});
formatter.result({
  "duration": 368746000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Caneta hidrográfica 12 cores 15.0112CZF Faber Castell BT 1 UN",
      "offset": 33
    },
    {
      "val": "R$ 11,40",
      "offset": 110
    }
  ],
  "location": "comprarMaterial.confirmoONomeDoProdutoComoEOPrecoDe(String,String)"
});
formatter.result({
  "duration": 1921085400,
  "status": "passed"
});
formatter.after({
  "duration": 1167079300,
  "status": "passed"
});
formatter.after({
  "duration": 195900,
  "status": "passed"
});
formatter.before({
  "duration": 3673756100,
  "status": "passed"
});
formatter.before({
  "duration": 370400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": ": Pesquisar Material e Incluir no Carrinho",
  "description": "",
  "id": "comprar-material;:-pesquisar-material-e-incluir-no-carrinho;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "que acesso o site da Kalunga",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Pesquiso por \"Estojo escolar plástico branco Waleu PT 1 UN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clico na Lupa",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "clico no item desejado",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clico em Comprar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "confirmo o nome do produto como \"Estojo escolar plástico branco Waleu PT 1 UN\" e o preco de \"R$ 6,80\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "comprarMaterial.queAcessoOSiteDaKalunga()"
});
formatter.result({
  "duration": 3306558200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Estojo escolar plástico branco Waleu PT 1 UN",
      "offset": 14
    }
  ],
  "location": "comprarMaterial.pesquisoPor(String)"
});
formatter.result({
  "duration": 922634400,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoNaLupa()"
});
formatter.result({
  "duration": 2156927600,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoNoItemDesejado()"
});
formatter.result({
  "duration": 2600610500,
  "status": "passed"
});
formatter.match({
  "location": "comprarMaterial.clicoEmComprar()"
});
formatter.result({
  "duration": 281104000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Estojo escolar plástico branco Waleu PT 1 UN",
      "offset": 33
    },
    {
      "val": "R$ 6,80",
      "offset": 93
    }
  ],
  "location": "comprarMaterial.confirmoONomeDoProdutoComoEOPrecoDe(String,String)"
});
formatter.result({
  "duration": 3402303400,
  "status": "passed"
});
formatter.after({
  "duration": 1164926600,
  "status": "passed"
});
formatter.after({
  "duration": 183600,
  "status": "passed"
});
});