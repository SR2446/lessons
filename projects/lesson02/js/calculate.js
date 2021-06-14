var hp = 10;
console.log(hp)
console.log(hp+5)

hp=10
console.log(hp-5)

hp=15
console.log(hp*3)

hp=20
console.log(hp/5)

hp=15
console.log(hp%4)

hp=5
++hp;
console.log(hp)

hp=5
--hp;
console.log(hp)

hp=5
hp+=3;
console.log(hp)

hp=5
hp-=2;
console.log(hp)

hp = 6;
var monster_name = 'スライム';
var messsage = monster_name + 'のhpは'　+hp;
console.log(messsage);

var over = (hp>5);
console.log(over)

var under = (hp<=5);
console.log(under)

hp=4
message=(hp<=5) ? 'deadly' : 'safe'
console.log(message)