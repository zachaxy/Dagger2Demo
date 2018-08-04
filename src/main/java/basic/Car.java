package basic;

import javax.inject.Inject;

/**
 * @author zhangxin
 * @date 2018/8/4
 */
public class Car {
    @Inject
    Engine engine;

    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    void show(){
        System.out.println(engine.name());
    }

    public static void main(String[] args) {
        new Car().show();
    }
}
