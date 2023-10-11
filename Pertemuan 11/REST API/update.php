<?php 
 

	if($_SERVER['REQUEST_METHOD']=='POST'){

		$id = $_POST['id'];
		$nama = $_POST['nama'];
		$alamat = $_POST['alamat'];
		$jurusan = $_POST['jurusan'];
		

		require_once('conn.php');
		

		$sql = "UPDATE mahasiswa SET nama = '$nama', alamat = '$alamat', jurusan = '$jurusan' WHERE id = $id;";
		

		if(mysqli_query($con,$sql)){
			echo 'Berhasil Update Data Mahasiswa';
		}else{
			echo 'Gagal Update Data Mahasiswa';
		}
		
		mysqli_close($con);
	}
?>
