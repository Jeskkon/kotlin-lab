package main.experiments.shopSystem

fun main(){
    val storageManger = StorageManager(mutableListOf())
    val orderManager = OrderManager(storageManger)
}