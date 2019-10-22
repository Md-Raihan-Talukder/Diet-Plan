<?php

include("Connection.php");

if(isset($_POST["username"]) && isset($_POST["password"])){
    
   $username=$_POST["username"];
   $password=$_POST["password"];
  
   $result = mysqli_query($conn, "select * from login where username='$username' && password='$password'");

	if(mysqli_num_rows($result) > 0){	
		echo "Login";
		exit;
	}			
	else{	
		echo "invalid";
		exit;
	}
}
?>