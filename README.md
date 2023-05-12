# TDSQL-interface-test

## TDSQL接口测试分为两个部分，第一部分为MySQL官网驱动包测试，第二部分为手动编写测试代码，并导入驱动包进行测试。第三部分为用户有特殊要求的OCI和Pro\*c驱动测试

### 第一部分MySQL官网驱动包测试 
MySQL官网可以直接进行测试的测试驱动包包括：ODBC和NET两个驱动包。具体测试方法如下：

#### ODBC
MySQL官网下载ODBC驱动包，官网链接：https://dev.mysql.com/downloads/connector/odbc/
安装完ODBC驱动后，操作如下：
选择控制面板->系统和安全->管理工具->ODBC数据源（64位）。
选择系统DSN中的添加。
选择MySQL ODBC 8.0 Unicode Driver。
Data Source Name填写需要生成的ODBC数据源的名称。Description选填。TCP/IP Server填写TDSQL Proxy的地址，Port填写TDSQL数据库的Proxy端口。如果使用过程中如果出现中文乱码情况，点击Connector/ODBC页面的Details选项，在弹出的页面中将Character Set改为和TDSQL对应的字符集。
参数设置结束后，点击Test，出现”Connection Successful!“表示配置成功。

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




