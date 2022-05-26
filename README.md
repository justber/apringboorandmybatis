# 工程简介
最近一直在弄mybatisplus的项目，mybatis和springboot还没有做过整合，回来补坑，spring整合mybatis还是很好整合的
首先，直接在配置文件加入
~~
#数据库
  spring.datasource.url=jdbc:mysql://127.0.0.1:3306/testthyfle?characterEncoding=UTF-8
  spring.datasource.username=你自己的用户
  spring.datasource.password=密码
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  
  # 主要是防止找不到mapper文件位置
  mybatis.mapper-locations=classpath:mapper/*.xml 
~~
这些配置 ，数据库连接啊，配置之类的，就简单的整合,然后整合druid，和log4j，这些配置在yml文件配置
然后配置druid配置的监控，直接在文件中配置config目录写入druid配置 浏览器输入http://localhost:8080/druid/index.html

# 延伸阅读

