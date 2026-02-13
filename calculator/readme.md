# _pz_1.3 - Maven_

```http request
Endpoints:
http://localhost:8080/calc/add?a=5&b=3
result: 8

http://localhost:8080/calc/subtract?a=10&b=4
result: 6

http://localhost:8080/calc/multiply?a=8&b=6
result: 48

http://localhost:8080/calc/divide?a=20&b=4
result: 5
```

```http request
Error handler:
http://localhost:8080/calc/divide?a=20&b=0
result: Помилка: не можна ділити на нуль
```