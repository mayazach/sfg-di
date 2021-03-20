package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreetingService {
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
