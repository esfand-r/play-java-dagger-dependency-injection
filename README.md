Play + Java + Dagger (Dependency Injection)
=================================
 This is a simple example of dependency injection in Playframework with Dagger. 
 
 This project uses.
 
 + dagger (1.2.2)
 + dagger-compiler (1.2.2)
 + junit (4.12)
 
### Run the App
 Run the App: (./activator run) .
 Dagger is configured to work with Play in [Global.java](https://github.com/esfand-r/play-java-dagger-dependency-injection/blob/master/app/Global.java.
 Configuration of Dependency Injection can be found at [DaggerConfig.java](https://github.com/esfand-r/play-java-dagger-dependency-injection/blob/master/app/DaggerConfig.java).

### Test
 Run the Tests: (sbt test)
 
 Please see [DaggerTestConfig.java](https://github.com/esfand-r/play-java-dagger-dependency-injection/blob/master/test/DaggerTestConfig.java). 
 This is where it is configured so the tests can use the service
 Sample test is at [RandomServiceTest.java](https://github.com/esfand-r/play-java-dagger-dependency-injection/blob/master/test/RandomServiceTest.java)

### Further Learning
 Please see [Dagger Documentation](http://square.github.io/dagger) which contains a lot of nice details.

