此为个人理解：
23种设计模式

1. 工厂模式：主要就是通过接口和工厂来实现业务逻辑。在`com.panion.space.factory`包中有实现方式。简明方式：一个工厂接口，多个实现类，一个工厂加工。
2. 抽象工厂模式：通过一个抽象工厂来获取其他工厂，来实现多样化。在`com.panion.space.abstractFactory`包中有实现方式。简明方式：多个工厂接口，不同的多个实现类，多个工厂加工，一个抽象工厂检测，一个类检验需要哪个工厂。
    - 简单的工厂模式只加工一种程序，而抽象工厂可以实现多个工厂来完成不同的程序。
3. 单例模式：分为：
    - 懒汉模式
    - 饿汉模式
    - 双检锁、双重校验锁
    - 登记式、静态内部类
    - 枚举
    > 一般不使用懒汉模式，建议使用第三种。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。

    - 简明方式：一个类只执行一件事。
4. 建造者模式：简明方式：一个主要部队标志主要执行，一个小兵独立执行。一些将领命令一些小兵执行事情，一些将帅们管理部队进行整顿，大将军接管将帅。一层层的建造，国王发动主动权，王公大臣负责组装各种部队进行实现。



#### <strong>介绍</strong>
- <strong>意图：</strong> 
- <strong>主要解决:</strong> 
- <strong>何时使用:</strong> 
- <strong>如何解决:</strong> 
- <strong>关键代码:</strong> 
- <strong>应用实例:</strong>

- <strong>优点:</strong> 
- <strong>缺点:</strong> 
- <strong>使用场景:</strong> 
- <strong>注意事项:</strong>
