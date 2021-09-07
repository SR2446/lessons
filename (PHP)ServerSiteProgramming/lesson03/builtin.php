<?php
$date_string = date('Y年m月d日 H時i分s秒');
//ランダムな数字(1-6)
$random_number = rand(1, 6);
//文字の長さ
$message_1 = 'Hello';
$length_1 = strlen($message_1);

//日本語文字の長さ
$message_2 = 'こんにちは';
$length_2 = mb_strlen($message_2);

$message_3 = 'Hello,Tokyo';

$address = '東京都新宿区';

//文字の置き換え
$address_2 = str_replace('新宿', '渋谷', $address);

//is_null()
$value = null;
// $value = 0;
// $value = '';
$result_1 = '';
if (is_null($value)) {
    $result_1 = 'NULLです';
} else {
    $result_1 = 'NULLではありません';
}

//isset()
// $value = null;
$value = '';
$result_2 = '';
if (isset($value)) {
    $result_2 = '値が設定されています';
} else {
    $result_2 = '値が設定されていません';
}

//empty()
$value = '';
//int
$value = 0;
//bool
$value = false;
//null
$value = null;
//array
$value = [];
if (empty($value)) {
    $result_3 = '空欄です';
} else {
    $result_3 = '空欄ではありません';
}

//データチェック
//$user_name = 'Tokyo Tarou';
$user_name = '';
$error = '';
if (empty($user_name)) {
    $error = 'ユーザ名を入力してください';
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <h2>日時</h2> 
   <p><?= $date_string ?></p>

   <h2>サイコロ</h2> 
   <p><?= $random_number ?></p>

   <h2><?= $message_1 ?> の長さ</h2> 
   <p><?= $length_1 ?></p>

   <h2><?= $message_2 ?> の長さ</h2> 
   <p><?= $length_2 ?></p>

   <h2><?= $message_3 ?></h2> 
   <p><?= substr($message_3, 6) ?></p>
   <p><?= substr($message_3, 0, 5) ?></p>
   <p><?= substr($message_3, -5) ?></p>
   <p><?= substr($message_3, -6, 1) ?></p>

   <h2><?= $address ?></h2> 
   <p><?= mb_substr($address, 3) ?></p>
   <p><?= mb_substr($address, 0, 3) ?></p>
   <p><?= mb_substr($address, -3, 2) ?></p>

   <h2>新宿を渋谷におきかえ</h2>
   <?= $address_2 ?>

   <h2>is_null()</h2>
   <p><?= $result_1 ?></p>

   <h2>isset()</h2>
   <p><?= $result_2 ?></p>

   <h2>empty()</h2>
   <p><?= $result_3 ?></p>

   <h2>ユーザ名チェック</h2>
   <p><?= $error ?></p>
</body>
</html>