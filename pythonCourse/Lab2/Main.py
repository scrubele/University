from BeautyProduct import BeautyProduct
from LipstickTaste import LipstickTaste
from Lipstick import Lipstick
from HairProduct import HairProduct
from ProductType import ProductType
from HairType import HairType
from CosmeticDepartment import CosmeticDepartment


if __name__ == "__main__":
    shop = CosmeticDepartment("Watsons", "Stryjska,135", 5)

    beautyProduct = BeautyProduct("Black", 350.0, ProductType.MASCARA, 125)
    shop.add_product(beautyProduct)
    shop.add_product(BeautyProduct("Beet", 35.0, ProductType.BLUSH, 13))
    shop.add_product(HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3, HairType.WAVY, 1000))
    shop.add_product(Lipstick("Love", 100.50, ProductType.GEL, 2, LipstickTaste.COCONUT, 120))
    shop.add_product(BeautyProduct("Tiger", 15.25, ProductType.EYELINER, 115))

    list_p = shop.get_list()
    CosmeticDepartment.display_products(list_p)
    money = int(input("Plz enter how much money do you have? : "))
    choice = int(input("Enter how many products do you want to buy ?(true - only one, false - few) ?  "))
    shop.find_available_products(choice, money)
