# TDSQL-interface-test

## TDSQL接口测试分为两个部分，第一部分为MySQL官网驱动包测试，第二部分为手动编写测试代码，并导入驱动包进行测试。第三部分为用户有特殊要求的OCI和Pro\*c驱动测试

### 第一部分MySQL官网驱动包测试 
MySQL官网可以直接进行测试的测试驱动是ODBC，具体测试方法如下：

#### ODBC
MySQL官网下载ODBC驱动包，官网链接：https://dev.mysql.com/downloads/connector/odbc/
安装完ODBC驱动后，参数配置如下：
1. 选择控制面板->系统和安全->管理工具->ODBC数据源（64位）
2. 选择系统DSN中的添加
3. 选择MySQL ODBC 8.0 Unicode Driver
4. Data Source Name填写需要生成的ODBC数据源的名称，Description选填，TCP/IP Server填写TDSQL Proxy的地址，Port填写TDSQL数据库的Proxy端口。如果使用过程中如果出现中文乱码情况，点击Connector/ODBC页面的Details选项，在弹出的页面中将Character Set改为和TDSQL对应的字符集
5. 参数设置结束后，点击Test，出现”Connection Successful!“表示配置成功
### 第二部分手动编写测试代码
需要进行手动编写并进行测试的驱动列表：
##### test-c-interface

##### test-cpp-interface

##### test-java-interface

##### test-nodejs-interface

##### test-php-interface
PHP在赤兔平台进行安装的时候已经安装好了，我们使用PHP内置web的服务器进行测试。不在原有的赤兔环境进行测试，防止将赤兔的PHP环境破坏。
1. 将test-php-interface.php上传到测试服务器，或者新建一个PHP文件，将test-php-interface.php中的测试代码复制到新建的PHP文件中。
2. 启动内置web服务器，指定的端口不要和TDSQL所使用的端口冲突。
```shell
php -S localhost:8515
```
3. 命令行运行php文件

```shell
curl -is http://localhost:8515
```

##### test-python-interface

### 第三部分特殊类驱动测试




