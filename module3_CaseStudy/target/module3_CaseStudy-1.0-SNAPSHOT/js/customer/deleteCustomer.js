$(document).ready(function () {
    $('.close').on('click', function () {
        $('.modal').hide();
    });
})

function showModalDelete(url) {
    $('#deleteCustomer').attr("href", url);
    $('.modal').show();
}

function closeModal() {
    $('.modal').hide();
}