package com.example.idosplashscreen.Model

class UsuarioLogado {
    companion object {
        // static count
        var idUsuario:Int=0
        var nomeUsuario:String = ""

    }

    constructor(id:Int, nome:String){
        idUsuario = id
        nomeUsuario = nome
    }
}