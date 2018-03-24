package pl.sternik.mr.zadania.spring.zad09;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import pl.sternik.mr.zadania.spring.zad01.MyFirstBean;
import pl.sternik.mr.zadania.spring.zad02.MySecondBean;
import pl.sternik.mr.zadania.spring.zad03.MyThirdBean;

/**
 * Created by Michal on 24.03.2018.
 */
@Configuration
public class BeanConfigurator {
    @Bean
    @Lazy
    public MySecondBean myDrugi(){
        return new MySecondBean("aaaa");
    }
    @Bean
    public MySecondBean myDrugiNazwany(){
        MySecondBean t = new MySecondBean();
        t.setName("tralal");
        return t;

    }
    @Bean
    @Lazy
    public MyThirdBean mySkomplikowany() {
        MyThirdBean thirdBean = new MyThirdBean("skomplikowany");
        thirdBean.setBean(getMyFirst());
        return thirdBean;
    }

    @Bean
    public MyFirstBean getMyFirst(){
        return new MyFirstBean("ale pierwszy");
    }
}
