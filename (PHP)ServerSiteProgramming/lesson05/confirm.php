<?php
//セッション開始
session_start();

//ユーザ情報の初期化(initialize)
$user = [
    'name' => '',
    'email' => '',
    'password' => '',
    'birthday_at' => '',
    'gender' => '',
];
$gender = ['male' => '男', 'female' => '女'];

if (!empty($_POST)) {
    //POSTデータを受け取ったら $user にいれる
    $user = $_POST;
    //Session に登録
    $_SESSION['user'] = $user;

    //DB（データベース）に入れるために処理
    $year = (int) $user['year'];
    $month = (int) $user['month'];
    $day = (int) $user['day'];
    //date型
    $user['birthday_at'] = date("{$year}/{$month}/{$day}");
}

//validate
if ($errors = validate($user)) {
    //エラーがあればリダイレクト（転送） post.php 戻す
    header('Location: post.php');
    exit;
}

//validate(データチェック)
function validate($user)
{
    //エラー
    $errors = [];
    //入力が必要なカラム
    $columns = [
        'name',
        'email',
        'password',
        'gender',
        'birthday_at'
    ];
    foreach ($columns as $column) {
        if (empty($user[$column])) {
            $errors[$column] = true;
        }
    }
    return $errors;
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
    <h3>氏名</h3>
    <p><?= $user['name'] ?></p>
    <h3>メールアドレス</h3>
    <p><?= $user['email'] ?></p>
    <h3>性別</h3>
    <p><?= $gender[$user['gender']] ?></p>
    <h3>誕生日</h3>
    <p>
        <?= date('Y年m月d日', strtotime($user['birthday_at'])) ?>
    </p>
    <p><a href="post.php">戻る</a></p>
</body>

</html>