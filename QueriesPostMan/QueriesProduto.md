# Queries Produto

<ul>
  <li> <strong>MÉTODO POST</strong> — http://localhost:8080/api/produto/save
  </li> 
</br>
  
``` json 
    {
      "nome": "Saia plissada",
      "descricao":"Saia plissada estilo colegial tamanho M",
      "preco":45.90
    }
```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/produto/findAll
  </li>

  ```OK!```
  <li><strong>MÉTODO GET</strong> — http://localhost:8080/api/produto/findById/1
  </li>

  ```OK!```
  <li><strong>MÉTODO PUT</strong> — http://localhost:8080/api/produto/update/1
  </li>
  </br>
  
``` json
    {
      "nome": "Saia Midi",
      "descricao":"Saia midi estilo escritório tamanho P",
      "preco":54.30
    }
```

  <li><strong>MÉTODO DELETE</strong> — http://localhost:8080/api/produto/delete/1
  </li>
  
  ```OK```
</ul>

   
