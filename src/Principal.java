import com.abstractfactory.AbstractFactory;
import com.abstractfactory.FactoryProducer;
import com.abstractfactory.Shape;


public class Principal {


    public static void main(String[] args) {

        //Cria a fábrica de métodos para shape blue
        AbstractFactory shapeBlueFactory = FactoryProducer.getFactory("BLUE");

        //Pega um objeto círculo
        assert shapeBlueFactory != null;
        Shape shape1 = shapeBlueFactory.getCircle(1);

        //Chama o método draw do círculo
        shape1.draw();

        //Pega um objeto retangulo
        Shape shape2 = shapeBlueFactory.getRectangle(2);

        //Chama o método draw do retangulo
        shape2.draw();

        //Pega um objeto triangulo
        Shape shape3 = shapeBlueFactory.getSquare(3);

        //Chama o método draw do triangulo
        shape3.draw();

        //Cria a fábrica de métodos para shape red
        AbstractFactory shapeRedFactory = FactoryProducer.getFactory("RED");

        //Pega um objeto circulo
        assert shapeRedFactory != null;
        Shape shape4 = shapeRedFactory.getCircle(4);

        //Chama o método draw do circulo
        shape4.draw();

        //Pega um objeto retangulo
        Shape shape5 = shapeRedFactory.getRectangle(5);

        //Chama o método draw do retangulo
        shape5.draw();

        //Pega um objeto quadrado
        Shape shape6 = shapeRedFactory.getSquare(6);

        //Chama o método draw do quadrado
        shape6.draw();

    }
}
