# Queries Funcionário

<ul>
  <li> <strong>MÉTODO POST</strong> — http://localhost:8080/api/funcionario/save
  </li> 
</br>
  
``` json 
    {
      "nome": "Funcionario",
      "email": "funcionario@gmail.com",
      "telefone": "999943884932",
      "idade": 34,
      "funcao": "programador"
    }
```

  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/funcionario/findAll
  </li>

  ```OK!```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/funcionario/findById/1
  </li>

  ```OK!```
  <li><strong>MÉTODO PUT</strong> — http://localhost:8080/api/funcionario/update/1
  </li>
  </br>
  
``` json
    {
      "nome": "Trabalhador",
      "email": "trabalhador@gmail.com",
      "telefone": "999473827432",
      "idade": 43,
      "funcao": "developer"
    }
```

  <li><strong>MÉTODO DELETE</strong> — http://localhost:8080/api/funcionario/delete/1
  </li>

```OK!```
</ul>
