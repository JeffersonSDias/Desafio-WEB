#language:pt
Funcionalidade: Conferencia

  Contexto: 
    Dado que estou na tela do meu carrinho contendo o produto previamente selecionado

  Esquema do Cenario: Validar produto na tela de pagamento
    Dado que clico no botao CONTINUAR
    Quando na proxima tela realizo login com "<cpf>" e "<senha>"
    Entao sou levado para a tela de checkout onde posso validar que o produto foi inserido corretamente no pedido

    Exemplos: 
      | cpf         | senha     |
      | 75586816857 | Senha@123 |
