<?php
//お知らせファイルのパス
$path = 'data/informations.txt';
//お知らせ情報の initialize
$informations = [];
if (file_exists($path)) {
    //ファイルがあればファイルを開く（read only)
    $file = fopen($path, 'r');
    //1行読み込み
    while ($line = fgets($file)) {
        $informations[] = $line;
    }
    //ファイルを閉じる
    fclose($file);
}

//お知らせファイルのパス
$path = 'data/items.csv';
//商品の initialize
$items = [];
if (file_exists($path)) {
    //ファイルがあればファイルを開く（read only)
    $file = fopen($path, 'r');
    //カラムを読み込む
    $columns = fgetcsv($file);

    //1行ずつCSV読み込み
    while ($data = fgetcsv($file)) {
        //カラムを繰り返す
        foreach ($columns as $index => $column) {
            $item[$column] = $data[$index];
        }
        //商品を追加
        $items[] = $item;
    }
    //ファイルを閉じる
    fclose($file);
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
    <h2>Information</h2>
    <ul>
        <?php foreach ($informations as $information) : ?>
            <li><?= $information ?></li>
        <?php endforeach ?>
    </ul>

    <h2>商品一覧</h2>
    <table>
        <?php foreach ($items as $item) : ?>
            <tr>
                <td><?= $item['name'] ?></td>
                <td><?= $item['price'] ?></td>
            </tr>
        <?php endforeach ?>
    </table>
</body>

</html>