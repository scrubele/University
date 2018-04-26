from ProductType import ProductType


class BeautyProduct(object):
    """BeautyProduct in the shop. BeautyProduct have the following properties:

    Attributes:
        name: A string representing the name of the thing.
        price: A double representing the price of the thing.
        types: An enum, object of ProductType, representing the type of the thing.
        quantity: An int representing the quantity when things was made.  """
    name, price, quantity = "", 0.0, 0
    types = ProductType

    def __init__(self, name="", price=0.0, types=ProductType, quantity=0):
        """Return a Customer object with 4 attributes: *name*, *price*,
        *type*,*quantity*"""
        self.name = name
        self.price = price
        self.types = types
        self.quantity = quantity

    def reset_values(self, name, price, types, quantity):
        """Reset values of object."""
        self.name = name
        self.price = price
        self.types = types
        self.quantity = quantity

    def __str__(self):
        """Print object."""
        return str("Name: " + self.name + ", price: " + str(self.price) +
              ", type: " + str(self.types) + ", quantity: " + str(self.quantity))

