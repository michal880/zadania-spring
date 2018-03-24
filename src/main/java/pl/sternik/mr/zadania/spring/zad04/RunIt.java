package pl.sternik.mr.zadania.spring.zad04;

/**
 * Created by Michal on 24.03.2018.
 */
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        KlaserServiceImpl klaserService = ctx.getBean(KlaserServiceImpl.class);
        List<Moneta> naWymiane = klaserService.getDoSprzedania();
        for (Moneta moneta : naWymiane) {
            System.out.println(moneta);
        }
        ctx.close();
    }
}