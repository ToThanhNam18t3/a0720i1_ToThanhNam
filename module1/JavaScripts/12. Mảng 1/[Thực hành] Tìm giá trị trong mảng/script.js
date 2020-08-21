let btn = document.getElementById('btn');
let printed = document.getElementById('printed');

let a = ['1', '2','3','4'];

btn.addEventListener('click', function(search){
    let text = document.getElementById('text').value;
    printed.innerHTML ="";
    
    for(let  i = 0; i <= a.length; i++) {
        if (text == a[i]){
            printed.innerHTML = "Found " + a[i] + "at " + i;
            return;
        } else {
            printed.innerHTML = "Not found";
        }
    }
})
