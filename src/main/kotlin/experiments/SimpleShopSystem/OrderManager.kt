package main.experiments.shopSystem

import java.util.Date

enum class Status{
    PENDING,
    IN_PROGRESS,
    CONFIRMED,
    COMPLETED,
}

enum class ItemType{
    CLOTH,
    ELECTRONICS,
    BOOKS,
}

data class Item(
    val id: Int,
    val type: ItemType,
)
data class event(
    val type: Status,
    val date: Date,
)
data class Order(
    val id: Int,
    var status: Status = Status.PENDING,
    val item: Item,
    private val history: MutableList<Chron> = emptyList<Chron>().toMutableList(),
){
    fun changeStatus(status: STATUS){
        this.status = status
        this.history += Chron(event = status, timestamp = Date())
    }
}






class OrderManager(
    storage: StorageManager,
    val orders: MutableList<Order> = mutableListOf<Order>().toMutableList(),
){

    fun newOrder(order: Order) {
        //удалить из склада, добавить в orders
    }

    fun cancelOrder(id: Int) {
        //удалить из orders, добавить в склад
    }

    fun getStatus(order: Order): STATUS {
        return order.status
    }
}