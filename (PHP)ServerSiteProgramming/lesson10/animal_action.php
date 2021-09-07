<?php
require_once 'Animal.php';

//インスタンス作成（さくせい）
$animal = new Animal('タロー');
$animal->speak('こんにちは');

//名前をきめる
$animal->name = 'ぽち';
$animal->run();

// $animal_2 = new Animal();
// $animal_2->name = 'タロー';
// $animal_2->run();