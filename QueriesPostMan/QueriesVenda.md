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

   
