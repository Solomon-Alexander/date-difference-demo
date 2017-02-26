# date-difference-demo
Java App to compute date difference in days for any two dates

PROBLEM: Calculate the difference between two dates.

Description:
. Create an application that can read in pairs of dates in the following format -
		DD MM YYYY, DD MM YYYY
. Validate the input data, and compute the difference between the two dates in days.
. Output of the application should be of the form -
		DD MM YYYY, DD MM YYYY, difference
. Where the first date is the earliest, the second date is the latest and the difference is the number of days.
. Input can be from a file, or from standard input, as the developer chooses.
. Provide test data to exercise the application.

Constraints:
The application may not make use of the Java libraries for date manipulation (for example Date, Calendar classes).
The application can limit calculation on an input range of dates from 1900 to 2010

Deliverables:
The Java source files, the test data and any test code.


ASSUMPTIONS

1. Based on the provided constraints, assuming that I am expected to reimplement my own implementation of Date completely
2. Generic error message will be displayed for any date validation errors, for instance to limit the year 
from 1900 to 2010,month greater than 12 etc.
3. This solution to the date difference problem is just an initial version. Performance Tuning, tweaks and configuration
can be done at a later stage.
4. The requirements state that the output should be in days. I am assuming that a positive integer value for
difference in days is all that is required. No special formatting around displaying decimals/years/fancy assembled
strings/edge case formatting (e.g. "No difference") required.
5. JUnit for unit testing, Hamcrest (which comes in with jUnit), and Mockito are used.
6. Assuming that an end-to-end acceptance test will suffice as the "test data" deliverable
7. Assuming that the required date format "DD MM YYYY" implies that a leading zero is required for days/months less
than 10.
8. Does not need to be aware of leap years (February 29th is never valid, years always 365 days long)

Prerequisites

1. Install Java 8
2. Install Maven 3.3.9
3. Install Git

INSTRUCTIONS to clone repo, build and run:

    To Clone the date-difference-demo repository, 
    run "git clone https://github.com/Solomon-Alexander/date-difference-demo.git"

    To build the application, run all tests, and install jar, 
    run "mvn clean install" in the root directory.

    To run the application, run the following:
    java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "DD MM YYYY,DD MM YYYY" from the 
    root of the project

    Some Sample input/output:
    1)Input: java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "05 02 2010,07 02 2010"
      Output: 05 02 2010, 07 02 2010, 2

    2)Input: java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "05 02 2010,07 02 2011"
      Output: Exception in thread "main" java.lang.IllegalArgumentException: Expected year to fall within range 1900-2010, found '2011'
        at com.demo.date.validator.DateValidator.validatedYear(DateValidator.java:43)
        at com.demo.date.factory.DateFactory.createWith(DateFactory.java:11)
        at com.demo.date.parser.DateParser.parse(DateParser.java:23)
        at com.demo.date.presentation.DateDifferenceApplication.difference(DateDifferenceApplication.java:30)
        at com.demo.date.presentation.DateDifferenceApplication.main(DateDifferenceApplication.java:17)

    3)Input: java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "05 02 2010,07 22 2010"

      Output:Exception in thread "main" java.lang.IllegalArgumentException: Expected month to fall within range 1-12, found '22'
        at com.demo.date.validator.DateValidator.validatedMonth(DateValidator.java:36)
        at com.demo.date.factory.DateFactory.createWith(DateFactory.java:10)
        at com.demo.date.parser.DateParser.parse(DateParser.java:23)
        at com.demo.date.presentation.DateDifferenceApplication.difference(DateDifferenceApplication.java:30)
        at com.demo.date.presentation.DateDifferenceApplication.main(DateDifferenceApplication.java:17)

    4)Input: java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "05 02 2010,77 02 2010"

      Output: Exception in thread "main" java.lang.IllegalArgumentException: Expected day to fall within the range specified by month FEBRUARY (1-28), found '77'
        at com.demo.date.validator.DateValidator.validatedDayInMonth(DateValidator.java:28)
        at com.demo.date.factory.DateFactory.createWith(DateFactory.java:11)
        at com.demo.date.parser.DateParser.parse(DateParser.java:23)
        at com.demo.date.presentation.DateDifferenceApplication.difference(DateDifferenceApplication.java:30)
        at com.demo.date.presentation.DateDifferenceApplication.main(DateDifferenceApplication.java:17)
    
