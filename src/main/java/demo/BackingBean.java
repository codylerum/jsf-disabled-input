package demo;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class BackingBean implements Serializable {

    Logger log = Logger.getLogger("BackingBean");

    private String text = "Existing text";
    private boolean foo;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFoo() {
        return foo;
    }

    public void setFoo(boolean foo) {
        this.foo = foo;
    }

    public void submit() {
        log.info(String.format("Text was %s and foo was %s", text, foo));
    }
}
