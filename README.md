# SpringBoot-Boutique
<em>Enunciado por Prof. Wellington de Oliveira — 4° período de Engenharia de Software </em>
</br>
</br>
Desenvolver um sistema para gerenciamento de vendas de uma loja de roupas.

O sistema deverá ser capaz de *cadastrar*, *alterar*, *deletar* e *consultar* um ou todos os <ins>**clientes**</ins>, 
<ins>**funcionários**</ins>, <ins>**produtos**</ins> e <ins>**vendas**</ins>.

  <ul>
      <li> 
        Para cada <ins><strong>cliente</strong></ins> , deverá ser armazenado <em>nome</em>, <em>email</em>, <em>telefone</em>, <em>idade</em> e <em>endereço.</em></li>
        </br>
      <li>Para cada <ins><strong>funcionário</strong></ins>, deverá ser armazenado <em>nome</em>, <em>email</em>, <em>telefone</em>, <em>idade</em>, <em>endereço</em> e 
      <em>função</em>.</li>
        </br>
      <li>Para cada <ins><strong>produto</strong></ins>, deverá ser armazenado o <em>nome</em>, <em>descrição</em>, <em>preço</em>.</li>
        </br>
      <li>Para cada <ins>venda</ins>, deverá ser armazenado o <em>cliente</em>, o <em>funcionário</em>, os <em>produtos vendidos</em>, um campo de<em> observações da venda</em> e o <em>valor total da venda</em>. </li>
    </br>
  </ul>

O valor total da venda <ins>**não**</ins> deverá ser enviado para salvar, mas sim ***calculado internamente 
pelo próprio sistema com base na soma dos preços de todos os produtos vinculados à venda***. 
</br></br>
O sistema deverá ***<ins>calcular o valor total</ins> dos produtos e <ins>vincular à venda</ins> antes de persistir***.
</br></br>
Uma <ins>**venda**</ins> deve conter um <ins>*único cliente*</ins> e um <ins>*único funcionário*</ins> vinculado.
</br></br>
Tanto o <ins>**cliente**</ins> quanto o <ins>**funcionário**</ins> podem estar <ins>*vinculados a várias vendas*</ins>.
</br></br>
Uma **venda** pode *conter vários produtos* e um **produto** pode ser *vinculado a várias vendas*.

<ul>
  <li>O sistema deve ser capaz de listar <ins><strong>vendas</strong></ins> filtradas por <em>parte do nome do cliente</em>.</li>
  <li>O sistema deve ser capaz de listar <ins><strong>vendas</strong></ins> filtradas por <em>parte do nome do funcionário</em>.</li>
  <li>O sistema deve ser capaz de listar os <ins>10 produtos mais caros</ins> do cadastro.</li>
  <li>O sistema deve ser capaz de listar os <ins>clientes</ins> com <em>idade entre 18 e 35 anos</em>.</li>
  <li>O sistema deve ser capaz de listar as <ins>10 vendas com totais mais altos</ins>.</li>
</ul>

<h3>ORIENTAÇÕES</h3>
Não se preocupem com validações de vendas negativas, idade inválida ou coisas parecidas. 
Na semana que vem, teremos aulas focadas em validações e regras de negócio e iremos 
refatorar este projeto incluindo estas técnicas.
</br></br>
No lançamento de produtos na venda, <ins>NÃO incluam atributo quantidade por produto 
lançado na venda</ins>. 
</br></br>
Na semana que vem explicarei algumas regras de negócio necessárias para 
trabalhar com lançamento de quantidades e controle de estoque. 
<h3>ANTES DE ENVIAR</h3>
Testem via Postman cada endpoint de cada controller para verificar se todas as 
requisições HTTP estão funcionando. Verifiquem se todos os responses estão sendo 
retornados como esperado;
