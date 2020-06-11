package co.bacatasw.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nESGreetingService implements  GreetingService{
    @Override
    public String getGreeting() {
        return "Hola Mundo en ESPANHOL!";
    }
}
