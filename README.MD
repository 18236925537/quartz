# SpringBoot Quartz 集群
SpringBoot +Quartz + Mybatis + LayUI<br/>
通过数据库实现了Quartz集群。<br/>

一个动态管理Quartz任务的例子。不需要重启服务，即可以增加、修改、删除、停止、启动任务。

## 优化说明
由于最近工作比较忙，代码来不及做更多优化，仅做了简单的功能验证。<br/>
如果需要学习，请持续关注本项目，后续会进一步优化。

## SQL脚本
本例中使用的是MySQL数据库。<br/>
在resources\db目录下，需要创建gupao数据库，和sys_job表。<br/>
集群功能需要创建11张表：<br/>
从[这里](http://d2zwv9pap9ylyd.cloudfront.net/quartz-2.2.3-distribution.tar.gz)下载Quartz的安装包。<br/>
解压后，建表脚本是：quartz-2.2.3-distribution\quartz-2.2.3\docs\dbTables\tables_mysql.sql<br/>

注意：如果修改了任务的类名或者路径，因为任务已经保存在数据库中，需要清空上述11张表和sys_job重新添加。<br/>
否则启动会报错。

## 测试地址
启动工程，访问：<br/>
http://localhost:9091/job/jobList<br/>

## 代码说明
1. 需要运行的任务类放在了impl包下面，必须实现BaseJob接口。
2. config下面的类是保证SpringBoot工程启动的时候任务可以运行。
3. 最核心的类是 SchedulerUtil。
4. 暂时没有做的：在界面上搜索任务、描述中的中文乱码问题、界面的修改任务状态功能。

## 集群功能测试
1. 复制两个工程，修改端口启动，一共三个服务。
可以看到任务会随机地分配到几个机器，但是一定不会重复执行。
2. 停掉一台或者两个服务，其他的服务会检测到，并接管任务。