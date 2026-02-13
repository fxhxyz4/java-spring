# simple crud with spring
### requirements: [jq](https://jqlang.org/), [curl](https://curl.se/download.html)
```http request
Endpoints:
GET    http://localhost:9090/university/students
GET    http://localhost:9090/university/students/1
POST   http://localhost:9090/university/students
PUT    http://localhost:9090/university/students/1
DELETE http://localhost:9090/university/students/1
```
```bash
# Get all students
curl -s http://localhost:9090/university/students | jq

# Get student by ID
curl -s http://localhost:9090/university/students/1 | jq
```
```bash
# Add student with curl post:

curl -s http://localhost:9090/university/students | jq

curl -s -X POST http://localhost:9090/university/students \
  -H "Content-Type: application/json" \
  -d '{"firstname":"Іван","lastname":"Петренко","email":"ivan@example.com","age":60}' | jq

curl -s http://localhost:9090/university/students | jq
```
```bash
# Delete student with curl delete:

curl -s -X DELETE http://localhost:9090/university/students/{id}

# Example: 
curl -s -X DELETE http://localhost:9090/university/students/2

curl -s http://localhost:9090/university/students | jq
```
```bash
# Update student with curl put:

curl -s -X PUT http://localhost:9090/university/students/{id} \
  -H "Content-Type: application/json" \
  -d '{"firstname":"Ivan","lastname":"Petrenko","email":"ivan@example.com","age":21}' | jq

# Example:
curl -s -X PUT http://localhost:9090/university/students/1 \
  -H "Content-Type: application/json" \
  -d '{"firstname":"Ivan Updated","lastname":"Petrenko","email":"ivan.new@example.com","age":21}' | jq

curl -s http://localhost:9090/university/students/1 | jq
```
```bash
# jq filtering examples

# Get only firstnames
curl -s http://localhost:9090/university/students | jq '.[].firstname'

# Get students older than 20
curl -s http://localhost:9090/university/students | jq '.[] | select(.age > 20)'

# Get only emails
curl -s http://localhost:9090/university/students | jq '.[].email'

# Count total students
curl -s http://localhost:9090/university/students | jq 'length'
```