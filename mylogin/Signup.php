<?PHP

include("Connection.php");

if(isset($_POST['name']) && isset($_POST['username']) && isset($_POST['password']) && isset($_POST['gender']) && isset($_POST['age'])){
	
	$name=$_POST["name"];
    $username=$_POST["username"];
    $password=$_POST["password"];
	$gender=$_POST["gender"];
	$age=$_POST["age"];
    
	$result = mysqli_query($conn, "SELECT username FROM login WHERE username = '".$username."'");	
	
	if(mysqli_num_rows($result) > 0){	
		echo "Username exist!!\nPlease give a unique username";
		exit;
	}			
	else{	
      
	  $query="INSERT INTO login(name,username,password,gender,age)VALUES('$name','$username','$password','$gender','$age')";
      $data=mysqli_query($conn,$query);
 
    if($data){
            echo "Successfully Signed In";
      }
    else{
            echo "Error Sign in";
      }
		exit;
	}	
}				

?>