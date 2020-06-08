package hu.vg.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    @Autowired
    @Qualifier("formalis")
    private Koszontes koszontes;


    public HelloWorld(){
    }

    public void hello()
    {
        System.out.println(koszontes.udvozles());
    }
}
