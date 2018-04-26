from BeautyProduct import BeautyProduct
from HairType import HairType


class HairProduct(BeautyProduct):
    __taste = HairType
    __capasity = 0

    def __init__(self, name, price, types, quantity, taste, capasity):
           BeautyProduct.__init__(self, name, price, types, quantity)
           self.__taste = taste
           self.__capasity = capasity

    def reset_values(self, name, price, types, quantity, taste = HairType, capasity = 0):
        """Reset values of object`."""
        BeautyProduct.reset_values(self, name, price, types, quantity)
        self.__taste = taste
        self.__colorCode = capasity

    def __str__(self):
        """Print object."""
        return str("Name: " + self.name + ", price: " + str(self.price) +
              ", type: " + str(self.types) + ", quantity: " + str(self.quantity) +
              ", taste " + str(self.__taste)+", capasity: "+str(self.__capasity))
