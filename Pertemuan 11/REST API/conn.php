<?php
 
 define('HOST','localhost');
 define('USER','root');
 define('PASS','');
 define('DB','android_api');
 
 $con = mysqli_connect(HOST,USER,PASS,DB);

 if ($con->connect_error) {
   die("Koneksi Gagal: " . $con->connect_error);
}
?>
