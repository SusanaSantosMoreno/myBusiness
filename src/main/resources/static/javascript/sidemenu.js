
$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
        $(this).toggleClass('active');
    });
});

$('li > a').click(function() {
    $('li').removeClass();
    $(this).parent().addClass('active');
});
