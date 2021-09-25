package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ConfigBean {
    @EJB
    StudentBean sb;

    @PostConstruct
    public void populateDB(){
        System.out.println("Hello Java EE!");

        sb.create("teste","teste","teste","teste");
    }
}
