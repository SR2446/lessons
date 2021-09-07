<?php
$years = [2020, 2019, 2018, 2017];
$drinks = ['コーヒー', '紅茶', 'ほうじ茶'];
$user = [
    'name' => '東京　一郎',
    'gender' => 'male',
    'age' => 21,
];
//今年から1900までの数字の配列を作る
$select_years = range(date('Y'), 1900);

//上の階層： ../
//現在の階層： ./
//Rootの階層： /
foreach (glob('./*.php') as $file) {
    $all_files[] = $file;
}
//商品データ
$items = [
    ['id' => 1, 'name' => 'コーヒー', 'price' => 130, 'is_sale' => true],
    ['id' => 2, 'name' => '紅茶', 'price' => 150, 'is_sale' => false],
    ['id' => 3, 'name' => 'ほうじ茶', 'price' => 120, 'is_sale' => true],
    ['id' => 4, 'name' => '炭酸水', 'price' => 80, 'is_sale' => false],
    ['id' => 5, 'name' => 'オレンジジュース', 'price' => 150, 'is_sale' => true],
];
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <h2>個数</h2>
        <p><?= count($years) ?></p>
        <?php
        //$years の個数分繰り返す
        for ($i = 0; $i < count($years); $i++) {
            echo $years[$i];
            //HTMLの改行タグ
            echo '<br>';
        }

        foreach ($years as $year) {
            echo $year;
            echo '<br>';
        }
        ?>

        <ul>
            <?php
            //liの繰り返し
            foreach ($drinks as $drink) {
                echo "<li>{$drink}</li>";
            }
            ?>
        </ul>

        <ul>
            <?php foreach ($drinks as $drink) : ?>
                <li><?= $drink ?></li>
            <?php endforeach ?>
        </ul>

        <h2>ユーザ</h2>
        <ul>
            <?php foreach ($user as $key => $value) : ?>
                <li><?= $key ?> : <?= $value ?></li>
            <?php endforeach ?>
        </ul>

        <h1>プルダウン</h1>
        <select name="year" id="">
            <option value="2020">2020年</option>
            <option value="2019">2019年</option>
            <option value="2018">2018年</option>
            <option value="2017">2017年</option>
        </select>

        <select name="year" id="">
            <?php foreach ($select_years as $year) : ?>
                <option value="<?= $year ?>"><?= $year ?>年</option>
            <?php endforeach ?>
        </select>

        <h2>ファイル一覧</h2>
        <?php foreach ($all_files as $file) : ?>
            <p><?= $file ?></p>
        <?php endforeach ?>

        <h2>商品一覧</h2>
        <table class="table table-striped">
            <?php foreach ($items as $item) : ?>
                <tr>
                    <td><?= $item['id'] ?></td>
                    <td><?= $item['name'] ?></td>
                    <td class="text-end">\<?= $item['price'] ?></td>
                    <td>
                        <?php if ($item['is_sale']) : ?>
                            <!-- span.badge.badge-danger -->
                            <sapn class="badge bg-danger">セール中</span>
                        <?php endif ?>
                    </td>
                </tr>
            <?php endforeach ?>
        </table>
    </div>
</body>

</html>