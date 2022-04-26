
import com.abstractfactory.Pizza;
import com.abstractfactory.PizzaStore;

public class Principal {

    public static void main(String[] args) {
        PizzaStore ppz = new PizzaStore();

        Pizza pizza = ppz.orderPizza("Clam");
    }
}
