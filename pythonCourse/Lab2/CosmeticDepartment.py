
class CosmeticDepartment(object):
    __name, __address_of_shop, __floor, __product_list = "", "", 0, []

    def __init__(self, name, address_of_shop, floor):
        """Return a Customer object with 4 attributes: *name*, *price*,
        *type*,*quantity*"""
        self.__name = name
        self.__address_of_shop = address_of_shop
        self.__floor = floor
        self.__product_list = []

    def add_product(self, beauty_product):
        self.__product_list.append(beauty_product)

    def to_string(self):
        """Print object."""
        print("Name: " + self.__name + ", address: " + self.__address_of_shop +
              ", type: " + str(self.__floor))

    def find_available_products(self, choice, money):
        available_for_customer_products = []
        count_of_products = 0
        sum = 0
        if choice == 1:
            self.__product_list.sort()
            for beauty_product in self.__product_list:
                if beauty_product.quantity > 0 and beauty_product.price < money:
                    available_for_customer_products.append(beauty_product)
                    count_of_products += 1

        else:
            self.__product_list.sort(reverse=True)
            for beauty_product in self.__product_list:
                if beauty_product.quanity > 0:
                    sum += beauty_product.price
                if sum < money:
                    available_for_customer_products.append(beauty_product)
                    count_of_products += 1
        if count_of_products > 0:
            self.display_products(available_for_customer_products)
        else:
            print("Ohh, no... You can not buy any product. Sorry :(")

        return available_for_customer_products

    def get_list(self):
        return self.__product_list

    @staticmethod
    def display_products(p_list):
        p_list.sort(reverse=True)
        for beauty_product in p_list:
            print(beauty_product)

