# 基于SSM的学生信息管理系统8

## 1、项目介绍

基于SSM的学生信息管理系统8拥有三种角色，分别为管理员、教师和学生，具体功能如下：

- 管理员：专业管理、班级管理、学生管理、老师管理、课程管理、开课管理、用户管理等

- 教师：成绩管理、学生查询、图形化信息概览

- 学生：选课管理、成绩查询、图形化信息概览

## 2、项目技术

后端框架：SSM（Spring、SpringMVC、Mybatis）

前端框架：Layui、jsp、css、JavaScript、JQuery

## 3、开发环境

- JAVA版本：JDK1.8，其它版本理论上可以
- IDE类型：IDEA、Eclipse、Myeclipse都可以。推荐IDEA与Eclipse
- tomcat版本：Tomcat 7.x、8.x、9.x、10.x版本均可
- 数据库版本：MySql 5.x
- maven版本：无限制
- 硬件环境：Windows 或者 Mac OS


## 4、功能介绍

### 4.1 登录

![image-20220512122644305](https://www.codeshop.fun/Typora-Images/20220512122647.png)

系统三种用户均可通过此界面登录至系统，前端自动校验验证码和用户类型

### 4.2 学生模块

![学生-选课管理](https://www.codeshop.fun/Typora-Images/20220512122748.jpg)

![学生-成绩查询](https://www.codeshop.fun/Typora-Images/20220512122753.jpg)

学生可以选择课程和查询自己的成绩

### 4.3 教师模块

![教师-首页](https://www.codeshop.fun/Typora-Images/20220512122818.jpg)

![教师-成绩管理](https://www.codeshop.fun/Typora-Images/20220512122822.jpg)

![教师-学生查询](https://www.codeshop.fun/Typora-Images/20220512122848.jpg)

教师可以登记班级学生的成绩，还可以通过专业、班级多条件筛选查询学生信息

### 4.4 管理员模块

![管理员-首页](https://www.codeshop.fun/Typora-Images/20220512122948.jpg)

![管理员-专业管理](https://www.codeshop.fun/Typora-Images/20220512122837.jpg)

![管理员-学生管理](https://www.codeshop.fun/Typora-Images/20220512122931.jpg)

![管理员-课程管理](https://www.codeshop.fun/Typora-Images/20220512122940.jpg)

![管理员-班级管理](https://www.codeshop.fun/Typora-Images/20220512122943.jpg)

管理员可以对学生、专业、班级、老师、课程、用户等模块进行增删改查，其中查询为多条件模糊查询。此外管理员、教师也可以在系统首页查看系统概览、班级学生数量折线图、课程平均成绩柱状图等图形化信息


## 6、获取方式

关注公众号： **程序员王不二**，回复 “ 学生8” ，即可免费获取完整版的项目代码。

 ![](https://www.codeshop.fun/Typora-Images/202205281253739.png)

