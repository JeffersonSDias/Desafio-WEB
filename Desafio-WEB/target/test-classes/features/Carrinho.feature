#language:pt
Funcionalidade: Carrinho

  Contexto: 
    Dado que estou na tela de resultado de pesquisa

  Cenario: adicionar produto pesquisado no carrinho
    Dado clico em um produto na tela de resultado de pesquisa
    Quando clico em no botao comprar
    Então sou levado para a tela do meu carrinho contendo o produto previamente selecionado
