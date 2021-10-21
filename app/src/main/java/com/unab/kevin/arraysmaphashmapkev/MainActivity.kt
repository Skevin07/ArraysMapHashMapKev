package com.unab.kevin.arraysmaphashmapkev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        metodoMap()
        //metodoArray()

    }

    fun metodoArray()
    {
        //Hablaremos de array integes

        //inicializamos la array entera
        val intA = intArrayOf(1,4,22,48,128,331)
        println("Mostramos el valor que tiene la posicion 0: " +intA[0])


        //asignamos un nuevo valor a la posicion 0
        intA[0] = 8
        println("Mostramos el nuevo valor asignado a la posicion 0: "+intA[0])

        //mostrando el tamaño de la array
        println(intA.size)

        //array de tipo booleano
        val booleanA = booleanArrayOf(true,false,true,false,true)
        println(booleanA[3])


        //cambiando la propiedad del booleao
        booleanA[3]=true
        println(booleanA[3])

        //Una forma diferente de llamar a los double
        val doubleA = DoubleArray(3){10.0}
        println("El valor que tiene la array double es su posicion 1: " +doubleA[0])

        //Utilizando un String junto con un array
        val StringA = arrayOf("Kevin","Jackeline","Rachelita","Gloria","barbara")
        println("Nombre: " +StringA[0])


        //Que pasa si quiero recorrertodo esos datos
        for (i in StringA)
        {
            println(i)
        }


        //otro tipo de implemmentacion de la array
        val nombre = "Noda"
        val apellido = "Callaguanca"
        val estudiante = "Arquitecto"
        val edad = "21"
        //Ponemos el 21 como un array porque el array que vamos a declarar va hacer de tipo strig
        //por esa razon.


        //Creamos el array para la lista que acabamos de hacer
        val miArrayy = arrayListOf<String>()


        //Aqui es el como añadimos un valor a un contenedor de la lista que ya tenemos
        miArrayy.add(nombre)
        miArrayy.add(apellido)
        miArrayy.add(estudiante)
        miArrayy.add(edad)

        println(miArrayy)

        //Para añadir un conjuto de datos a la array
        miArrayy.addAll(listOf("Programacion IV", "UNAB"))
        println(miArrayy)

        //Para la modificacion de datos donde queremos asignarle un nuevo valor
        miArrayy[5] = "Universidad Dr. Andres Bello"
        println(miArrayy)


        //Para la eliminacion de los datos
        miArrayy.removeAt(4)
        println(miArrayy)


        //Para recorrer la array por medio de un forEach
        miArrayy.forEach {
            println(it)
        }


        //Tambien tenemos otras operaciones con los arrays que debemos tener el cuenta

        //Este nos permite contar la cantidad de elementos que tiene
        println(miArrayy.count())
        //Este nos permite limpiar
        println(miArrayy.clear())
        //Vemos si se verifico
        println(miArrayy.count())

    }

    fun metodoMap()
    {

        //OJO ESTUDIAR MEJOR ESTA FUNCION

        //sintaxis

        var miMap:Map<String, Int> = mapOf()
        println(miMap)

        //añadir elemntos en la array
        miMap = mutableMapOf("Josue" to 1, "Laura" to 2, "Mauricio" to 5)
        println(miMap)

        //añadir un solo valor
        miMap["rafa"] = 7
        miMap.put("Yesenia", 8)
        println(miMap)


        //Para actualizar un dato
        miMap.put("Oscar",1)
        println(miMap)

        //El como acceder a los datos
        println(miMap["Oscar"])


        //El como remover datos
        miMap.remove("Oscar")
        println(miMap)

    }


    fun metodoHashMap()
    {

        val nombre = "More"
        val apellido = "Mira"
        val estudiante = "Tecnico "
        val edad = "20"

        //Creamos el hashmap

        /*Que es un HashMap ? este es una estructura de datos que se le almacenan en un listado de
         de claves y su respectivo valor*/
        val miHashMap = hashMapOf<Int,String>()
        miHashMap[1]=nombre
        miHashMap[2] = apellido
        miHashMap[3] = estudiante
        miHashMap[4] = edad

        val miHM = miHashMap.get(1)
        println(miHM)



    }



}