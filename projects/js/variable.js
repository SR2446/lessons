/**
 * JavaScript の練習
 * 
 */
// alert('Alert!!!!');
var monster = 'スライム';
console.log(monster);

var price = 260;
var amount = 7 ;
var tax_rate = 0.1;

var total_price = price * amount * (1+ tax_rate);
console.log(total_price);

var hp = 3;
console.log(hp + 1);

 hp = 4;
console.log(hp - 1);

 hp = 6;
console.log(hp * 2);

 hp = 4;
console.log(hp / 4);

 hp = 11;
console.log(hp % 3);

var hp = 3;
++hp;
console.log(hp);

 hp = 6;
--hp;
console.log(hp);

hp = 6;
hp+=5;
console.log(hp);

hp = 6;
var monster_name = 'スライム';
var messsage = monster_name + 'のhpは'　+hp;
console.log(messsage);

var calculate_message = 'お会計は'+ total_price + '円です';
console.log(calculate_message);

