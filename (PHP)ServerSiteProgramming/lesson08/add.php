<?php
//DB接続
require_once 'config.php';
require_once 'connect.php';

session_start();

function insert($pdo, $data) {
    $sql = "INSERT INTO items (code, name, price, stock) 
            VALUES (:code, :name, :price, :stock)";
    $stmt = $pdo->prepare($sql);
    return $stmt->execute($data);
}

function check($posts)
{
    if (empty($posts)) return;
    foreach ($posts as $column => $post) {
        $posts[$column] = htmlspecialchars($post, ENT_QUOTES, 'UTF-8');
    }
    return $posts;
}

function validate($data)
{
    $errors = [];
    if (empty($data['code'])) $errors['code'] = '商品コードを入力してください。';
    if (empty($data['name'])) $errors['name'] = '商品名を入力してください。';
    if (empty($data['price'])) $errors['price'] = '価格を入力してください。';
    if ($data['stock'] < 0) $errors['stock'] = '在庫数を入力してください。';
    return $errors;
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    //サニタイズ
    $posts = check($_POST);
    $errors = validate($posts);

    //セッション登録
    $_SESSION['item'] = $posts;
    $_SESSION['errors'] = $errors;

    if ($errors) {

    } else {
        insert($pdo, $posts);
    }
    header('Location: input.php');
}