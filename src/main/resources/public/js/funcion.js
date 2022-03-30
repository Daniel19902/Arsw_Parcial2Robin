



var funcion = (function(){


    return{

        conectar : function(operador, numero){
            alert(operador+" "+ numero);
            fetch("http://ec2-3-87-102-157.compute-1.amazonaws.com:4567/"+operador+'/'+numero).then(response => response.json())
            .then(json => $('#respuesta').html(json))




        }



    }


})();