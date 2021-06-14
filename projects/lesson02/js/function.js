function calculate(x)
{
    var y = x+5
    return y
}

var answer=calculate(5)
console.log(answer)

function totla_prize(price,amount)
{
    // var price = 100 
    // var amount = 2
    var tax = 0.1

    var totla_price = price * amount *(1+ tax)
    return totla_price;
}
var totla_price=totla_prize(100,2);
console.log(totla_price)

function randomNumber(max,min)
{
    var number = Math.floor(Math.random() * (max-min)+1) + min ;
    return number
}

var number = randomNumber(1,6)
console.log(number)


var titleElement=document.getElementById('title')
console.log(titleElement)
console.log(titleElement.innerHTML)
titleElement.innerHTML='dice'

var resultElement = document.getElementById('result')
resultElement.innerHTML= number

var priceElement = document.getElementById('item_price')
var price = priceElement.innerHTML

totla_price = totla_prize( price,number)
console.log (totla_price)

var itemElement = document.getElementById('item_name')
var messageElement = document.getElementById('message')

var item_name = itemElement.innerHTML;

messageElement.innerHTML = item_name + number +'個で'+totla_price+ 'です.'
