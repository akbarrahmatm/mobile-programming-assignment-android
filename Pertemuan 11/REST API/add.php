<?php
 
 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		

		$nama = $_POST['nama'];
		$alamat = $_POST['alamat'];
		$jurusan = $_POST['jurusan'];
		
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO mahasiswa (nama,alamat,jurusan) VALUES ('$nama','$alamat','$jurusan')";
		
		//Import File Koneksi database
		require_once('conn.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Success Add New Record';
		}else{
			echo 'SOrry, Failed';
		}
		
		mysqli_close($con);
	}
?>
