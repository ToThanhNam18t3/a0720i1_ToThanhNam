class Book {
    constructor(bookID, year, bookName, number, isEmpty) {
        this.bookID = bookID;
        this.year = year;
        this.bookName = bookName;
        this.number = number;
        this.isEmpty = function () {
            if (this.number == 0) {
                this.isEmpty = true;
            } else {
                this.isEmpty = false;
            }
        }
    }
    getbookID() {
        this.bookID;
    }
    getYear() {
        this.getYear;
    }
    getbookName() {
        this.getbookName;
    }
    getNumber() {
        this.getNumber;
    }
}


function save() {
    let fullname = document.getElementById('fullname').value;
    let email = document.getElementById('email').value;
    let phone = document.getElementById('phone').value;
    let adress = document.getElementById('adress').value;
    let gender = "";
    if (document.getElementById('male').checked) {
        gender = document.getElementById('male').value;
    } else if (document.getElementById('female').value) {
        gender = document.getElementById('female').value
    }
    if (_.isEmpty(fullname)) {
        document.getElementById('fullname-error').innerHTML = "Vui lòng nhập họ và tên !";
    }
    else if (fullname.trim().length <= 2) {
        document.getElementById('fullname-error').innerHTML = "Họ và tên không được nhỏ hơn 2 ký tự!";
    } else if (fullname.trim().length >= 50) {
        document.getElementById('fullname-error').innerHTML = "Họ và tên không được lớn hơn 50 ký tự !"
    }
    else {
        document.getElementById('fullname-error').innerHTML = "";
    }
    //Validation Mail
    if (_.isEmpty(email)) {
        document.getElementById('email-error').innerHTML = "Vui lòng nhập Email!";
    } else if (!emailValid(email)) {
        document.getElementById('email-error').innerHTML = "Email không đúng định dạng";
    } else {
        document.getElementById('email-error').innerHTML = "";
    }

    if (fullname && email) {
        let students = [];
        students.push({
            fullname: fullname,
            email: email,
        });

        let tableContent = `<tr>
        <td class="">STT</td>
        <td class="">Họ và tên</td>
        <td class="">Email</td>
        <td class="">Điện thoại</td>
        <td class="">Địa chỉ</td>
    </tr>`

        students.forEach((student,index) => {
            index++;
            // let genderLabel == student.gender === 1 ? 'Nam':'Nữ';
            tableContent += `<tr>
        <td class="">${index}</td>
        <td class="">${student.fullname}</td>
        <td class="">${student.email}</td>
        <td class="">Điện thoại</td>
        <td class="">Địa chỉ</td>
    </tr>`
        })

        document.getElementById('grid-students').innerHTML = tableContent;
    }
}

function emailValid(email) {
    return /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(email);
}





