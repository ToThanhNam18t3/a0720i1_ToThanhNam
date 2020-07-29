let result;
let a;
alert(a);

function submit1(){
        let amount = document.getElementById("amount");
        let change1 = document.getElementById("change1")
        let change2 = document.getElementById("change2");
        amount = parseInt(amount.value);
        if (change1.value === "USD" && change2.value === "VND"){
           result = amount * 23000;  
        }
        else if (change1.value === "VND" && change2.value === "USD") {
                result = amount / 23000;
        }
        alert(result);
}


