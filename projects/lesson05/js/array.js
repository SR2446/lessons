
var array1 = [];
console.log(array1);

var monsters = ['スライム', 'キメラ', 'ノーム'];
console.log(monsters);

var drinks = ['ミネラルウォーター', '紅茶', 'コーラ', 'ほうじ茶'];
console.log(drinks);

console.log(monsters[1]);
console.log(drinks[2]);

console.log(monsters.length);

console.log(drinks.length);

//add
monsters.push('ゾンビ');
drinks.push('コーヒー');

console.log(monsters);
console.log(drinks);

//remove
monsters.pop();
drinks.pop();

console.log(monsters);
console.log(drinks);

//先頭を削除(Delete the beginning)
monsters.shift();
drinks.shift();

console.log(monsters);
console.log(drinks);

//先頭に追加(add the beginning)
monsters.unshift('スライム');
drinks.unshift('ミネラルウォーター');

console.log(monsters);
console.log(drinks);

//2番目に追加
monsters.splice(1, 0, 'ドラゴン');
console.log(monsters);

drinks.splice(1, 0, 'オレンジジュース');
console.log(drinks);

//2番目を削除
monsters.splice(1, 1);
console.log(monsters);

drinks.splice(1, 2);
console.log(drinks);

//search
console.log(monsters.indexOf('スライム'));

console.log(drinks.indexOf('ほうじ茶'));




var today = new Date();
var year = today.getFullYear();
var month = today.getMonth() + 1;
var day = today.getDate();

var dateString = year + '年' + month + '月' + day + '日'

var weekday1 = today.getDay();

var weekday = new Array(7);
weekday[0] = "Sunday";
weekday[1] = "Monday";
weekday[2] = "Tuesday";
weekday[3] = "Wednesday";
weekday[4] = "Thursday";
weekday[5] = "Friday";
weekday[6] = "Saturday";

dateString += '(' + weekday[weekday1] + ')'
console.log(dateString)

document.getElementById('today').innerText = dateString;

var items = []
function registItem(){
    console.log('registItem!!');
    var item_name = document.getElementById('item_name').value;
    items.push(item_name)
    console.log(items);

    var itemElement = document.createElement('p')
    itemElement.innerHTML = item_name
    console.log(itemElement)

    var itemListElement= document.getElementById('itemList')
    itemListElement.appendChild(itemElement)
}
//document.getElementById('output').innerText = item_name;

function resetItem(){
    items=[]
    console.log(items);
    var itemListElement = document.getElementById('itemList')
    itemListElement.innerHTML = ''
}

var monstersElement = document.getElementById('monsters')

var monster1 = document.createElement('img')
monster1.src = 'images/monster_006.png'
monstersElement.appendChild(monster1)

var monster2 = new Image()
monster2.src='images/monster_022.png'
monstersElement.appendChild(monster2)