package co.bacatasw.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nENGreetingService implements  GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world in ENGLISH";
    }
}
