package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {
    @Given("I print hello world")
    public void i_print_hello_world() {
        System.out.println("hello world");
    }
    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy");
    }

    @Given("Irun cucumber test")
    public void irun_cucumber_test() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is cucumber test");
        }
    }
    @Then("verify this cucumber")
    public void verify_this_cucumber() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Verrrryyyyy Goooood");
        }
    }
}
