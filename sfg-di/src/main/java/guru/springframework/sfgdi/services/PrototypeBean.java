package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.beancontext.BeanContextProxy;

@Scope("prototype")
@Component
public class PrototypeBean {
    public PrototypeBean(){
        System.out.println("Creating a prototype bean!!!!!!!!!!!!");
    }

    public String getMyScope(){
        return ("I am a Prototype!");
    }
}
