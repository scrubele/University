from BeautyProduct import BeautyProduct
from LipstickTaste import LipstickTaste


class Lipstick(BeautyProduct):
    __taste = LipstickTaste
    __color_code = 0

    def __init__(self, name, price, types, quantity, taste, color_code):
           BeautyProduct.__init__(self, name, price, types, quantity)
           self.__taste = taste
           self.__color_code = color_code

    def reset_values(self, name, price, types, quantity, taste = LipstickTaste, color_code = 0):
        """Reset values of object`."""
        BeautyProduct.reset_values(self, name, price, types, quantity)
        self.__taste = taste
        self.__colorCode = color_code

    def __str__(self):
        """Print object."""
        return str("Name: " + self.name + ", price: " + str(self.price) +
              ", type: " + str(self.types) + ", quantity: " + str(self.quantity) +
               ", taste " + str(self.__taste)+", color_code: "+str(self.__color_code))
