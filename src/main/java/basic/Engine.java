package basic;

import javax.inject.Inject;

/**
 * @author zhangxin
 * @date 2018/8/4
 */
public class Engine {

    @Inject
    public Engine(){}

    public String name(){
        return "发动机";
    }
}
/*
Error:(11, 10) java: basic.Engine cannot be provided without an @Inject constructor or from an @Provides- or @Produces-annotated method.
      basic.Engine is injected at
          basic.Car.engine
      basic.Car is injected at
          basic.CarComponent.inject(car)

* */