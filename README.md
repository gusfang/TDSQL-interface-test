# TDSQL-interface-test

## TDSQL接口测试分为两个部分，第一部分为MySQL官网驱动包测试，第二部分为手动编写测试代码，并导入驱动包进行测试。第三部分为用户有特殊要求的OCI和Pro\*c驱动测试

### 第一部分MySQL官网驱动包测试 
MySQL官网可以直接进行测试的测试驱动包包括：ODBC和NET两个驱动包。具体测试方法如下：

#### ODBC
MySQL官网下载ODBC驱动包，官网链接：https://dev.mysql.com/downloads/connector/odbc/
安装驱动包
 ![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/f25c7cbd-4f0f-4f4f-846c-c451252f39ee)
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/33bcdb56-52a2-4056-9801-1fe5641d420e)
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/03696dae-ff2e-45c0-b0c3-e222fba0790d)
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/73527f4e-7b13-486a-94d8-d8f34a6e7e5e)
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/c9299c58-3148-4a29-8a8e-b56363fbbaed)

 
 
 

 
添加ODBC配置
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/3a6c771e-eba1-4a47-af87-16f4e78a5935)
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/29792cfa-e861-48a1-a5a8-d428b6ec0966)

配置测试连接信息并进行测试
![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/c5333c5b-3492-4d98-9f2a-9faf523ef0f8)

 ![image](https://github.com/jerkcsrk/TDSQL-interface-test/assets/89886972/790856e7-80af-4442-81de-6fd35e0087ee)

 
 
 

#### NET



### 第二部分手动编写测试代码
需要进行手动编写并进行测试的驱动列表：
1. test-c-interface.c
2. test-cpp-interface.cpp
3. test-java-interface.java
4. test-nodejs-interface.js
5. test-php-interface.php
6. test-python-interface.py

### 第三部分特殊类驱动测试




