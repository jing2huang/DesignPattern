# ����ģʽ
��ĳһ�������ṩһ���������󣬲��ɴ���������ƶ�ԭ��������á�  
�ٸ�����˵��������˵����������һ�����ֳ�����Ȼ�ҿ����Լ�ȥ�ҳ�Դ������������һϵ�еĳ����������̣�������ȷʵ̫�˷��ҵ�ʱ��;����ˡ���ֻ������һ��������Ϊʲô�һ�Ҫ��������ô�����أ�
�����Ҿ�ͨ���н鹫˾���򳵣������������ҳ�Դ�����Ұ��������������̣���ֻ�Ǹ���ѡ���Լ�ϲ���ĳ���Ȼ��Ǯ�Ϳ����ˡ�  
ע������cglib��jar����https://github.com/cglib/cglib/releases��  

## ��̬����&��̬����
* ��̬�������ɳ���Ա�������ض������Զ�����Դ���룬�ٶ�����롣�ڳ�������֮ǰ��������.class�ļ����Ѿ�������
* ��̬�������ڳ�������ʱͨ��������ƶ�̬���������ࡣ

## JDK��̬����&CGLIB��̬����
* JDK��̬���������ڽӿڵĴ���
JDK��̬���������ǲ�����Ҫ���ֶ��Ĵ��������࣬����ֻ��Ҫ��дһ����̬�������������Ĵ���������JDK������ʱΪ���Ƕ�̬����������  
JDK��̬������JDKProxyHandlerʵ��InvocationHandler�ӿ�  
Proxy.newProxyInstance()�Ǵ�����������ķ�����������������������  
1��ClassLoader loader:ָ����ǰĿ�����ʹ�õ��������,��ȡ�������ķ����ǹ̶���   
2��Class<?>[] interfaces:ָ��Ŀ�����ʵ�ֵĽӿڵ�����,ʹ�÷��ͷ�ʽȷ������  
3��InvocationHandler:ָ����̬��������JDKProxyHandler����ִ��Ŀ�����ķ���ʱ,�ᴥ���¼��������ķ���  

* CGLIB��̬������������Ĵ������ֽ�����ǿ���������
GLib�����˷ǳ��ײ���ֽ��뼼������ԭ����ͨ���ֽ��뼼��Ϊһ���ഴ�����࣬���������в��÷������صļ����������и��෽���ĵ��ã�˳��֯������߼�������Ϊ���õ��Ǽ̳У����Բ��ܶ�final���ε�����д�����    
//Cglib�ֽ�����ǿ��  
Enhancer enhancer = new Enhancer();  
//�̳б�������  
enhancer.setSuperclass(��������class);  
//���ûص�:�ص���CglibProxyʵ��MethodInterceptor�ӿ�  
enhancer.setCallback(new CglibProxy());  
//�������������  
enhancer.create();  