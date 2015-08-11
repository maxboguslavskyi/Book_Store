function submitBookForm() {
    var name = $('#name').val().trim();
    var code = $('#code').val();
    var price = $('#price').val();
    var authors = $('#authors').val().trim();
    var isbn = $('#isbn').val();
    var publisher = $('#publisher').val().trim();
    var publishedOn = $('#publishedOn').val();

    if (name.length == 0) {
        alert('Please enter name');
        $('#name').focus();
        return false;
    }

    if (code.length == 0 || code.length > 25) {
        alert('Please enter proper code');
        $('#code').focus();
        return false;
    }

    if (price.length == 0 || price.length > 5) {
        alert('Please enter proper price');
        $('#price').focus();
        return false;
    }

    if (authors.length == 0) {
        alert('Please enter authors');
        $('#authors').focus();
        return false;
    }

    if (isbn.length == 0 || isbn.length > 25) {
        alert('Please enter proper isbn');
        $('#isbn').focus();
        return false;
    }

    if (publisher.length == 0) {
        alert('Please enter publisher');
        $('#publisher').focus();
        return false;
    }

    if (publishedOn.length == 0) {
        alert('Please enter proper publishedOn');
        $('#publishedOn').focus();
        return false;
    }
    return true;
}
