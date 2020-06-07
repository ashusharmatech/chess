# Chess

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b57c2252bdf6442d969f261f65085337)](https://app.codacy.com/manual/email2ashusharma/chess?utm_source=github.com&utm_medium=referral&utm_content=ashusharmatech/chess&utm_campaign=Badge_Grade_Settings)

![Java CI with Maven](https://github.com/ashusharmatech/chess/workflows/Java%20CI%20with%20Maven/badge.svg)
![Codecov Coverage](https://codecov.io/gh/ashusharmatech/chess/branch/master/graph/badge.svg)

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
