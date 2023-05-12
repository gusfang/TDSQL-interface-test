import pymysql
import datetime


# Get database connection infomation
db_proxy = input("Please enter  Proxy address: ")
db_port = input("Please enter database port: ")
db_name = input("Please enter database name: ")
db_username = input("Please enter database user: ")
db_password = input("Please enter database password: ")

# Open database connection
try:
    db = pymysql.connect(host=db_proxy,user=db_username,password=db_password,port=int(db_port),db=db_name)

    print('连接成功！')

except:

    print('连接失败！')

else:
    # Print 'Test PyMySQL Connection' information
    print('--------------------Test PyMySQL Connection--------------------')

    # Print current time
    current_time = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    print("接口当前测试时间是: %s " % current_time)

    # Print PyMySQL driver version
    pymysql_version = pymysql.__version__
    print("当前PyMySQL的驱动版本是: %s" % pymysql_version )

    # Create a cursor
    cursor = db.cursor()

    # Execute SQL statment
    cursor.execute("SELECT variable_name,variable_value FROM performance_schema.global_variables WHERE variable_name LIKE '%version%';")

    # Get data in cursor
    db_versions = cursor.fetchall()

    # Print got data
    print("当前连接测试的数据库信息如下: ")
    print("%40s" % ("VARIABLE_NAME\tVARIABLE_VALUES"))
    for row in db_versions:
        print("%24s" % row[0] + "\t",row[1])

    # Close database connection
    db.close()
