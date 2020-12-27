# 设计模式(Design Pattern)

## 1.单例模式(Singleton)
[Singleton](docs/singleton-readme.md)
<br/>
某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。

## 2.原型模式(Prototype)
[Prototype](docs/prototype-readme.md)
<br/>
将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。

## 3.工厂方法模式(Factory Method)
[Factory Method](docs/factory_method-readme.md)
<br/>
定义一个用于创建产品的接口，由子类决定生产什么产品。

## 4.抽象工厂模式(Abstract Factory)
[Abstract Factory](docs/abstract_factory-readme.md)
<br/>
提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。

## 5.建造者模式(Builder)
[Builder](docs/builder-readme.md)
<br/>
将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。

## 6.代理模式(Proxy)
[Proxy](docs/proxy-readme.md)
<br/>
为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。

## 7.适配器模式(Adapter)
[Adapter](docs/adapter-readme.md)
<br/>
将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

## 8.桥接模式(Bridge)
[Bridge](docs/bridge-readme.md)
<br/>
将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

## 9.装饰模式(Decorator)
[Decorator](docs/decorator-readme.md)
<br/>
动态的给对象增加一些职责，即增加其额外的功能。

## 10.外观模式(Facade)
[Facade](docs/facade-readme.md)
<br/>
为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。

## 11.享元模式(Flyweight)
[Flyweight](docs/flyweight-readme.md)
<br/>
运用共享技术来有效地支持大量细粒度对象的复用。

## 12.组合模式(Composite)
[Composite](docs/composite-readme.md)
<br/>
将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。

## 13.模板方法模式(Template Method)
[Template Method](docs/template_method-readme.md)
<br/>
定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。

## 14.策略模式(Strategy)
[Strategy](docs/strategy-readme.md)
<br/>
定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。

## 15.命令模式(Command)
[Command](docs/command-readme.md)
<br/>
将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。

## 16.职责链模式(Chain of Responsibility)
[Chain of Responsibility](docs/chain_of_responsibility-readme.md)
<br/>
把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。

## 17.状态模式(State)
[State](docs/state-readme.md)
<br/>
允许一个对象在其内部状态发生改变时改变其行为能力。

## 18.观察者模式(Observer)
[Observer](docs/observer-readme.md)
<br/>
多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。


## 19.中介者模式(Mediator)
[Mediator](docs/mediator-readme.md)
<br/>
定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。

## 20.迭代器模式(Iterator)
[Iterator](docs/iterator-readme.md)
<br/>
提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

## 21.访问者模式(Visitor)
[Visitor](docs/visitor-readme.md)
<br/>
在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。

## 22.备忘录模式(Memento)
[Memento](docs/memento-readme.md)
<br/>
在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。

## 23.解释器模式(Interpreter)
[Interpreter](docs/interpreter-readme.md)
<br/>
提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。