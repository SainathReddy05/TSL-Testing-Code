package day6JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Cookie_Test.class, MyFirstJunit_Test.class, Title_Test.class , Cookie2_Test.class})
public class AllTests {

}
