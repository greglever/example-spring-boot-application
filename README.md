```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.1.RELEASE)
```
# example-spring-boot-application
An example of an application using Spring Boot

In progress...

## Setup
It's probably easiest to install springboot with sdkman, issuing the following command at the terminal:
```
curl -s "https://get.sdkman.io" | bash
```
then after it's installed:
```
sdk install springboot
```
and issuing the following command:
```
spring --version
```
should give you this output:
```
Spring CLI v1.5.1.RELEASE
```
Double check the version of java you have with:
```
java -version
```
which should ideally give you something along the lines of:
```
java version "1.8.0_121"
```
If you're using a mac then if you're still on 1.6 then I would suggest using brew
to install the latest version of java.

To check that your springboot version works fine, run the following:
```
spring run ./app.groovy
```
and navigate to [locahost:8080](http://localhost:8080)
where you should see a "Hello World" message.