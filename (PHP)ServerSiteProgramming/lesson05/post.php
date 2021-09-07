<?php
session_start();
//ユーザ情報の初期化(initialize)
$user = [
    'name' => '',
    'email' => '',
    'password' => '',
    'birthday_at' => '',
    'year' => '',
    'month' => '',
    'day' => '',
    'gender' => '',
];
$gender = ['male' => '男', 'female' => '女'];

if (isset($_SESSION['user'])) {
    //Session にユーザがあれば、ユーザ情報をとる
    $user = $_SESSION['user'];
}

function radioChecked($value, $target) {
    //データが同じだったら、checked を返す
    if ($value == $target) return 'checked';
}

function selected($value, $target) {
    //データが同じだったら、selected を返す
    if ($value == $target) return 'selected';
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
    <form action="confirm.php" method="post">
        <h3>氏名</h3>
        <input type="text" name="name" value="<?= $user['name'] ?>">
        <h3>メールアドレス</h3>
        <input type="text" name="email" value="<?= $user['email'] ?>">
        <h3>パスワード</h3>
        <input type="password" name="password">
        <h2>誕生日</h2>
        <select name="year">
            <?php foreach (range(date('Y'), 1900) as $year): ?>
            <option value="<?= $year ?>" <?= selected($user['year'], $year) ?>><?= $year ?></option>
            <?php endforeach ?>
        </select>
        年
        <select name="month">
            <?php foreach (range(1, 12) as $month): ?>
            <option value="<?= $month ?>" <?= selected($user['month'], $month) ?>><?= $month ?></option>
            <?php endforeach ?>
        </select>
        月
        <select name="day">
            <?php foreach (range(1, 31) as $day): ?>
            <option value="<?= $day ?>" <?= selected($user['day'], $day) ?>><?= $day ?></option>
            <?php endforeach ?>
        </select>
        日

        <h3>性別</h3>
        <input type="radio" name="gender" value="male" id="gender_male" <?= radioChecked($user['gender'], 'male')?>>
        <label for="gender_male">男</label>
        <input type="radio" name="gender" value="female" id="gender_female" <?= radioChecked($user['gender'], 'female')?>>
        <label for="gender_female">女</label>

        <h3>質問1</h3>
        <p>このサイトは何で知りましたか？</p>
        <input type="checkbox" name="q1[]" value="1" id="q1_1">
        <label for="q1_1">答え1</label>
        <input type="checkbox" name="q1[]" value="2" id="q1_2">
        <label for="q1_2">答え2</label>
        <input type="checkbox" name="q1[]" value="3" id="q1_3">
        <label for="q1_3">答え3</label>

        <div>
            <input type="submit" value="送信">
            <button type="submit">送信</button>
        </div>
    </form>
</body>

</html>