#三个模块
zk,provider,consumer
本工程实现dubbo的两种调用方式（zk和dubbo直连（直连模式使用端口20880））

一、zk的安装方式
1.解压zookeeper-3.3.6.tar.gz
  tar xf zookeeper-3.3.6.tar.gz
2.去conf目录下cp 
	zoo_sample.cfg zoo.cfg
3.启动,默认启动端口2181监听（sudo lsof -i :2181）
	zkServer.sh start
二、直连模式
1.	provider添加
	 <!--用dubbo协议在20880端口暴露服务-->
    <dubbo:protocol name="dubbo" port="20880"/>
2.    consumer接口处添加url属性
<!--支持添加url直连方式和zk注册中心的方式-->
    <dubbo:reference id="commonApiService" interface="com.netease.dubbo.test.api.CommonApiService" url="dubbo://localhost:20880"/>


