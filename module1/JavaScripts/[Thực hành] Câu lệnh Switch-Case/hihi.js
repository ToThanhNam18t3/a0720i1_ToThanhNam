let count;
let printed;

function counting() {

    count = document.getElementById("countDays").value;
    

    switch(count){
        case '1':
        case '3':
        case '5':
        case '7':
        case '8':
        case '10':
        case '12':
            document.getElementById("print").innerHTML = "Số ngày của tháng " + count + " là: 31 ngày " ;
            break;
        case '2':
        case '4':
        case '6':
        case '9':
        case '11':
            document.getElementById("print").innerHTML = "Số ngày của tháng " + count + " là: 30 ngày "; 
            break;
        default:
            document.getElementById("print").innerHTML = "Vui lòng nhập từ tháng 1 - 12 đi, có bị ngu không mà nhập số khác ???"
        }
}


 