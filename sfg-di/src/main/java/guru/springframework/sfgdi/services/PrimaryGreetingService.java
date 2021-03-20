package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements GreetingService {

    public String sayGreeting() {
        return "Hello World -- from the PRIMARY bean";
    }
}
