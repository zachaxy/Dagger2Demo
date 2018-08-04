package basic;

import dagger.Component;

/**
 * @author zhangxin
 * @date 2018/8/4
 */
@Component
public interface CarComponent {
    void inject(Car car);
}
