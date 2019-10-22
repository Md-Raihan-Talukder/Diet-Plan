<?php

	$server_name = "localhost";
	$user_name = "id4279172_eva";
	$password = "root123";
	$db= 'id4279172_diet';
	
	$conn = mysqli_connect($server_name, $user_name, $password, $db);

	if(!$conn){
		die("Error Connection");
	}
	else{
		//echo "Connection OK";
	}

?>