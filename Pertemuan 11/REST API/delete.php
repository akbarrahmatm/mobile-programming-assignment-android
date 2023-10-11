<?php 
 $id = $_GET['id'];
 

 require_once('conn.php');
 

 $sql = "DELETE FROM mahasiswa WHERE id=$id;";
 
 

 if(mysqli_query($con,$sql)){
 echo 'Berhasil Menghapus Data Mahasiswa';
 }else{
 echo 'Gagal Menghapus Data Mahasiswa';
 }
 
 mysqli_close($con);
 ?>
