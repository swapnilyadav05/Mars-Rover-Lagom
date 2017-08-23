# Mars-Rover-Lagom
## Run Project
$ sbt runAll

## Verify that the services 
The following request returns the json {"x":3,"y":3,"direction":"S"}

$ curl -H "Content-Type: application/json" -X POST -d '{"x":3,"y":3, "direction":"E"}' http://localhost:9000/api/position/R
