<?php
require_once 'Cat.php';
require_once 'Dog.php';

$cat = new Cat('ミケ');
$cat->cry();
//Cat の名前を表示
echo $cat->name;
echo PHP_EOL;
$cat->escape();
echo PHP_EOL;

$dog = new Dog('ぽち');
$dog->cry();
//Dog の名前を表示
echo $dog->name;
echo PHP_EOL;
$dog->follow();
echo PHP_EOL;