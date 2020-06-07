# Chess

![Java CI with Maven](https://github.com/ashusharmatech/chess/workflows/Java%20CI%20with%20Maven/badge.svg)
![Codecov Coverage](https://codecov.io/gh/ashusharmatech/chess/branch/master/graph/badge.svg)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/8be1614a4c2f47248d1ca9ae1eef1f64)](https://www.codacy.com/manual/email2ashusharma/chess?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ashusharmatech/chess&amp;utm_campaign=Badge_Grade)

This program tries to find all the possible moves of Chess pieces on an empty board.

### Installing

You can run your application using a simple java program:

Main Java class is: [Chessboard.java](/src/main/java/io/game/Chessboard.java)

### Create a JAR file
If you want to create an executable JAR file out of our project. 
```
mvn clean package
```

### Running the test
Instead of running a full build with packaging, it is also possible to just run the test phases of the Maven life cycle.
```
mvn test
```
