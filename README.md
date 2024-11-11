# Ktor

Shell 1:
```
./gradlew run & ./gradlew -t build
```

Shell 2:
```
curl localhost:8080

sed -i 's/hello/test/' src/main/kotlin/Main.kt

sleep 5

curl localhost:8080
```
