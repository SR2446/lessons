<?php
class Animal {
    public $name;
    public $sound;

    //コンストラクタ
    function __construct($name)
    {
        //名前をつける
        $this->name = $name;
    }

    public function cry()
    {
        echo $this->sound;
        echo PHP_EOL;
    }

    public function speak($message)
    {
        echo $message;
        echo PHP_EOL;
    }

    public function run()
    {
        echo "{$this->name}が走りました。";
        echo PHP_EOL;
    }

}