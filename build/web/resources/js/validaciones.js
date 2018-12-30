
function soloLetras(e) {
    tecla = (document.all) ? e.keyCode : e.which;
    //Tecla de retroceso para borrar, siempre la permite
    if (tecla == 8) {
        return true;
    }

    // Patron de entrada, en este caso solo acepta letras
    patron = /[ A-Za-z\s]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}

function isNumberKey(evt, obj) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    var value = obj.value;
    var dotcontains = value.indexOf(".") != -1;
    if (dotcontains)
        if (charCode == 46)
            return false;
    if (charCode == 46)
        return true;
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;
}