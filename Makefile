all: clean build run

clean:
	mvn clean

build:
	mvn package -DskipTests

run:
	java -jar target/jsonpojotest-0.0.1-SNAPSHOT.jar