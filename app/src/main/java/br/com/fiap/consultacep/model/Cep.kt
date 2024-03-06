package br.com.fiap.consultacep.model

data class Cep(
    val cep: String = "",
    val rua: String = "",
    val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""
)