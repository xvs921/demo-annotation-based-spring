package hu.vg.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("informalis")
@Component
public class InformalisKoszontes implements Koszontes{
    public String udvozles() {
        return "Csá";
    }
}
