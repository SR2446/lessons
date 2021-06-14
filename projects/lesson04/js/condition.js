var distance = 1;
var message = '';
if (distance < 1) {
    message = '徒歩';
} else if (distance >= 1 && distance < 5) {
    message = '自転車';
} else {
    message = '電車'
}

console.log(message)

var money = 100000;
var has_job = true;
var is_blacklist = true;
var age = 18;
if (money >= 30000000 || has_job) {
    message = "ローンで家を買おうかな？"
    if (is_blacklist || (age >= 60 && age < 20)) {
        message += "\n銀行員「お金貸せません」"
    } else {
        message += "\n銀行員「ローンできます」"
    }
} else {
    message = '賃貸でがんばります'
}
console.log(message);

//switch

var weekday = '月';
var type = '';
switch (weekday) {
    case '月':
    case '金':
        type = '燃えるゴミ';
        break;
    case '水':
        type = '燃えないゴミ';
        break;
    default:
        type = '回収なし';
        break;
}
console.log(weekday);
console.log(type);

var today = new Date();

console.log(today);

var year = today.getFullYear();
console.log(year);

var month = today.getMonth() + 1;
console.log(month);

var day = today.getDate();
console.log(day);

var weekday = today.getDay();
console.log(weekday);


switch (weekday) {
    case 1:
    case 5:
        type = '燃えるゴミ';
        break;
    case 3:
        type = '燃えないゴミ';
        break;
    default:
        type = '回収なし';
        break;
}
console.log(weekday);

var dateString = year + '年' + month + '月' + day + '日'

var weekdayString = ''
if (weekday == 0) {
    weekdayString = '日';
} else if (weekday == 1) {
    weekdayString = '月'
} else if (weekday == 2) {
    weekdayString = '火'
} else if (weekday == 3) {
    weekdayString = '水'
} else if (weekday == 4) {
    weekdayString = '木'
} else if (weekday == 5) {
    weekdayString = '金'
} else if (weekday == 6) {
    weekdayString = '土'
}

dateString += '(' + weekdayString + ')'
console.log(dateString)

document.getElementById('today').innerText = dateString;
document.getElementById('garbage').innerText = type;
setInterval(function () {
    var today =new Date();
    var year = today.getFullYear();
    var month = today.getMonth() + 1;
    var day = today.getDate();
    var hour = today.getHours();
    var minute = today.getMinutes();
    var second = today.getSeconds();
    var weekday = today.getDay();

    //var weekdayString = dayOfString(weekday)
    var today = year+"/"+month +"/"+day;
    var time =hour+":"+minute+":"+second;

    document.getElementById('date').innerHTML = today;
    document.getElementById('clock').innerHTML = time;
}, 1000)