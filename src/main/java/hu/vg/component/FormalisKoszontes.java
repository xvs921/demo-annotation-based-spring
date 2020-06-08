package hu.vg.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("formalis")
@Component
public class FormalisKoszontes implements Koszontes{
    public String udvozles() {
        return "Üdvözlöm kedves hallgató";
    }
}
