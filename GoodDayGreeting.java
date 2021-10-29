package com.aris.SpringAssessment;
import java.lang.*;import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
public class GoodDayGreeting implements Greeting{
private String Greeting="Have a Good Day";
public String getGreeting() {
return Greeting;
}
public void setGreeting(String greeting) {
Greeting = greeting;
}
public GoodDayGreeting() {
super();

}
public String greet() {
return Greeting;
}
}

