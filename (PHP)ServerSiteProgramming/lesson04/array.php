<?php

$drinks = ['コーヒー', '紅茶', 'ほうじ茶'];

$drinks[] = '炭酸水';
$drinks[0] = 'オレンジジュース';


$count = count($drinks);


array_pop($drinks);


array_shift($drinks);


array_unshift($drinks, 'コーヒー');

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
    <ul>
        <li><?= $drinks[0] ?></li>
        <li><?= $drinks[1] ?></li>
        <li><?= $drinks[2] ?></li>
        <li><?= $drinks[3] ?></li>
    </ul>
    <h2>ドリンクの個数</h2>
    <p><?= $count ?></p>
</body>
</html>