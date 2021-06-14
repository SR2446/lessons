
var data = [
    [1,2,3,4,5,],
    [6,7,8,9,10,],
]
console.log(data)

var rows = [
    [90, 78, 82,],
    [62, 70, 68,],
    [68, 88, 72,],
]
console.log(rows);

console.log(data[1][2])
console.log(rows[2][2])
console.log(rows[1])

var users = [
    { id: 1, name: 'akbal', email: 'akbal@example.com', tel: '03-1111-2222' },
    { id: 2, name: 'basno', email: 'basno@example.com', tel: '090-3333-5555' },
    { id: 3, name: 'dony', email: 'dony@example.com', tel: '050-1234-5678' },
];
console.log(users);

var drinks = [
    ['アイスコーヒー', 'ミネラルウォーター', 'ほうじ茶',],
    ['紅茶', '牛乳', 'アイスコーヒー',],
    ['烏龍茶', 'コーラ', 'オレンジジュース',],
    ['ミネラルウォーター', 'コーラ', 'ほうじ茶',],
]
console.log(drinks[0][0],drinks[1][2])

var items = [
    { id: 1, name: 'ミネラルウォーター', price: '80', is_sale: 'true' },
    { id: 2, name: 'ほうじ茶', price: '120', is_sale: 'false' },
    { id: 3, name: 'コーヒー', price: '150', is_sale: 'true' },
    { id: 4, name: '紅茶', price: '130', is_sale: 'false' },
    { id: 5, name: '炭酸水', price: '90', is_sale: 'true' },
]
console.log(items)

items.push(
    { id: 6, name: 'オレンジジュース', price: '120', is_sale: 'false' },
)
console.log(items)

