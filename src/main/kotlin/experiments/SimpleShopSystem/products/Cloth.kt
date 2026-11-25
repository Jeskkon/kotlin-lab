package main.experiments.shopSystem.products

enum class Color{
    RED,
    BLUE,
    YELLOW,
    BLACK,
    WHITE,
}

enum class ClothType{
    JACKET,
    DRESS,
    COAT,
}

enum class ClothSize{
    X,
    XL,
    M,
    S,
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

data class Cloth(
    val type: ClothType,
    val color: Color,
    val size: ClothSize,
)