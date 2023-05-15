<?php

// PHP for MySQL connection information
$conn = mysqli_connect("124.222.7.248:3306","root","PP--ssw00rd","test");

// Check MySQL connection
if(!$conn){
	
	die("MySQL连接失败!" . mysql_connect_errno());

}

echo "--------------------PHP Connection Test--------------------\n";

//Print current date
$current_date = date('Y-m-d H:i:s',time());
print("接口当前测试时间是: $current_date\n");

echo "当前连接测试的数据库信息如下: \n";
// Query MySQL version‘s SQL statment
$sql = "SELECT variable_name,variable_value FROM performance_schema.global_variables WHERE variable_name LIKE '%version%';";

$res = mysqli_query($conn,$sql);

// Get one row data
//$row = mysqli_fetch_array($res,MYSQLI_ASSOC);
//printf("%s : %s\n",$row["variable_name"],$row["variable_value"]);

// Get multi row data
printf("%40s","VARIABLE_NAME\tVARIABLE_VALUE\n");
$arr = mysqli_fetch_all($res,MYSQLI_ASSOC);
foreach($arr as $value){
	printf("%24s\t%s\n",$value["variable_name"],$value["variable_value"]);
}

mysqli_free_result($res);

// Close MySQL connection
mysqli_close($conn);


?>
