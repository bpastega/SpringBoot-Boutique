# Queries Endereço

<ul>
  <li> <strong>MÉTODO POST</strong> — http://localhost:8080/api/endereco/save
  </li> 
</br>
  
``` json 
  {
      "cep":"987987987",
      "numero":"567",
      "logradouro":"Bairro X",
      "cidade": "Cidade X"
      "estado":"Estado X",
      "pais":"País X"
  }

```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/endereco/findAll
  </li>
  
  ```OK!```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/endereco/findById/1
  </li>

  ```OK!```
  <li><strong>MÉTODO PUT</strong> — http://localhost:8080/api/endereco/update/1
  </li>
  </br>
  
``` json
   {
      "cep":"789789789",
      "numero":"765",
      "logradouro":"Bairro Y",
      "cidade": "Cidade Y",
      "estado":"Estado Y",
      "pais":"País Y"
  }

```

  <li><strong>MÉTODO DELETE</strong> — http://localhost:8080/api/endereco/delete/1
  </li>

  ```OK!```
</ul>

   
