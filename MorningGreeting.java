package com.aris.SpringAssessment;
import java.lang.*;
import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
	
private String Greeting="Good Morning";

public String getGreeting() {
return Greeting;
} 
public void setGreeting(String greeting) {
Greeting = greeting;
} 
public MorningGreeting() {
super();

}
public String greet() {
return Greeting;
}
}

