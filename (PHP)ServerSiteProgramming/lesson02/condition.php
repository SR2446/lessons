<?php
$enemy_hp = 10;
#$attack = 10;
$attack = rand(1,15);
$need = $enemy_hp - $attack;


if($enemy_hp - $attack <=0){
    $message = "Win";
}else{
    $message = "lost,still alive... \n need more : $need ";
}

$distance = rand(0,70)/10;
$move_method = '';
if($distance < 1){
    $move_method = 'walk';
} else if($distance >=1 && $distance <= 5){
    $move_method = 'bicycle';
}else{
    $move_method = 'train';
}

$week_number = date('w');
$week_string = ['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Satureday'];
$week = $week_string[$week_number];
$garbage_day = '';
switch($week_number){
    case 1:
    case 4:
        $garbage_day = '燃えるゴミ';
        break;
    case 6:
        $garbage_day = '燃えないゴミ';
        break;
    default:
        $garbage_day = 'なし';
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attack</title>
</head>
<body>
    <h2>Message</h2>
    <p>Enemy : <?=$enemy_hp?></p>
    <p>You : <?=$attack?></p>
    <p>Result : <?=$message?></p>

    <h2>Move</h2>
    <p>Distance : <?=$distance?></p>
    <p>Move : <?=$move_method?></p>

    <h2>Day</h2>
    <p>Day_num : <?=$week_number?></p>
    <p>Day : <?=$week?></p>
    <p>Garbage : <?=$garbage_day?></p>
</body>
</html>