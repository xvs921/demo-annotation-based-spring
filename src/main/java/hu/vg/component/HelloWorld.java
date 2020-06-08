package hu.vg.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private Koszontes koszontes;

    @Autowired
    public HelloWorld(@Qualifier("formalis") Koszontes koszontes){
        this.koszontes=koszontes;
    }

    public void hello()
    {
        System.out.println(koszontes.udvozles());
    }
}
