package reusing;

import lib.car.Door;
import lib.car.Engine;
import lib.car.Wheel;

class ServicableEngine extends Engine {
    public void service() {}
}

class ServicableCar {
    public ServicableEngine engine = new ServicableEngine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(),
                right = new Door();
    public ServicableCar() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }
}

public class E14_ServicableEngine {
    public static void main(String[] args) {
        ServicableCar car = new ServicableCar();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}
