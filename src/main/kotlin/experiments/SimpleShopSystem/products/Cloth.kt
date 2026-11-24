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

data class Cloth(
    val type: ClothType,
    val color: Color,
    val size: ClothSize,
)