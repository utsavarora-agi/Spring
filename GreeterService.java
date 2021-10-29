package com.aris.SpringAssessment;
import java.lang.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

 @Component
public class GreeterService {
@Autowired
@Qualifier("goodDayGreeting")
Greeting greeting;

public Greeting getGreeting() {
return greeting;
}
public void setGreeting(Greeting greeting) {
this.greeting = greeting;
}
public GreeterService() {
super();

}

public void printGreeting() {
System.out.println("Greeting:"+greeting.greet());
}

}

