package irko;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Data
@Named
@RequestScoped
@Slf4j
public class MyBean {

    private String name;

    public void nameChanged() {
        log.info("Metod nameChanged fired");
    }
}
