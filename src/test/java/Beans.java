import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean(name = "car")
    public Car buildCar(){
        Car car=new Car("xx","black");
        return car;
    }
}
