<?php

$id = $_GET['id'];
	

	require_once('conn.php');
	

	$sql = "SELECT * FROM mahasiswa WHERE id=$id";
	

	$r = mysqli_query($con,$sql);
	

	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
			"id"=>$row['id'],
			"nama"=>$row['nama'],
			"alamat"=>$row['alamat'],
			"jurusan"=>$row['jurusan']
		));
 

	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>
