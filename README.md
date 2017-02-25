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

1. Based on the constraint, assuming that I am expected to reimplement my own implementation of Date completely
agnostic of java.util.Date. Since the point of the exercise is to implement Date fresh,
I will be doing so without much inspection/unfair copying of the code/mechanisms in java.util.Date,
and will drive these out from scratch.
2. Making the assumption that when a user specified date is invalid (doesn't meet the exact correct format,
or falls outside of the 1900-2010 range, then a generic error message will suffice (no smarts needed to display
clever errors)
3. Ruling efficiency/performance out of the picture, this takes more time and should involve profiling before
premature optimization. Favouring readability and simplicity.
4. The requirements state that the output should be in days. I am assuming that a positive integer value for
difference in days is all that is required. No special formatting around displaying decimals/years/fancy assembled
strings/edge case formatting (e.g. "No difference") required.
5. Assuming that no other additional libraries may be used (Google Collections, Apache Commons etc.) OTHER THAN
maven to build everything, jUnit for unit testing, Hamcrest (which comes in with jUnit), and Mockito so that I can use
proper test doubles in my tests
6. Assuming that an end-to-end acceptance test will suffice as the "test data" deliverable
7. Assuming that the required date format "DD MM YYYY" implies that a leading zero is required for days/months less
than 10.
8. Does not need to be aware of leap years (February 29th is never valid, years always 365 days long)

Prerequisites:
1. Install JDK 8.
2. Install Maven 3.3.9.

INSTRUCTIONS to build and run:
    To build the application, run all tests, and install jar, run "mvn clean install" in the root directory
    To run the application, run "java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar 'DD MM YYYY, DD MM YYYY'" from the root
    of the project
    ie : java -jar target/date-difference-demo-0.0.1-SNAPSHOT.jar "05 02 2010,07 02 2010"
    
