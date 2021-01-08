package tsi.ensg.jee.onlineshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;

@Configuration
public class ConfigOnlineShop {

    @Bean
    public Delivery deliveryDrone(){
        return new Delivery("Delivery by drone");
    }

    @Bean
    public Time Time(){
        return new Time(1,30,00);
    }

    @Bean
    public DeliveryClassic deliveryClassic(){
        return new DeliveryClassic("Standard delivery");
    }

    @Bean
    public Insurance insuranceReturn(){
        return new Insurance("Return insurance only for members");
    }

    @Bean
    public Insurance insuranceTheft(){
        return new Insurance("Theft insurance");
    }

    @Bean
    public OnlineShop OnlineShop(){
        return new OnlineShop("amazon");
    }


}
