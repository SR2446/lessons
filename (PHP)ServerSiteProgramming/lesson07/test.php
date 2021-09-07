<?php
$db_name = "my_shop";
$host = "localhost";
$user_name = "root";
$password = "";

//DSN を定義
$dsn = "mysql:dbname={$db_name};host{$host};charset=utf8;";



try{
    $pdo = new PDO($dsn,$user_name,$password);
    echo "success";
}catch (PDOException $e)
{
    echo "failed";
    echo $e->getMessage();
}
echo PHP_EOL;

//PDOの中を確認
var_dump($pdo);

$sql = "SELECT * FROM users LIMIT 10;";
//SQL を実行
$stmt = $pdo->query($sql);
var_dump($stmt);
$users = $stmt->fetchAll(PDO::FETCH_ASSOC);
var_dump($users);

?>

/*while ($row = $query -> fetch(PDO::FETCH_ASSOC))
{
    $rows[] = $row;
}
if ($rows)
{
    foreach($rows as $row)
    {
        echo "{$row["id"]} {$row["name"]}".PHP_EOL;
    }
}
if ($rows)
{
    foreach ($rows as $row)
    {
        var_dump($row);
    }
}
*/

