# 外观模式
又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。   
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/facade/facade.jpg)

## 模式的结构
* 外观（Facade）模式包含以下主要角色。  
1、外观（Facade）角色：为多个子系统对外提供一个共同的接口。  
2、子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。  
3、客户（Client）角色：通过一个外观角色访问各个子系统的功能。  