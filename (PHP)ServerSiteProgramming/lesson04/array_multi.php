<?php
//多次元配列（Array Multiple）
[
    [1, 2, 3, 4, 5,],
    [6, 7, 8, 9, 10,],
];

$rows = [
    [90, 78, 82,],
    [62, 70, 68,],
    [68, 88, 72,],
];

$users = [
    ['id' => 1, 'name' => 'Alice'],
    ['id' => 2, 'name' => 'Bob'],
    ['id' => 3, 'name' => 'Cris'],
];

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
    <h2>90のデータ</h2>
    <p><?= $rows[0][0] ?></p>
    <h2>88のデータ</h2>
    <p><?= $rows[2][1] ?></p>

    <h2>ユーザリスト</h2>
    <ul>
        <li><?= $users[0]['name'] ?></li>
        <li><?= $users[1]['name'] ?></li>
        <li><?= $users[2]['name'] ?></li>
    </ul>
</body>
</html>