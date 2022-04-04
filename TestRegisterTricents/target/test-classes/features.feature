Feature: Cadastro de Veiculo para Cotacao de Seguros

  Scenario:  Acessar Pagina Inicial
    Given Estou na pagina inicial
    When Identifico a opcao de Automobile
    Then Clico no Icone Automobile

  Scenario: Preencher Informacoes Enter Vehicle Data
    Given Estou na pagina Enter Vehicle Data
    When Preencho as informacoes de cadastro
    Then Clico na opcao next e sou direcionado para Enter Insurant Data

  Scenario: Preencher Informacoes Enter Insurant Data
    Given Estou na pagina Enter Insurant Data
    When Preencho as informacoes de cadastro segunda aba
    Then Clico na opcao next e sou direcionado para Enter Product Data

  Scenario: Preencher Informacoes Enter Product Data
    Given Estou na pagina Enter Product Data
    When Preencho as informacoes de cadastro terceira aba
    Then Clico na opcao next e sou direcionado para Select Price Option

  Scenario: Selecionar o Tipo de Plano na aba Select Price Option
    Given Estou na pagina Select Price Option
    When Seleciono a opcao de plano desejada
    Then Clico na opcao next e sou direcionado para Send Quote

  Scenario: Preencher os campos de cadastro na aba Send Quote
    Given Estou na pagina Send Quote
    When Preencho as informacoes de cadastro aba send quote
    Then Clico na opcao next e aguardo visualizacao de cotacao enviada