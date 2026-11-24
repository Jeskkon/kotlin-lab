package main.experiments.shopSystem

class StorageManager(
    val items: MutableList<Order> = emptyList<Order>().toMutableList(),
){
    fun add(item: Order) {}
    fun remove(item: Order) {}
}