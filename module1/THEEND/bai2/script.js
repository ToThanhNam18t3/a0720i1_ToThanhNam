let value1 = parseInt(prompt('Nhập vào số đầu tiên: '));
let value2 = parseInt(prompt('Nhập vào số thứ 2: '));

document.write("Number 1 :" + value1 + "</br>");

document.write("Number 2 : " + value2 + "</br>"+"</br>"+ "</br>");

//Kiểm tra ước số đầu tiên

do{
    if(value1 <= 0) {
        document.write('Vui lòng nhập giá trị dương !');
    } 
} while( value1 <= 0){
    let total = 0;
    for(let i = 1; i < value1; i++){
        if(value1 % i == 0){
            document.write("Ưoc số là : " + i +"</br>");
            total += i;
        }
    }
    document.write("Tổng các ước số là : " +  total + "</br>");
    if(total === value2) {
        document.write('Hai số vừa nhập là số thân thiết !');
    } else {
        document.write("Hai số vừa nhập không phải là số thân thiết !");
    }
}





