



var funcion = (function(){


    return{

        conectar : function(operador, numero){
            alert(operador+" "+ numero);
            fetch("http://localhost:4567/"+operador+'/'+numero).then(response => response.json())
            .then(json => $('#respuesta').html(json))




        }



    }


})();