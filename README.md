# Desafio-WEB
O arquivo em questão é um projeto maven compactado pela própria ferramenta do Windows 10.

Para o desenvolvimento da automação foi utilizado o driver do navegador Edge, que além de ter 'motor' do Chrome, não me apresentou erros durante a execução.
  O restante compreende em:
  Eclipse na mais nova versão;
  Openjdk 14;
  Maven 3.6
  Edge 84.0.522.40
  
Deve-se descompactar o arquivo -> importar no Eclipse -> importar como um projeto maven existente

As classes a serem executadas estão todas dentro do pacote br.com.shoestock.RunTests
Os arquivos de features estão alocados em src/test/resources/features

Não inseri o @After do cucumber pois para executar todo o fluxo até a tela de pagamento eu utilizei o recurso do JUnitCore.run para executar a classe precedente.
  Exemplo:
    Para adicionar o produto no carrinho eu devo realizar a pesquisa, previamente.
  Por esse motivo, deve-se realizar o fechamento manualmente da aba do Edge. Lembrando que o método para fechar o navegador foi criado, mas estava atrapalhando no uso do JUnitCore.
    
Não consegui validar a tela de compras a tempo, pois mesmo tentando diferentes formas de xpath não obtive sucesso. Não por falta de tentativas e métodos(utilizei inclusive o ChroPath).
