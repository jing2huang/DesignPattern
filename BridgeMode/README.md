# 桥接模式
将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。  

## 模式的结构
* 桥接（Bridge）模式包含以下主要角色。  
1、抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。  
2、扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。  
3、实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。   
4、具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。   

## 优缺点
* 优点  
1、抽象和实现分离。桥梁模式完全是为了解决继承的缺点而提出的设计模式   
2、优秀的扩展能力   
3、实现细节对客户透明。客户不用关心细节的实现，它已经由抽象层通过聚合关系完成了封装    
* 缺点  
会增加系统的理解与设计难度。由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程  
