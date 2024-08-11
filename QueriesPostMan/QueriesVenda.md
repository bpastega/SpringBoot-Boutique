# Queries Venda

<ul>
  <li> <strong>MÉTODO POST</strong> — http://localhost:8080/api/venda/save
  </li> 
</br>
  
``` json 
     {
      "cliente":{
        "nome":"Comprador",
        "email":"compra@compra.com",
        "idade":22
      },
      "funcionario":{
        "nome":"Fulano",
        "email":"atende@gmail.com",
        "telefone":"4324323",
        "idade":32,
        "funcao":"atendente"
      }
}
```

``` json
    {
    "cliente": {
        "nome": "Novo Cliente",
        "email": "novo_cliente@example.com",
        "idade": 30,
        "endereco": {
            "cep": "12345678",
            "numero": "100",
            "logradouro": "Rua Exemplo",
            "estado": "Estado Exemplo",
            "pais": "País Exemplo"
        }
    },
    "funcionario": {
        "nome": "Novo Funcionario",
        "email": "novo_funcionario@example.com",
        "funcao": "Vendedor"
    },
    "produto": [
        {
            "nome": "Produto 1",
            "descricao": "Descrição do Produto 1",
            "preco": 100.0
        },
        {
            "nome": "Produto 2",
            "descricao": "Descrição do Produto 2",
            "preco": 150.0
        }
    ]
}


```

  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/venda/findAll
  </li>
  
  ```OK!```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/venda/findById/5
  </li>
  
  ```OK!```
  <li><strong>MÉTODO PUT</strong> — 
  </li>
  </br>
  
``` json
{
      "cliente":{
        "nome":"Mudou",
        "email":"mudou@compra.com",
        "idade":44
      },
      "funcionario":{
        "nome":"Ciclano",
        "email":"cicla@gmail.com",
        "telefone":"434343432",
        "idade":99,
        "funcao":"bagunça"
      }
}
```



  <li><strong>MÉTODO DELETE</strong> — http://localhost:8080/api/venda/delete/5
  </li>
  
  ```OK!```
</ul>

   
