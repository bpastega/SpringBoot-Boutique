# Queries Cliente

<ul>
  <li> <strong>MÉTODO POST</strong> — http://localhost:8080/api/cliente/save</li> 
</br>
  
``` json 
    {
    "nome":"Cliente",
    "email":"cliente_exemplo@gmail.com",
    "idade":"123",
    "endereco":{
        "cep":"123123123",
        "numero":"432",
        "logradouro":"Bairro Tal",
        "estado":"Estado Tal",
        "pais":"Um país"
        }
    }

```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/cliente/findAll</li>
  
  ```OK!```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/cliente/findById/1</li>
  
  ```OK!```
  <li><strong>MÉTODO PUT</strong> — http://localhost:8080/api/cliente/update/1</li>
  
``` json
    {
    "nome":"Comprador",
    "email":"comprador_exemplo@gmail.com",
    "idade":"321",
    "endereco":{
        "cep":"321321321",
        "numero":"234",
        "logradouro":"Bairro Lat",
        "estado":"Estado laT",
        "pais":"Dois país"
        }
    }
```
  <li><strong>MÉTODO DELETE</strong> — http://localhost:8080/api/cliente/delete/1</li>
  
  ```OK!```
</ul>

   
