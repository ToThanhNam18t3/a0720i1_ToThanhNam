$(document).ready(function() {
    $('#search').click(function(event) { // get value from button SEARCH
        let customerName = $('#customerName').val(); // get value from input
        $.post('customer', { // Mapping urlPatterns
            name : customerName,
            action: "search"
        }, function(responseText) {
            $('#result').html(responseText); // where display result
        });
    });
});

function showModalDelete() {
    $('#deleteCustomer').attr("href");
    $('.modal').show();
}



