
/**basePath **/
var basePath = "http://localhost:8088/";

function formatDate(timestamp) {
    var date = new Date(timestamp);
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate() < 10 ? '0'+(date.getDate()) : date.getDate();
    return Y+M+D;
}