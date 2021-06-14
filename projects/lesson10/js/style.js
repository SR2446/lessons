var message = document.getElementById('message');

function add(){
    message.classList.add('active')
}

function remove(){
    message.classList.remove('active');
}

function toggle(){
    message.classList.toggle('active')
}

function replace(){
    message.classList.replace('message','frame')
}

var element = document.getElementById('alert');
element.style.background = '#ff0000';
element.style.color = '#ffffff';
element.style.border = '1px solid #ff0000';
element.style.padding = '10px';
element.style.width = '50px';
element.style.border='5px solid #ff0f00';

var comment = document.createElement('p');
comment.innerHTML='Do whatever you want..';
comment.style.cssText="border:3px solid darkgrey; padding:10px";

var display = document.getElementById('display');
display.appendChild(comment)

function over(element) {
    element.style.background = 'darkseagreen';
    element.style.border = '1px solid white';
    }
    function out(element) {
    element.style.background = 'none';
    element.style.border = '1px solid darkcyan';
}

function over(element){
    element.style.background = "white"
    element.style.color ="darkcyan"
    element.classList.add('slidein')
}

function out(element){
    element.style.background = "darkcyan"
    element.style.color ="white"
    element.classList.add('slidein')
}

function regist() {
    var user ={}
    user.name = document.getElementById('user_name').value;
    user.furigana = document.getElementById('user_furigana').value;
    user.zip = document.getElementById('user_zip').value;
    user.tel = document.getElementById('user_tel').value;

    validateEmpty(user.name,'user_name')
}

function validateEmpty(value, id) {
    if(user.name){
        document.getElementById(id).classList.add('error');
    }else{
        document.getElementById(id).classList.remove('error');
    }
}