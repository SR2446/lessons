
for (var index = 0; index < 10; index++) {
    
    if (index % 2 == 0) {
        console.log(index);
    }
}

var sum = 0;
for (let index = 1; index <= 1000; index++) {
    
    sum += index;
}
console.log(sum)


var drinks = [
    'ミネラルウォーター', //0
    'コーヒー',          //1
    'ほうじ茶',          //2
    'フルーツティー',     //3
    'むぎ茶'             //4
];

for (let index = 0; index < drinks.length; index++) {
    console.log(drinks[index]);
}

for (const key in drinks) {
    console.log(drinks[key]);
}

drinks.forEach(function(drink, key) {
   console.log(key); 
   console.log(drink); 
});

var items = [
    { id: 1, name: 'ミネラルウォーター', price: 80 },
    { id: 2, name: 'コーヒー', price: 130 },
    { id: 3, name: 'ほうじ茶', price: 120 },
    { id: 4, name: 'フルーツティー', price: 150 },
    { id: 5, name: 'むぎ茶', price: 90 },
];
console.log(items);


var total_price = 0;
for (const key in items) {
    console.log(key);
    console.log(items[key].name);
    console.log(items[key].price);

    total_price+= items[key].price;
}

console.log(total_price);

var items = [
    { id: 1, name: '銅のつるぎ', price: 150 },
    { id: 2, name: '鉄のやり', price: 550 },
    { id: 3, name: '皮のたて', price: 90 },
    { id: 4, name: '鉄のかぶと', price: 850 },
    { id: 5, name: '皮のぼうし', price: 50 },
];

for (var key in items){
    var item = items[key];
    if (item.price <= 300){
        console.log(item.name, item.price);
    }
}

var items = [
    { id: 1, name: 'ミネラルウォーター', price: '80', is_sale: 'true' },
    { id: 2, name: 'ほうじ茶', price: '120', is_sale: 'false' },
    { id: 3, name: 'コーヒー', price: '150', is_sale: 'true' },
    { id: 4, name: '紅茶', price: '130', is_sale: 'false' },
    { id: 5, name: '炭酸水', price: '90', is_sale: 'true' },
];

var item_list = document.getElementById('item_list');
var table = document.createElement('table');
item_list.appendChild(table);

for (var key in items){
    var tr = document.createElement('tr');

    var td_id = document.createElement('td')
    var td_name = document.createElement('td')
    var td_price = document.createElement('td')

    var item = items[key];

    td_id.innerHTML = item.id;
    td_name.innerHTML = item.name;
    td_price.innerHTML = item.price;

    tr.appendChild(td_id);
    tr.appendChild(td_name);
    tr.appendChild(td_price);

    table.appendChild(tr);

}
