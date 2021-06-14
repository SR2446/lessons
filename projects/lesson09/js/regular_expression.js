
function regist() {
    console.log('regist');
    var user_name = document.getElementById('user_name').value;
    var message = checkAlphabet(user_name);
    document.getElementById('error_user_name').innerHTML = message;
    console.log(message);

    var user_furigana = document.getElementById('user_furigana').value;
    var message = checkHiragana(user_furigana);
    document.getElementById('error_user_furigana').innerHTML = message;

    var user_zip = document.getElementById('user_zip').value;
    var message = checkZipCode(user_zip);
    document.getElementById('error_user_zip').innerHTML = message;

    var user_tel = document.getElementById('user_tel').value;
    var message = checkPhoneNumber(user_tel);
    document.getElementById('error_user_tel').innerHTML = message;
}

function checkZipCode(value) {
    var pattern = /[0-9]{3}-?[0-9]{4}/

    var message = "";
    var is_match = value.match(pattern)
    if (!is_match) {
        message = '郵便番号がただしくありません'
    }
    return message;
}

function checkPhoneNumber(value) {
    var pattern = /[0-9]{2,3}-?[0-9]{4}-?[0-9]{4}/

    var message = "";
    var is_match = value.match(pattern)
    if (!is_match) {
        message = '電話番号がただしくありません'
    }
    return message;
}

//ひらがな
function checkHiragana(value) {
    var pattern = /^[\u3040-\u309F　]*$/

    var message = "";
    var is_match = value.match(pattern)
    if (!is_match) {
        message = 'ひらがなで入力してください'
    }
    return message;
}

//アルファベット
function checkAlphabet(value) {
    var pattern = /^[a-zA-Z ]*$/

    var message = "";
    var is_match = value.match(pattern)
    if (!is_match) {
        message = 'アルファベットで入力してください'
    }
    return message;
}
