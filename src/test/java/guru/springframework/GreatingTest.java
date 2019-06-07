package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println(" Before All - Called only once");

    }

    @BeforeEach
    public void setup(){
        System.out.println("initailize");
        greeting = new Greeting();

    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {

        System.out.println(greeting.helloWorld("Bora"));
    }

    @Test
    void helloWorld2() {

        System.out.println(greeting.helloWorld("Brittney"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each......");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println(" After All - Called only once");

    }
}