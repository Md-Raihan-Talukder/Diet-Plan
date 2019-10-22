<?php

include 'connection.php';

$sql = "SELECT * FROM bmi";

$res = mysqli_query($conn,$sql);

$result = array();

while($row = mysqli_fetch_array($res)){
		array_push($result,array(
				"bmi"=>$row["bmi"],
				"routine"=>$row["routine"],
				"exercise"=>$row["exercise"],
				"routine"=>$row["routine"]
			)
		);
	}
	echo json_encode(array("result"=>$result));

?>