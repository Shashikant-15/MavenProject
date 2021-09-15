## MavenProject

# README


### Installing Maven

```bash
sudo apt update

sudo apt install maven

```
### Verify the Installation

```bash
mvn -version
```

### Setup the Environment 
 
```bash
nano ~/.bashrc 
```


## Clone the Github Repository


```bash
git clone https://github.com/Shashikant-15/MavenProject.git
```

###  code execution


#### Change directory to cal-api module

```bash
cd cal-api/
```

##### Run the following commands

```bash
mvn clean compile
mvn package
mvn install
```

```bash
mvn clean
mvn test
mvn install
cd <target file>
```
#### Change directory to cal-impl module

```bash
cd cal-impl/
```
#### to make jar file we can use following Command:
```bash
java -jar cal-impl-1.0 -SNAPSHOT -jar -with -dependencies.jar
```

##### Run the following commands to execute the JAVA program

```bash
mvn clean compile
mvn exec:java
```

