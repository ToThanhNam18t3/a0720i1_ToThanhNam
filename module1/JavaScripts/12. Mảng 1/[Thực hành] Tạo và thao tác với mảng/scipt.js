function add() {
    array[x] = document.getElementById("info").value;
    alert("Element: " + array[x] + " Added at index " + x);
    x++;
    document.getElementById("info ").value = "";
}

function display_array() {
    let e = "<hr/>";
    for (let i = 0; i < array.length; i++) {
        e += "Element " + i + " = " + array[i] + "<br/>";
    }
    document.getElementById("result").innerHTML = e;
}