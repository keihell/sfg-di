package co.bacatasw.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world - property";
    }
}
